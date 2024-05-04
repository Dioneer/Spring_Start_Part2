package Pegas.seminar5.example1.repository;

import Pegas.seminar5.example1.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAccountByAccountName(String name);

    @Modifying(clearAutomatically = true)
    @Query("update Account a set a.amount = :amount WHERE a.id = :id")
    void changeAmount(Long id, BigDecimal amount);
}
