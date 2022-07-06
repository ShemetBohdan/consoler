package com.example.consoler.controller;

import com.example.consoler.model.Persone;
import com.example.consoler.service.PersoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/persone")
public class PersoneController {

    private final PersoneService personeService;

    @Autowired
    public PersoneController(PersoneService personeService) {
        this.personeService = personeService;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public @ResponseBody Persone get(@PathVariable int id) {
        System.out.println(id);
        return personeService.getPersone();
    }

    @PostMapping(produces = "application/json")
    public @ResponseBody Persone updatePersone(@RequestBody Persone persone) {
        System.out.println(persone);
        return Persone.builder().name("update persone").build();
    }

    @PutMapping(produces = "aplication/json")
    public Persone createPersone(@RequestBody Persone persone) {
        System.out.println(persone);
        return persone;
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public void deletePersone(@PathVariable Integer id) {
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
