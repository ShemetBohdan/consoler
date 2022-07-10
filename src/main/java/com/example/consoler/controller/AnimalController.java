package com.example.consoler.controller;

import com.example.consoler.model.Animal;
import com.example.consoler.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

public class AnimalController {
    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody Animal get(@PathVariable int id) {
        System.out.println(id);
        return animalService.getAnimal();
    }

    @PostMapping(produces = "application/json")
    public @ResponseBody Animal updateAnimal(@RequestBody Animal animal) {
        System.out.println(animal);
        return Animal.builder().nickName("update animal").build();
    }

    @PutMapping(produces = "aplication/json")
    public Animal createAnimal(@RequestBody Animal animal) {
        System.out.println(animal);
        return animal;
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public void deleteAnimal(@PathVariable Integer id) {
        if (id == 0) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Not found");
        }
        System.out.println("removing persone whith id:" + id);
    }

    @ExceptionHandler({NullPointerException.class})
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public @ResponseBody String handleException() {
        return "not working";
    }
}
