package Pegas.seminar5.example1.service;

import Pegas.seminar5.example1.entity.Account;
import Pegas.seminar5.example1.exception.AccountNotFoundException;
import Pegas.seminar5.example1.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TransferService {
    private final AccountRepository accountRepository;

    public void transferMoney(Long idSender, Long idReceiver, BigDecimal money) throws AccountNotFoundException {
        Account sender = accountRepository.findById(idSender).orElseThrow(()-> new AccountNotFoundException("account not found"));
        Account receiver = accountRepository.findById(idReceiver).orElseThrow(()-> new AccountNotFoundException("account not found"));
        BigDecimal senderNewAmount = sender.getAmount().subtract(money);
        BigDecimal receiverNewAmount = receiver.getAmount().add(money);
        accountRepository.changeAmount(idSender, senderNewAmount);
        accountRepository.changeAmount(idReceiver, receiverNewAmount);
    }

    public Iterable<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    public List<Account> findAccountByName(String name){
        return accountRepository.findAccountByAccountName(name);
    }
}
