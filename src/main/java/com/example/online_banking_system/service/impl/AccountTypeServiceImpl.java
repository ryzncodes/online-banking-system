package com.example.online_banking_system.service.impl;

import com.example.online_banking_system.model.AccountType;
import com.example.online_banking_system.repository.AccountTypeRepository;
import com.example.online_banking_system.service.AccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AccountTypeServiceImpl implements AccountTypeService {

    private final AccountTypeRepository accountTypeRepository;

    @Autowired
    public AccountTypeServiceImpl(AccountTypeRepository accountTypeRepository) {
        this.accountTypeRepository = accountTypeRepository;
    }

    @Override
    public List<AccountType> getAllAccountTypes() {
        return accountTypeRepository.findAll();
    }

    @Override
    public AccountType getAccountTypeById(Long id) {
        Optional<AccountType> accountType = accountTypeRepository.findById(id);
        return accountType.orElse(null); // Return null if account type not found
    }

    @Override
    public AccountType createAccountType(AccountType accountType) {
        return accountTypeRepository.save(accountType);
    }

    @Override
    public AccountType updateAccountType(Long id, AccountType accountType) {
        if (accountTypeRepository.existsById(id)) {
            return accountTypeRepository.save(accountType);
        }
        return null;
    }

    @Override
    public void deleteAccountType(Long id) {
        accountTypeRepository.deleteById(id);
    }
}
