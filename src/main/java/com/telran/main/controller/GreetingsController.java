package com.telran.main.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    //http://localhost:8080/greetings/my variable
    @GetMapping("/greetings/{message}")
    public String getMessage(@PathVariable("message") String message) {
        return message; //
    }

    private void init() {
    }
}
