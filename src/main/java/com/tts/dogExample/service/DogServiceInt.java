package com.tts.dogExample.service;

import java.util.List;

import com.tts.dogExample.model.Dog;

public interface DogServiceInt {
	public List<Dog> getAll();
	public void saveDog(Dog dog);
	public void deleteDogById(Long id);
	public Dog getDogUsingId(Long id);
	public void updateDogUsingId(Dog dog, Long id);
}
