package com.xworkz1.inheritance;
	public class City {
		
		String name;
		String state;
		String country;
		
		public City(String name, String state, String country) {
			
			this.name=name;
			this.state=state;
			this.country=country;
		
		}
		
		void printInfo() {
			System.out.println("Name: "+this.name);
			System.out.println("State : "+this.state);
			System.out.println("Country : "+this.country);
		}

	}

