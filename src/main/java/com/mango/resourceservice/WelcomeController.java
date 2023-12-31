package com.mango.resourceservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class WelcomeController {

    @GetMapping("/public")
    public String welcomePublic(){
        return "Witaj publiczny przyjacielu!!";
    }

    @RolesAllowed({"ROLE_USER"})
    @GetMapping("/user")
    public String welcomeUser(){
        return "Witaj User, co u Ciebie?";
    }

    @RolesAllowed({"ROLE_ADMIN"})
    @GetMapping("/admin")
    public String welcomeAdmin(){
        return "Witaj Admin!!";
    }
}
