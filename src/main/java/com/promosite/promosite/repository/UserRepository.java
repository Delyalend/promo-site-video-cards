package com.promosite.promosite.repository;

import com.promosite.promosite.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findUserByUsername(String username);

    void save(User user);
}
