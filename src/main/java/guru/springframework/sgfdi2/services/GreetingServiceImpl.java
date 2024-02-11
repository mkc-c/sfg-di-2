package guru.springframework.sgfdi2.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, World!";
    }
}
