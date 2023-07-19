package com.xworkz1.override;

public class CivilCourt extends HighCourt {

	void propertyCase() {
		System.out.println("invoking propertycase of civilcourt");
		
	}
	void theftCase() {
		System.out.println("invoking theftcase of civilcourt");
		
	}
	@Override
	void criminalCase() {
		System.out.println("overriding criminalCase of highcourt");

		
	}
	@Override
	void forgeryCase() {
		System.out.println("overriding forgeryCase of highcourt");

	}
	
}
