package com.auth.authenticationproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home(Principal principal) {
        System.out.println(principal);
        return "Welcome to homepage";
    }
}
