package com.example.demo_Project3.service.impl;

import com.example.demo_Project3.entity.Bird;
import com.example.demo_Project3.entity.Person;
import com.example.demo_Project3.service.ifs.Active;



public class BirdFlyApplication implements Active{
	
	public static void main (String []args) {
		BirdFlyApplication bird = new BirdFlyApplication();
		Bird littleBird = new Bird();
		littleBird.setAge(100000);
		littleBird.setName("這什麼鳥");
		
		bird.fly(littleBird.name, littleBird.age);
		
	};
	
	
	@Override
	public void fly(String name, int age) {
		System.out.println("今年" + age + "歲");
		System.out.println(name + "飛飛飛");
	}
			
	public String getBirdName(Bird bird) {
		return bird.getName();
		}
	
	public int getBirdAge(Bird bird) {
		return bird.getAge();
		}
	
	public void printBirdAttributes(Bird bird) {
//		System.out.println(bird.getName());
		fly(bird.name,bird.age);
	}


	@Override
	public void fly(int age) {
		// TODO Auto-generated method stub
		
	}

}
