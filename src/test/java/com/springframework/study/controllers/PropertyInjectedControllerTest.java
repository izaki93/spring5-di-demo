package com.springframework.study.controllers;

import com.springframework.study.services.GreetingService;
import com.springframework.study.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,propertyInjectedController.sayHello());
    }
}
