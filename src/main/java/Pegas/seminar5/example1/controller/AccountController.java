package Pegas.seminar5.example1.controller;

import Pegas.seminar5.example1.dto.TransferRequest;
import Pegas.seminar5.example1.entity.Account;
import Pegas.seminar5.example1.exception.AccountNotFoundException;
import Pegas.seminar5.example1.service.TransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {
    private final TransferService transferService;

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest transferRequest) throws AccountNotFoundException {
        transferService.transferMoney(transferRequest.getSenderCountId(), transferRequest.getReceiverCountId(), transferRequest.getAmount());
    }

    @GetMapping("/account")
    public Iterable<Account> getAccount() {
        return transferService.getAllAccounts();
    }

}
