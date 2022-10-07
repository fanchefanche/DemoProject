package com.example.demo_Project3.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_Project3.service.ifs.Active;

@Service
public class ActiveImpl implements Active {
	
	@Override
	public void fly(String name ,int age) {
		System.out.println("今年"+age + "歲");
		System.out.println(name+"飛飛飛");
	}

	@Override
	public void fly(int age) {
		// TODO Auto-generated method stub
		System.out.println("今年"+age + "歲");
	}
}
