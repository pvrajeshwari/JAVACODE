package com.tiktok.inter.app;

public class IbmCompany implements CompanyRule{

	@Override
	public void getEmployeId() {
		System.out.println("Should Bring Id Card");
	}

	@Override
	public void getFormal() {
		System.out.println("Should Wear formal dress");
	}
}
