package guru.springframework.sgfdi.controllers;

import guru.springframework.sgfdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp(){
        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
    }
    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}