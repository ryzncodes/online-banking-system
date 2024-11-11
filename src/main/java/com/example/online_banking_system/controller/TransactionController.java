// TransactionController.java (Interface)
package com.example.online_banking_system.controller;

import com.example.online_banking_system.model.Transaction;
import java.util.List;

public interface TransactionController {
    List<Transaction> getAllTransactions();

    Transaction getTransactionById(Long id);

    List<Transaction> getTransactionsByAccountId(Long accountId);

    Transaction createTransaction(Transaction transaction);

    Transaction updateTransaction(Long id, Transaction transaction);

    void deleteTransaction(Long id);
}
