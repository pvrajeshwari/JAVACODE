package com.xworkz1.casting;
public class ShoeRunner {

	public static void main(String[] args) {
		
		Shoe shoe1 = new Shoe(1500, ShoeColor.BLUE, ShoeSize.TEN);
		ShoeUtil.check(shoe1);
		
		Shoe shoe2 = new PumaShoe("Casuals", "India", 3500, ShoeColor.BLACK, ShoeSize.EIGHT);
		ShoeUtil.check(shoe2);
		
		Shoe shoe3 = new NikeShoe("John Donahoe", "Rory Mcllory", 4000, ShoeColor.RED, ShoeSize.TEN);
		ShoeUtil.check(shoe3);
	
	}

}


