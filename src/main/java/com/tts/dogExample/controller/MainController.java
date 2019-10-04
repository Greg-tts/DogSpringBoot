package com.tts.dogExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tts.dogExample.model.Dog;
import com.tts.dogExample.service.DogServiceImpl;

@RestController
public class MainController {
	@Autowired
	DogServiceImpl dogServiceImpl;
	
	@GetMapping("/")
	public String index() {
		return "<h1>Dog Example</h1>";
	}
	
    @CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/dogs")
	public List<Dog> getAllDogs(){
		return dogServiceImpl.getAll();
	}
    
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/dog")
    public void createDog(@RequestBody Dog dog) {
    	dogServiceImpl.saveDog(dog);
    }
}
