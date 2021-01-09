package com.promosite.promosite.controller;

import com.promosite.promosite.model.User;
import com.promosite.promosite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminPanelController {

    @Autowired
    private UserService userService;

    @GetMapping("/adminPanel")
    public String getAdminPanel() {
        return "adminPanel";
    }

    @GetMapping("/registration")
    public String getAdminPanelRegistration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String postAdminPanelRegistration(User user) throws Exception {
        userService.register(user);
        return "registration";
    }

}
