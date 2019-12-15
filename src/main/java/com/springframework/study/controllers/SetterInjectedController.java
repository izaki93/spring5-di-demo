package com.springframework.study.controllers;

import com.springframework.study.services.GreetingService;
import com.springframework.study.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
