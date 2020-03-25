package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("en")
@Service("i18nService")
public class I18NEnglishGreetinService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -EN";
    }
}
