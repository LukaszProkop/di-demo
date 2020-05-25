package com.springframework.didemo.controllers;

import com.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Bad Class example
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    //constructor no need @Autowired in "Spring Framework 5"
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
