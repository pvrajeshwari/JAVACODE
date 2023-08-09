package com.xworkz.abstraction.app;

public class Jaya {

	private Elevator elevator;

	public Jaya(Elevator elevator) {
		this.elevator = elevator;
	}

	public void getHighWeight() {
		if(elevator!=null) {
			System.out.println("Elevator is not null");
			this.elevator.CarryLuggage();
		}
		else {
			System.err.println("Elevator is null, cannot carry");
		}
	}
}
