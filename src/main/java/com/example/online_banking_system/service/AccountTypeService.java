package com.example.online_banking_system.service;

import com.example.online_banking_system.model.AccountType;
import java.util.List;

public interface AccountTypeService {
    List<AccountType> getAllAccountTypes();

    AccountType getAccountTypeById(Long id);

    AccountType createAccountType(AccountType accountType);

    AccountType updateAccountType(Long id, AccountType accountType);

    void deleteAccountType(Long id);
}
