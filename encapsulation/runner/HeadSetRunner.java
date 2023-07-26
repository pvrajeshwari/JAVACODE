package com.prime.encapsulation.runner;

import com.prime.encapsulation.app.HeadSet;
public class HeadSetRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Head Set Runner");
		
		HeadSet headset = new HeadSet();
		System.out.println(headset);
		headset.setHeadSet("One plus", "Oneplus Buds Bluetooth", 4999, "WireLess", "White");
		System.out.println("* * * * * * * * * * * * * * * * * *");
		System.out.println(headset);
	}

}
