/*
 * 1.	Create the following tables by using Spring Data JPA. (Don’t create tables by your own, let hibernate to do it.)
a.	actors (Actor)
id – int
name – varchar(255)
last_name – varchar(255)
year_of_birth – int
b.	genres (Genre)
id – int
name – varchar(255)
c.	movies (Movie)
id – int
title – varchar(255)
year_of_release – int
genre_id int
d.	actors_to_movies (There is no class by this name)
actor_id – int
movie_id – int

2.	Create entity classes like Actor, Genre and Movie

3.	The identifier for each class should be automatically generated.

4.	Implement @OneToMany between Genre and Movie

5.	Implememt @ManyToMany between the Actor and Movie entities
6.	Saving objects of type Genre to the database
7.	Saving objects of type Actor to the database
8.	removing Actor record by id from the database
9.	 searching Actor records by title
10.	 searching for Actor records by id
11.	 returning all Actor records
12.	 removing Genre records from the database
13.	 searching Genre records by title
14.	 searching for Genre records by id
15.	 returning all Genre records
16.	 adding Movie records to the database
17.	 removing Movie records from the database
18.	 searching Movie records by title
19.	 searching for Movie records by id
20.	 returning all Movie records


 */
package com.spring.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.boot.demo.Controller.RepositoryController;

@SpringBootApplication
public class SpringBootsAppsApplication implements CommandLineRunner{

	
	@Autowired
	private RepositoryController repositoryController;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootsAppsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryController.run();
		
	}
}
