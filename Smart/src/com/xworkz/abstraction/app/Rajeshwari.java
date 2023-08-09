package com.xworkz.abstraction.app;

public class Rajeshwari {

	private PrintingMachine machine;

	public Rajeshwari(PrintingMachine machine) {
		this.machine = machine;
	}


	public void getprint() {
		if(machine!=null) {
			System.out.println("Machine is not null");
			 this.machine.Print();
		}
		else {
			System.err.println("machine is null cannot print");
		}
	}
}

