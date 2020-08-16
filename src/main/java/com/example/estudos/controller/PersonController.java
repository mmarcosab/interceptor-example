package com.example.estudos.controller;

import com.example.estudos.gateway.data.entity.Person;
import com.example.estudos.gateway.data.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonRepository repository;

    @GetMapping(value = "/data")
    public ResponseEntity<Person> getPersonsByData(@RequestParam LocalDateTime dataCadastro){
        Person person = repository.getByData(dataCadastro);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody Person person){
        repository.save(person);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }
}
