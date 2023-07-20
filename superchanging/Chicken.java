package com.xworkz1.superchanging;

	public class Chicken {

		double price;
		String location;

		Chicken(double price, String location)
		{
			this.price = price;
			this.location = location;
		}

		void printInfo()
		{
			System.out.println("Running printInfo in Chicken");
			System.out.println("Price : "+price);
			System.out.println("Location : "+location);

		}
	}