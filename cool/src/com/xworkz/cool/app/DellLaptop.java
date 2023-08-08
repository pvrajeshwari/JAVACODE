package com.xworkz.cool.app;

public interface DellLaptop extends HpLaptop {
	public default void  Durable () {
		System.out.println("Invoking In DellLP");
	
	

}
	@Override
	public default void Expensive() {
		System.out.println("Invoking In Hp");

		
	}
	
	
}
