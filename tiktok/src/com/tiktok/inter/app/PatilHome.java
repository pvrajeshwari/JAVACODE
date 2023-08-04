package com.tiktok.inter.app;

public class PatilHome implements HomeRule {
	@Override
	public void getHomeBefore() {
		System.out.println("Should be home before 9pm");
	}

	@Override
	public void dontUseBadWords() {
		System.out.println("Should Avoid Using Bad Words");
	}
}


	

