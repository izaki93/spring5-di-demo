package com.springframework.study.controllers;

import com.springframework.study.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,constructorInjectedController.sayHello());
    }
}
