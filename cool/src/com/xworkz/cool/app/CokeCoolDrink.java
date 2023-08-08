package com.xworkz.cool.app;

public interface CokeCoolDrink extends PepsiCoolDrink{
	public default void stamina() {
		System.out.println("Invoking in CokeCool");
	}
	@Override
	public default void cool() {
		System.out.println("Invoking in Coke");
	}

	
}
