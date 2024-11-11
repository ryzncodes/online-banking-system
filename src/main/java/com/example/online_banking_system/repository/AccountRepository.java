package com.example.online_banking_system.repository;

import com.example.online_banking_system.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    // You can add custom query methods if needed
    Account findByAccountNumber(String accountNumber);
}
