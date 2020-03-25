package guru.springframework.sfgdi.services;

public class PrimarySpanishGreetingService implements GreetingService {
    GreetingRepository greetingRepository;
    public PrimarySpanishGreetingService(GreetingRepository repository) {
        this.greetingRepository=repository;
    }

    @Override
    public String sayGreeting() {
       return greetingRepository.getSpanishGreeting();
    }
}
