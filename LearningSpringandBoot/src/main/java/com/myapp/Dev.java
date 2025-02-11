package com.myapp;

public class Dev {
	
	private Laptop laptop;
	
	public Dev() { // 3
		System.out.println("Dev object created..");
	}
	
	// Using setter injection..(SDI)
	/* 
	public Laptop getLaptop() { 
		return laptop;
	}
	
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	} 
	*/
	// Using constructor dependency injection..(CDI)
	
	public Dev(Laptop laptop) {
		System.out.println("Inside CDI constructor of dev..");
		this.laptop = laptop;
	}
	
	public void build() {
		System.out.println("Working on awesome project");
		laptop.compile();
	}
}
