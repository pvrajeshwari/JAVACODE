package com.xworkz1.override;

public class CourtRunner {

	public static void main(String[] args) {
		System.out.println("************Court***********");
		Court court = new Court();
		court.justice();
	
		System.out.println("------------------SupremeCourt---------");
        SuperCourt supreme = new SuperCourt();
        supreme.justice();
        supreme.importanctCase();
	
		System.out.println("______________HighCourt__________");
        HighCourt high = new HighCourt();
        high.importanctCase();
        high.criminalCase();
        high.forgeryCase();
     System.out.println("*****************CivilCourt******************");
	 CivilCourt civil = new CivilCourt();
	 civil.criminalCase();
	 civil.forgeryCase();
	 civil.propertyCase();
	 civil.theftCase();
	 System.out.println("______________FamilyCourt__________");
	 FamilyCourt familycourt = new FamilyCourt();
	 familycourt.divorceCase();
	 familycourt.propertyCase();
	 familycourt.theftCase();
	}
}
