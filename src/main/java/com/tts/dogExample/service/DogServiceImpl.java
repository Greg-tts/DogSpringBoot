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

	@Override
	public void deleteDogById(Long id) {
		dogRepository.deleteById(id);
	}

	@Override
	public Dog getDogUsingId(Long id) {
		return dogRepository.findDogById(id);
	}

	@Override
	public void updateDogUsingId(Dog dogWithChanges, Long id) {
		Dog currentDog = dogRepository.findDogById(id);
		currentDog.setName(dogWithChanges.getName());
		currentDog.setBreed(dogWithChanges.getBreed());
		currentDog.setAge(dogWithChanges.getAge());
		dogRepository.save(currentDog);
	}
	
}
