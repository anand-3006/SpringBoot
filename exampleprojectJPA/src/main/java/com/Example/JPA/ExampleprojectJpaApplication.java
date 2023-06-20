package com.Example.JPA;


import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Example.JPA.DAO.Repository;
import com.Example.JPA.Entity.Anands;

@SpringBootApplication
public class ExampleprojectJpaApplication {

	public static void main(String[] args) {
	ApplicationContext run = SpringApplication.run(ExampleprojectJpaApplication.class, args);
	Repository A1 = run.getBean(Repository.class);
	
	Anands an=new Anands();
	Anands as=new Anands();
	an.setName("An&");
	as.setName("SagarM");
//	//to save single object
//	Anands save = A1.save(an);
//	System.out.println(save);
//	//to save multiple object at a time
//	List<Anands> list = List.of(an,as);
//	Iterable<Anands> saveAll = A1.saveAll(list);
//	saveAll.forEach(S->{System.out.println("the objects are saved into data table!!");});
	
//	//update data into the database table by id
//	Optional<Anands> findById = A1.findById(2);
//	Anands anands = findById.get();
//	anands.setName("Anand");
//	anands.setId(230);
//	Anands save = A1.save(anands);
//	System.out.println(save);
	
//	//deleting data from database
//	A1.deleteById(202);
//	System.out.println("deleted");
	
//	//get data from database on console using ID
//	Optional<Anands> findById = A1.findById(52);
//	System.out.println(findById);
	
	//all data from database using streamAPI
	Iterable<Anands> findAll = A1.findAll();
	findAll.forEach(A->{System.out.println(A);});
}
}