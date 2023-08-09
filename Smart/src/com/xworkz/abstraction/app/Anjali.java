package com.xworkz.abstraction.app;

public class Anjali {

	private WaterPurifier purifier;

	public Anjali(WaterPurifier purifier) {
		this.purifier = purifier;
	}

	public void getPurify() {
		if(purifier!=null) {
			System.out.println("Purify is not null");
			this.purifier.Filter();
		}
		else {
			System.err.println("Purify is null, cannot purify");
		}
	}

}
