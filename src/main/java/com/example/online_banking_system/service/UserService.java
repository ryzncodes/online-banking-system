// UserService.java (Interface)
package com.example.online_banking_system.service;

import com.example.online_banking_system.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}
