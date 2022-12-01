package com.spring.boot.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.demo.model.Movie;

public interface MovieRepository  extends JpaRepository<Movie, Long> {
	  
	    public Movie findByTitle(String title);

	    Optional<Movie> findById(Long id);

	    List<Movie> findAll();
	    
	    void deleteById(Long id);
}
