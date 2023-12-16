package com.springframework.pets;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

//@Service
public class PetServiceFactory {



    public PetService getPetService(String petType){
        switch (petType){
            case "dog":
                return new DogPetService();
            case "car":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
