package com.example.consoler.service;

import com.example.consoler.model.Animal;
import com.example.consoler.model.Persone;
import com.example.consoler.repository.AnimalRepository;
import com.example.consoler.repository.PersoneRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AnimalService {

    private AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Animal getAnimal() {
        System.out.println("getting the animal");
        return animalRepository.findAnimalById(5);
    }
}
