package com.xworkz.cool.app;

public class Laptop implements DellLaptop,AsusLaptop {
	@Override
	public void Expensive() {
		System.out.println("Invoking Hp in Laptop");

	}
@Override
public void Durable() {
	System.out.println("Invoking Dell in Laptop");

	
}
@Override
public void GamingLAptop() {
	System.out.println("Invoking Asus in Laptop");

	
}
	
}
