package com.xworkz.cool.app;

public interface PepsiCoolDrink extends CoolDrink{

	public default void energy() {
		
	}
	@Override
	public default void cool() {
		System.out.println("Invoking In PepsiCoolDrink");

		
	}
	
}
