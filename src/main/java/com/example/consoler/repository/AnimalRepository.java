package com.example.consoler.repository;

import com.example.consoler.model.Animal;
import com.example.consoler.model.Persone;
import org.springframework.stereotype.Repository;

@Repository

public class AnimalRepository {

    public Animal findAnimalById(int id){
        return Animal.builder()
                .kind("dog")
                .breed("bulldog")
                .nickName("Jack")
                .age(5)
                .build();

    }
}
