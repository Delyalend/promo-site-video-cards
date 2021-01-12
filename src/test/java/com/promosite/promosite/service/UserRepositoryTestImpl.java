package com.promosite.promosite.service;

import com.promosite.promosite.model.Role;
import com.promosite.promosite.model.User;
import com.promosite.promosite.repository.UserRepository;

import java.util.Collections;
import java.util.Optional;

public class UserRepositoryTestImpl implements UserRepository {
    @Override
    public Optional<User> findUserByUsername(String username) {
        User user = new User();
        user.setId(1L);
        user.setUsername("user");
        user.setActive(true);
        user.setPassword("password");
        user.setRoles(Collections.singleton(Role.USER));
        return Optional.of(user);
    }

    @Override
    public void save(User user) {

    }
}
