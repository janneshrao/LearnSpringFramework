package com.jannesh.Spring;

public class Alien {
	
	private int age;
	private Laptop laptop;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Alien() {
		System.out.println("Alien Object Created");
	}
	public void code() {
		System.out.println("I'm coding...");
		laptop.compile();
	}
}
