// AccountTypeControllerImpl.java (Implementation)
package com.example.online_banking_system.controller.impl;

import com.example.online_banking_system.controller.AccountTypeController;
import com.example.online_banking_system.model.AccountType;
import com.example.online_banking_system.service.AccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/account-types")
public class AccountTypeControllerImpl implements AccountTypeController {

    private final AccountTypeService accountTypeService;

    @Autowired
    public AccountTypeControllerImpl(AccountTypeService accountTypeService) {
        this.accountTypeService = accountTypeService;
    }

    @Override
    @GetMapping
    public List<AccountType> getAllAccountTypes() {
        return accountTypeService.getAllAccountTypes();
    }

    @Override
    @GetMapping("/{id}")
    public AccountType getAccountTypeById(@PathVariable Long id) {
        return accountTypeService.getAccountTypeById(id);
    }

    @Override
    @PostMapping
    public AccountType createAccountType(@RequestBody AccountType accountType) {
        return accountTypeService.createAccountType(accountType);
    }

    @Override
    @PutMapping("/{id}")
    public AccountType updateAccountType(@PathVariable Long id, @RequestBody AccountType accountType) {
        return accountTypeService.updateAccountType(id, accountType);
    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteAccountType(@PathVariable Long id) {
        accountTypeService.deleteAccountType(id);
    }
}
