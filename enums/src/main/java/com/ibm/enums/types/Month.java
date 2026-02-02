package com.ibm.enums.types;

public enum Month {
	JAN(31),
	FEB(28),
	MAR(31),
	APR(30),
	MAY(31),
	JUN(30),
	JULY(31),
	AUG(31),
	SEP(30),
	OCT(31),
	NOV(30),
	DEC(31);
	
	private int day;
	
	Month(int day)
	{
		this.day=day;
	}

	public int getDay() {
		return day;
	}
	
	
}
