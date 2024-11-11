package com.example.online_banking_system.service.impl;

import com.example.online_banking_system.model.Account;
import com.example.online_banking_system.repository.AccountRepository;
import com.example.online_banking_system.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountById(Long id) {
        Optional<Account> account = accountRepository.findById(id);
        return account.orElse(null); // Return null if account not found
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(Long id, Account account) {
        if (accountRepository.existsById(id)) {
            // No need to set the id manually, it will be managed by JPA
            return accountRepository.save(account);
        }
        return null;
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
