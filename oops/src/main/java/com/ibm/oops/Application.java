package com.ibm.oops;

import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.PermanentEmployee;

public class Application
{
	public static void main( String[] args )
	{
		Employee emp = new PermanentEmployee();
		emp.netPay();
	}
}