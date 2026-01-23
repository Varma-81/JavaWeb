package com.ibm.enums.types;

public enum Apples {
	RED_DEL(100),//object
	GOLDEN_DEL(200),
	FUJI(300),
	GREEN(400);
	
	private int price;
	
	private Apples(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	
	
}
