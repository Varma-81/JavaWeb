package com.ibm.oops;

//import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.Finance;
import com.ibm.oops.payroll.HR;
import com.ibm.oops.payroll.PermanentEmployee;

public class Application
{

	public static void main( String[] args )
	{
		Finance finance = new Finance();
		
		Employee employee = HR.recruit("i");
		if(employee!=null)
		{
			finance.processPay(employee);
		}
	
		employee=HR.recruit("p");
		if(employee!=null)
		{
			finance.processPay(employee);
		}
		
		employee = HR.recruit("f");
		if(employee!=null)
		{
			finance.processPay(employee);
		}
		
		
		
	}
}


//long l = 10;//implict conversion // upcasting.
//
//float f = (float) 10.2;//explict conversion //downcasting // take two operands (),value.
//
// Calendar calendar= new GregorianCalendar(); // Base - Calender , Dervied - GC. //implict-UpCasting.
// 
// System.out.println(calendar.get(Calendar.DATE));
// 
// GregorianCalendar gregorianCalendar =(GregorianCalendar) calendar;
// System.out.println(gregorianCalendar.get(Calendar.YEAR));
// System.out.println(Calendar.YEAR);
//
// List<String> list = new LinkedList<String>();
// if(list instanceof ArrayList)
// {
//	 ArrayList<String> arrayList=(ArrayList<String>)list;
// }