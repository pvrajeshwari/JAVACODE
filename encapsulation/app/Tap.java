package com.prime.encapsulation.app;

public class Tap {

	private String brandName;
	private int price;
	private String modelName;
	private String type;
	private String color;
	
	
	public void setTap(String brandName,int  price, String modelName, String type, String color)
	{
		this.brandName = brandName;
		this.color = color;
		this.modelName = modelName;
		this.price = price;
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "brandName is = " + brandName + "\n" + "color is = " + color + "\n" + "modelName is = " + modelName 
									+ "\n" + "price is = " + price + "\n" + "type is = " + type;
	}


}



