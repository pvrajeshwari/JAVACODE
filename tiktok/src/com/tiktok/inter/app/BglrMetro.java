package com.tiktok.inter.app;

public class BglrMetro implements MetroRule{

	@Override
	public void getTicket() {
		System.out.println("Ticket Should be Taken To Travel In Metro");
	}

	@Override
	public void getPlatform() {
		System.out.println("Should wait at the dedicated platform");
	}

}
