package com.prime.encapsulation.runner;

	import com.prime.encapsulation.app.Satelliete;

	public class SatellieteRunner {

		public static void main(String[] args) {
			System.out.println("Running main in Satellite Runner");
			
			Satelliete satelliete = new Satelliete();
			
			System.out.println(satelliete);
			satelliete.setName("Chandrayan 3");
			satelliete.setBudget(615000000l);
			satelliete.setLaunchDate("July14");
			satelliete.setLaunchPlace("Satish Dhawan Space Centre, Sriharikota");
			satelliete.setMission("To land in the Moon's south polar region");
			
			System.out.println("* * * * * * * * * * * * * * * * *");
			System.out.println(satelliete);
		}

	}