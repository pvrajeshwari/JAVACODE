package com.xworkz1.override;

public class SuperCourt extends Court {

	void importanctCase() {
		System.out.println("invoking importanctcase of supercourt");
		
	}
	@Override
	void justice() {
		System.out.println("overriding justice of court");

	}
	
}
