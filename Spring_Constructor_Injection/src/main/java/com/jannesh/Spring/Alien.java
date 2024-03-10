package com.jannesh.Spring;

public class Alien {
	public int age;

	public Alien(int age) {
		System.out.println("Parameterized Constructor");
		this.age = age;
	}
	
	public Alien() {
		System.out.println("Default Constructor");
	}
}
