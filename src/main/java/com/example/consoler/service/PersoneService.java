package com.example.consoler.service;

import com.example.consoler.model.Persone;
import com.example.consoler.repository.PersoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersoneService {

    private PersoneRepository personeRepository;

    @Autowired
    public PersoneService(PersoneRepository personeRepository) {
        this.personeRepository = personeRepository;
    }

    public Persone getPersone() {
        System.out.println("getting the persone");
        return personeRepository.findPersoneById(9);
    }
}
