// UserController.java (Interface)
package com.example.online_banking_system.controller;

import com.example.online_banking_system.model.User;
import java.util.List;

public interface UserController {
    List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}
