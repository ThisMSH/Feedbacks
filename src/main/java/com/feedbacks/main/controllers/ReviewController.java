package com.feedbacks.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {
    @GetMapping("/")
    public String viewMainPage(Model model){
        return "main";
    }
}
