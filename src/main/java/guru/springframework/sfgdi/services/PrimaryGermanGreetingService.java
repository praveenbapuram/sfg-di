package guru.springframework.sfgdi.services;

public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;
    public PrimaryGermanGreetingService(GreetingRepository repository) {
        this.greetingRepository=repository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
