package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persons;
import com.example.demo.service.PersonService;

@RestController
@RequestMapping("/persons")
public class BasicController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/all")
	public List<Persons> getAll() {
		return personService.findAll();
	}

	@GetMapping("{personId}")
    public Optional<Persons> getPersonDetails(@PathVariable("personId") String personId){
        return personService.getPerson(personId);
    }
	
	@PostMapping
    public String createPerson(@RequestBody Persons person){
        return personService.createPerson(person);
    }

	@PutMapping
    public String updatePerson(@RequestBody Persons person){
        return personService.updatePerson(person);
    }

	@DeleteMapping("{personId}")
    public String deletePerson(@PathVariable("personId") String personId){
        return personService.deletePerson(personId);
    }
}
