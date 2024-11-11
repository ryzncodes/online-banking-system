// AccountTypeController.java (Interface)
package com.example.online_banking_system.controller;

import com.example.online_banking_system.model.AccountType;
import java.util.List;

public interface AccountTypeController {
    List<AccountType> getAllAccountTypes();

    AccountType getAccountTypeById(Long id);

    AccountType createAccountType(AccountType accountType);

    AccountType updateAccountType(Long id, AccountType accountType);

    void deleteAccountType(Long id);
}
