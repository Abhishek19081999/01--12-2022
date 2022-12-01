/*1.	Create the following tables by using Spring Data JPA. (Don’t create tables by your own, let hibernate to do it.)
 * b.	genres (Genre)
id – int
name – varchar(255)

 */
package com.spring.boot.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "genres")
public class Genre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "id")
	private long id;
	
	@Column(name = "name", nullable = false, length = 255)
	private String name;
	
	//4.	Implement @OneToMany between Genre and Movie
	@OneToMany
	@JoinColumn(name = "genre_id")
	private List<Movie> movies;

	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genre(long id, String name, List<Movie> movies) {
		super();
		this.id = id;
		this.name = name;
		this.movies = movies;
	}

	public Genre(String name, List<Movie> movies) {
		super();
		this.name = name;
		this.movies = movies;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Genre [id=" + id + ", name=" + name + ", movies=" + movies + "]";
	}

}
