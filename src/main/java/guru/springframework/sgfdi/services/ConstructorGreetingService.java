package guru.springframework.sgfdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hi - Constructor";
    }
}
