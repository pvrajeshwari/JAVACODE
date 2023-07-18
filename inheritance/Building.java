package com.xworkz1.inheritance;
	public class Building {
		
		String name;
		int rooms;
		int floors;
		
		public Building(String name, int rooms, int floors) {
			
			this.name=name;
			this.rooms=rooms;
			this.floors=floors;
			
		}
		
		void printInfo() {
			System.out.println("Name : "+this.name);
			System.out.println("Rooms : "+this.rooms);
			System.out.println("FLoors : "+this.floors);
		}

	}


