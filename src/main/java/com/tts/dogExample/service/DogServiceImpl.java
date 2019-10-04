package com.tts.dogExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.dogExample.model.Dog;
import com.tts.dogExample.repository.DogRepository;

@Service
public class DogServiceImpl implements DogServiceInt{
	@Autowired
	DogRepository dogRepository;

	@Override
	public List<Dog> getAll() {
		return dogRepository.findAll();
	}

	@Override
	public void saveDog(Dog dog) {
		dogRepository.save(dog);
	}
	
}
