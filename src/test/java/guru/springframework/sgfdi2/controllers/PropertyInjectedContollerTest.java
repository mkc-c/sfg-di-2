package guru.springframework.sgfdi2.controllers;

import guru.springframework.sgfdi2.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedContollerTest {

    PropertyInjectedContoller controller;

    @BeforeEach
    void setUp() {

        controller = new PropertyInjectedContoller();

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}