package com.tts.dogExample.service;

import java.util.List;

import com.tts.dogExample.model.Dog;

public interface DogServiceInt {
	public List<Dog> getAll();
	public void saveDog(Dog dog);
}
