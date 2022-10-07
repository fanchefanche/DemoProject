package com.example.demo_Project3.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_Project3.entity.Person;
import com.example.demo_Project3.service.ifs.PersonService;
@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public Person getPersonInfo(String ID) {
		Person person = new Person();
		person.setAge(100);
		person.setName("poop2");
		person.setID(ID);
		person.setCity("高譚市");

		return person;
	}

	public String getPersonID(Person person) {
		return person.getID();}

	public String getPersonName(Person person) {
		return person.getName();}

	public String getPersonCity(Person person) {
		return person.getCity();}

	public int getPersonAge(Person person) {
		return person.getAge();

	}

	public void printPersonAttributes(Person person) {

		System.out.println(person.getAge());
		System.out.println(person.getName());
		System.out.println(person.getCity());
		System.out.println(person.getID());
	}

//	@Override
//	public String getPersonID() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public int getPersonAge() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	@Override
	public String getPersonID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPersonAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPersonAge(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

//	public String getPersonID1() {
//		String str = "YTR";
//		return str;
//	}

//	@Override
//	public String getPersonID(Person person) {
//		
//		return person.getID() ;
//	}
//
//	@Override
//	public int getPersonAge() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
