package com.xworkz1.superchanging;

public class ChickenRunner {
	public static void main(String[] args) {

		System.out.println("Running main..........................\n");

		Chicken ref1 = new Chicken(300, "Banglore\n");
		ref1.printInfo();

		Chicken ref2 = new FarmChicken(400, "Dharwad", 70, "Spiderman\n");
		ref2.printInfo();

		Chicken ref3 = new BroilerChicken(500, "Hubli", false, 7);
		ref3.printInfo();


	}

}
