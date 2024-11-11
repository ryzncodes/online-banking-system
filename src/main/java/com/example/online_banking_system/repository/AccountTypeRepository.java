package com.example.online_banking_system.repository;

import com.example.online_banking_system.model.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
    // You can add custom query methods if needed
    AccountType findByName(String name); // example: find account type by name
}
