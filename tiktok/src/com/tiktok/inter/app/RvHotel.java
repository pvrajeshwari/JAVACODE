package com.tiktok.inter.app;

public class RvHotel implements HotelRule {
	@Override
	public void payBill() {
		System.out.println("Should Pay the Bill");
	}

	@Override
	public void getParcel() {
		System.out.println("Should Parcel the Food");
	}

	

	}
