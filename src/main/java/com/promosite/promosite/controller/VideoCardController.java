package com.promosite.promosite.controller;

import com.promosite.promosite.model.VideoCard;
import com.promosite.promosite.service.VideoCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VideoCardController {

    @Autowired
    private VideoCardService videoCardService;

    @GetMapping("/home")
    public String home(Model model) {
        List<VideoCard> all = videoCardService.findAll();
        model.addAttribute("videoCards",all);
        return "home";
    }

}
