package com.prime.encapsulation.runner;


	import com.prime.encapsulation.app.Tap;

	public class TapRunner {

		public static void main(String[] args) {
			System.out.println("Running main in Tap Runner");

			
			Tap tap = new Tap();
			
			System.out.println(tap);
			System.out.println(tap);
			tap.setTap("CERA", 7000, "Builder", "Mixer", "silver");
			
			System.out.println("* * * * * * * * * * * * * * * * * *");
			
			System.out.println(tap);
		}


	}




