package guru.springframework.sgfdi2.controllers;

import guru.springframework.sgfdi2.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstuctorInjectedController {

    private final GreetingService greetingService;

    public ConstuctorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
