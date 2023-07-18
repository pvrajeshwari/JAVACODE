package com.xworkz1.inheritance;

public class Runner{
public static void main(String[] args) {
	
	Xworkz xworkz = new Xworkz("Akashara",50,true);
	
	System.out.println(xworkz.hrName);
	System.out.println(xworkz.isTrainingCenter);
	System.out.println(xworkz.noStudents);
	System.out.println("-----------------------------");

	IceCream ice = new IceCream(5, true, "chocolate");
	System.out.println(ice.isTasty);
	System.out.println(ice.name);
	System.out.println(ice.variety);
	
	System.out.println("-----------------------------");
	Animal monkey1 = new Monkey("Monkey1", 20, 3);
	monkey1.printInfo();
	
	System.out.println();
	
    System.out.println("--------------------------------------");
	Building home1 = new Home("Samrudhi", 3, 2);
	home1.printInfo();
	System.out.println("----------------------------------------");
	City bengaluru1 = new Bengaluru("Bengaluru North", "Karnataka", "India");
	bengaluru1.printInfo();
	System.out.println("---------------------------");
	LivingThing plant1 = new Plant("Grass", "Green", "Herbs");
	plant1.printInfo();
	//System.out.println("---------------------------");
	//System.out.println("---------------------------");
	//System.out.println("---------------------------");


	
}
}
