package com.xworkz1.casting;

public class ShoeUtil {
		
		static void check(Shoe shoe) {
			if(shoe != null) {
				System.out.println("Price : "+shoe.price);
				System.out.println("Color : "+shoe.color);
				System.out.println("Size : "+shoe.size);
			}
			
			if(shoe instanceof PumaShoe) {
				PumaShoe puma = (PumaShoe)shoe;
				puma.printInfo();
			}
			
			if(shoe instanceof NikeShoe) {
				NikeShoe nike = (NikeShoe)shoe;
				nike.printInfo();
			}
		}

	}

