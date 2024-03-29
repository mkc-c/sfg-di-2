package guru.springframework.sgfdi2.controllers;

import guru.springframework.sgfdi2.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstuctorInjectedControllerTest {

    ConstuctorInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new ConstuctorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}