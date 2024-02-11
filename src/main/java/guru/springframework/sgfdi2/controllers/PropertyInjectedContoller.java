package guru.springframework.sgfdi2.controllers;

import guru.springframework.sgfdi2.services.GreetingService;

public class PropertyInjectedContoller {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
