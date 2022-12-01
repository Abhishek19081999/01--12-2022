package com.spring.boot.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.demo.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long> {
	
	public Genre findByName(String name);
	
	Optional<Genre> findById(Long id);
	
	List<Genre> findAll();
	
	void deleteById(Long id);
}
