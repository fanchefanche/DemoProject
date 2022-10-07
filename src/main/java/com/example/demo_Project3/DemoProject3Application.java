package com.example.demo_Project3;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo_Project3.entity.Person;
import com.example.demo_Project3.service.ifs.PersonService;
import com.example.demo_Project3.service.impl.PersonServiceImpl;

@SpringBootApplication
public class DemoProject3Application {

	@Autowired
	private PersonService personservice;
	@Test
	public static void main(String[] args) {
		SpringApplication.run(DemoProject3Application.class, args);
		PersonServiceImpl personService = new PersonServiceImpl();
		Person per122 = personService.getPersonInfo("yyy");
		personService.printPersonAttributes(per122);

	}


}
