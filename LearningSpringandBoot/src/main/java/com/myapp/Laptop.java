package com.myapp;

public class Laptop implements Computer{	
	public Laptop() { // 3
		System.out.println("Laptop object created..");
	}
	public void compile() {
		System.out.println("Compiling in Laptop..");
	}
}
