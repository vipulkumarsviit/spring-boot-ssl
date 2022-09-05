package com.vksviit.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {
    @GetMapping("/say-hello")
    public String sayHello(@RequestParam(name = "username", defaultValue = "World") String username) {
        return "Hello " + username;
    }
}
