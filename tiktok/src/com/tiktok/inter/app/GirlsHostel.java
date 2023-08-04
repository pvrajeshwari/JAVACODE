package com.tiktok.inter.app;

public class GirlsHostel implements HostelRule {

	@Override
	public void getFee() {
		System.out.println("Hostel Fee should be payed before Due date");
	}

	@Override
	public void getAvoidPhoneSound() {
		System.out.println("Students Should be inside the room phone sound in less");
	}


}
