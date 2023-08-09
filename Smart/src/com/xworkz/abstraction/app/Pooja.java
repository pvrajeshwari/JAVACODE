package com.xworkz.abstraction.app;

public class Pooja {

	private WashingMachine machine;

	public Pooja(WashingMachine machine) {
	this.machine = machine;
	}

	public void getDry() {
		if(machine!= null) {
			System.out.println("Machine is not null");
			this.machine.Dry();
		}
		else {
			System.err.println("machine is null, machine cannot rinse");
		}
	}
}
