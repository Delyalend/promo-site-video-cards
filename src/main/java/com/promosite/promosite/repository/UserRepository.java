package com.promosite.promosite.repository;

import com.promosite.promosite.model.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findUserByUsername(String username);

    void save(User user);
}
