package com.tts.dogExample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tts.dogExample.model.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long>{
	public List<Dog> findAll();
}
