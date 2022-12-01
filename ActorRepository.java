package com.spring.boot.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.demo.model.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long>{
	
	 public Actor findByName(String name);

	 Optional<Actor> findById(Long id);

	 List<Actor> findAll();
	 
	 void deleteById(Long id);
}
