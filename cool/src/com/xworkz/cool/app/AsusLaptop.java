package com.xworkz.cool.app;

public interface AsusLaptop extends DellLaptop {
	public default void  GamingLAptop () {
		System.out.println("Invoking In AsusLP");
	
	

}
	@Override
	public default void Expensive() {
		System.out.println("Invoking In Hp");

		
	}
	
	
}


