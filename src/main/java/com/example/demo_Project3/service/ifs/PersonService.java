package com.example.demo_Project3.service.ifs;

import com.example.demo_Project3.entity.Person;

public interface PersonService {
	public Person getPersonInfo(String ID);

	public String getPersonID();
	
	public int getPersonAge(int i);

	public int getPersonAge();

	//public void printPersonAttributes(Person per122);
}
