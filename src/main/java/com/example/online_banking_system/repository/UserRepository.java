package com.example.online_banking_system.repository;

import com.example.online_banking_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods can be added here
    User findByEmail(String email); // find user by email
}
