package com.tiktok.inter.app;

public class AgadiHospital implements HospitalRule{

	@Override
	public void getMask() {
		System.out.println("Wear Mask Inside Hospital");
	}

	@Override
	public void getMedicine() {
		System.out.println("Get Medicine After Treatment");
	}

}
