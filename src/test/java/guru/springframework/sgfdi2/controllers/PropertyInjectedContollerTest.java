package guru.springframework.sgfdi2.controllers;

import guru.springframework.sgfdi2.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedContollerTest {

    PropertyInjectedContoller controller;

    @BeforeEach
    void setUp() {

        controller = new PropertyInjectedContoller();

        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}