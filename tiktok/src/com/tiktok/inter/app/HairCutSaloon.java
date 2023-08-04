package com.tiktok.inter.app;

public class HairCutSaloon implements SaloonRule {

	@Override
	public void waitForYourTurn() {
		System.out.println("Wait for your turn to get Hair cut");
	}

	@Override
	public void dontMove() {
		System.out.println("Dont move while getting hair cut");
	}

}
