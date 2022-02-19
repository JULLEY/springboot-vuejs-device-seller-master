package com.seller.service;

import com.seller.model.Role;
import com.seller.model.User;

import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(String username, Role newRole);
}