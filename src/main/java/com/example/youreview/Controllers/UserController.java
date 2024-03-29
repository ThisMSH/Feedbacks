package com.example.youreview.Controllers;

import com.example.youreview.Models.Enums.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.youreview.Configurations.Utils.SecurityUtils;
import com.example.youreview.Models.Entites.User;
import com.example.youreview.Services.Impl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/")
public class UserController {
    private final UserServiceImpl userService;
    public UserController(UserServiceImpl userService){
        this.userService = userService;
    }

    @GetMapping
    public String login(Model model) {
        if(SecurityUtils.getSessionUser() != null)
            return "redirect:/reviews";
        model.addAttribute("user", new User());
        return "login";
    }

    @GetMapping("/logout")
    public String logout(){
        return "redirect:/?logout=true";
    }
    // @GetMapping("/reviews")
    // public String reviews() {
    //     return "reviews";
    // }
    
    // @PostMapping("/")
    // public String loginPost() {
    //     return "redirect:/reviews";
    // }
    
    
}
