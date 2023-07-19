package com.xworkz1.override;

public class HighCourt extends SuperCourt {

	void criminalCase() {
		System.out.println("invoking criminalcase of highcourt");
		
	}
	void forgeryCase() {
		System.out.println("invoking forgerycase of highcourt");
		
	}
	
	@Override
	void importanctCase() {
		System.out.println("overriding importanctCase of supercourt");

	}
	
	
}
