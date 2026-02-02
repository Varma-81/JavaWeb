package com.ibm.enums;

import com.ibm.enums.types.Apples;
import com.ibm.enums.types.Month;

//enum enumerated => consists elements of same type

public class Application
{
	public static void main( String[] args )
	{
		
		Month month ;
		month = Month.AUG;
		System.out.println(month);
		
		Month[] months=Month.values();
		for(Month m:months)
		{
			System.out.println(m+" HAS DAY "+m.getDay());
		}
		
		Month m = Month.valueOf("FEB");
		System.out.println(m);
		Month dec = Month.valueOf("DEC");
		System.out.println("DEC "+dec.getDay());
		
		
//		Apples apple1;
//		apple1 = Apples.FUJI;
//		System.out.println(apple1);
//		
//		Apples[] apples = Apples.values();
//		for(Apples apple:apples)
//		{
//			System.out.println(apple+" 1 kg is :"+apple1.getPrice());
//		}
//		
//		Apples gold_del = Apples.valueOf("GOLDEN_DEL");
//		System.out.println(gold_del);
		
		
	}
}