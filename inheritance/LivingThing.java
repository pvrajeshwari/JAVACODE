package com.xworkz1.inheritance;
public class LivingThing {
	
	String name;
	String color;
	String type;
	
	public LivingThing() {
		
		System.out.println("Invoking String,String,String constructor of LivingThing");
		this.name=name;
		this.color=color;
		this.type=type;
	}
	
void printInfo() {
		
		System.out.println("Name : "+this.name);
		System.out.println("COlor : "+this.color);
		System.out.println("Type : "+this.type);
	}
}
