//package com.hotelmanagement.hotelmanagement.controller;


//import com.hotelmanagement.hotelmanagement.entity.User;
//import com.hotelmanagement.hotelmanagement.service.CustomUserDetailsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class AuthController {
//
//    @Autowired
//    private CustomUserDetailsService userDetailsService;
//
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//    @GetMapping("/register")
//    public String register(Model model) {
//        model.addAttribute("user", new User());
//        return "register";
//    }
//
//    @PostMapping("/register")
//    public String registerUser(User user) {
//        userDetailsService.saveUser(user);
//        return "redirect:/login";
//    }
//}
