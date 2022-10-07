package com.example.demo_Project3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo_Project3.entity.Person;
import com.example.demo_Project3.service.ifs.Active;
import com.example.demo_Project3.service.ifs.PersonService;
import com.example.demo_Project3.service.impl.PersonServiceImpl;

@SpringBootTest
class DemoProject3ApplicationTests {

//	@Autowired
//	private PersonService personService;
//
//	@Autowired
//	private PersonServiceImpl personServiceImpl;
	
	@Autowired
	private Active active;

//	@Test
//	public void contexloads() {
//		Person per = personService.getPersonInfo("yyyyy");
//		System.out.println(per.getID());
//	}

	@Test
	public void activeTest() {
        active.fly("aaa", 0);
        active.fly(25);

	}
}
