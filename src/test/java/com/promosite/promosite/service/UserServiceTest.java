package com.promosite.promosite.service;

import com.promosite.promosite.model.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
class UserServiceTest {

    private UserService userService;

    @Test
    void findByUsername() throws Exception {
        userService = new UserServiceImpl(new UserRepositoryTestImpl());

        String name = "user";
        User found = userService.findByUsername(name);

        assertThat(found.getUsername()).isEqualTo(name);
    }


}