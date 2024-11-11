// TransactionService.java (Interface)
package com.example.online_banking_system.service;

import com.example.online_banking_system.model.Transaction;
import java.util.List;

public interface TransactionService {
    List<Transaction> getAllTransactions();

    Transaction getTransactionById(Long id);

    List<Transaction> getTransactionsByAccountId(Long accountId); // Custom method

    Transaction createTransaction(Transaction transaction);

    Transaction updateTransaction(Long id, Transaction transaction);

    void deleteTransaction(Long id);
}
