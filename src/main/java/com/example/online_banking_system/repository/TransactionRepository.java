package com.example.online_banking_system.repository;

import java.util.List;
import com.example.online_banking_system.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Custom query methods can be added here
    List<Transaction> findByAccountId(Long accountId); // get transactions for a specific account
}
