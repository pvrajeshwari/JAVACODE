package com.xworkz1.override;

public class FamilyCourt extends CivilCourt {
	void divorceCase() {
		System.out.println("invoking divorcecase of familycourt");
		
	}
	
@Override
void propertyCase() {
	System.out.println("overriding propertyCase of familycourt");

	
}
@Override
void theftCase() {
	System.out.println("overriding theftCaseCase of familycourt");

	
}
	}


