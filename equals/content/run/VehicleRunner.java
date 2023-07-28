package com.equals.content.run;

	import com.equals.content.app.Vechicle;

	public class VehicleRunner {

			public static void main(String[] args) {
		System.out.println("Running main in Vehicle Runner\n");


		Vechicle vehicle1  = new Vechicle("Truck", "manual", "Ashok layland ltd", "Ashak Layland Truck", 13.85);
		Vechicle vehicle2  = new Vechicle("Bike", "manual", "KMT", "KTM Bike", 45.80);

		System.out.println("Object one:\n" + vehicle1 + "\n");
		System.out.println("* * * * * * * * * * * * * * * * *");
		System.out.println("Object two:\n" + vehicle2 + "\n");

		boolean result = vehicle1.equals(vehicle2);
			System.out.println("The Vehicles being same is : " + result);

			}
	}
	
	
