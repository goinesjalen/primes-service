package edu.iu.jgoines.primesservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin
public class HomeController {
    @GetMapping
    public String greetings() {
        return "Welcome to the primes service!";
    }
}
