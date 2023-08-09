package com.xworkz.abstraction.app;

public class Vikram {

	private Kidney kidney;

	public Vikram(Kidney kidney) {
		this.kidney = kidney;
		System.out.println("Kidney arguement constructor of Vikram");
	}

	public void check() {
		if(kidney!=null) {
			System.out.println("kidney is not null");
			this.kidney.Clean();
		}
		else {
			System.err.println("Kidney is null, kidney not working...");
		}
	}
}
