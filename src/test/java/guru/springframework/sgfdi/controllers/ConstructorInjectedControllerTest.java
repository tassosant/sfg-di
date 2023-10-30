package guru.springframework.sgfdi.controllers;

import guru.springframework.sgfdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp(){
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }
    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}