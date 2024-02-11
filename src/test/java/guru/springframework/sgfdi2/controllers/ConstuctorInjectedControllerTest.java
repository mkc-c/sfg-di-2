package guru.springframework.sgfdi2.controllers;

import guru.springframework.sgfdi2.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.aop.scope.ScopedProxyUtils;

import static org.junit.jupiter.api.Assertions.*;

class ConstuctorInjectedControllerTest {

    ConstuctorInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new ConstuctorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}