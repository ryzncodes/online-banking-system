package com.example.online_banking_system.service;

import com.example.online_banking_system.model.Account;
import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();

    Account getAccountById(Long id);

    Account createAccount(Account account);

    Account updateAccount(Long id, Account account);

    void deleteAccount(Long id);
}
