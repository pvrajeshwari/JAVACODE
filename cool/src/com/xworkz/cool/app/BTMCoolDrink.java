package com.xworkz.cool.app;

public class BTMCoolDrink implements CokeCoolDrink,PepsiCoolDrink {
	 @Override
	public void cool() {
		 System.out.println("Invoking cool in Btm");
	}
	 @Override
	public void energy() {
		System.out.println("Invoking energy in btm");
	}
	 @Override
	public void stamina() {
		 System.out.println("Invoking stamina in Btm");
	}
	
}
