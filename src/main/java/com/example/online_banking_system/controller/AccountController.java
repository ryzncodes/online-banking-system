// AccountController.java (Interface)
package com.example.online_banking_system.controller;

import com.example.online_banking_system.model.Account;
import java.util.List;

public interface AccountController {
    List<Account> getAllAccounts();

    Account getAccountById(Long id);

    Account createAccount(Account account);

    Account updateAccount(Long id, Account account);

    void deleteAccount(Long id);
}
