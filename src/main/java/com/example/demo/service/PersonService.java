package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persons;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public List<Persons> findAll(){
		return personRepository.findAll();
	}
	
	public Optional<Persons> getPerson(String personId) {
		return personRepository.findById(personId);
	}

	public String createPerson(Persons person) {
        personRepository.save(person);
        return "Success";
    }

	public String updatePerson(Persons person) {
        personRepository.save(person);
        return "updated Successfully";
    }

	public String deletePerson(String personId) {
        if (personRepository.findById(personId).isPresent()){
            personRepository.deleteById(personId);
            return "success";
        }
        return "not found";
    }
}
