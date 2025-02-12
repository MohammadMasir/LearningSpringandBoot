package com.myapp;

public class Desktop implements Computer{
	public Desktop() {
		System.out.println("Inside Desktop constructor.. Desktop object created");
	}
	
	public void compile() {
		System.out.println("Compiling in Desktop...");
	}
}
