package guru.springframework.sgfdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hi - Setter";
    }
}
