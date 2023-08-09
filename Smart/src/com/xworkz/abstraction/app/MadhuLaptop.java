package com.xworkz.abstraction.app;

public class MadhuLaptop {

	private Laptop laptop;

	public MadhuLaptop( Laptop laptop) {
		this.laptop = laptop;
	}

	public void getPlay() {
		if(laptop!=null) {
			System.out.println("Laptop is not null");
			this.laptop.Display();

		}
		else {
			System.err.println("laptop is null, cannot display");
		}
	}
}
