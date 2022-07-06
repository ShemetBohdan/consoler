package com.example.consoler.repository;

import com.example.consoler.model.Persone;
import org.springframework.stereotype.Repository;

@Repository
public class PersoneRepository {

    public Persone findPersoneById(int id){
        return Persone.builder()
                .name("Timon")
                .age(25)
                .gender("male")
                .build();
    }
}
