package com.promosite.promosite.service;

import com.promosite.promosite.model.User;

public interface UserService {
    User findByUsername(String username) throws Exception;

    void register(User user) throws Exception;
}
