package com.xworkz.abstraction.app;

public class VarunWatch {

	private SmartWatch smartWatch;

	public VarunWatch(SmartWatch smartWatch) {
		this.smartWatch = smartWatch;
		System.out.println("smart watch arguement in Varun");
	}

	public void getMusic() {
		if(smartWatch != null) {
			System.out.println("Watch is not null");
			this.smartWatch.ShowTime();
		}
		else {
			System.err.println("watch is null, watch not working");
		}
	}
}
