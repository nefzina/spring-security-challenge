package com.wildcodeschool.springsecurity.user.application;

import com.wildcodeschool.springsecurity.user.domain.CampusList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class UserController {

    @GetMapping("/")
    public String shield(){
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avengers(){
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String admin(){
        return "list de campus de la Wild code school";
    }
}
