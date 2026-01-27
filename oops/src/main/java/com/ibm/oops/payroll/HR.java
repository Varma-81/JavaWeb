package com.ibm.oops.payroll;

public class HR {
	public static Employee recruit(String empType)
	{
		if(empType.equalsIgnoreCase("I"))
		{
			Intern intern =new Intern();
			return intern;
		}else if(empType.equalsIgnoreCase("P"))
		{
			PermanentEmployee permanentEmployee =new PermanentEmployee();
			return permanentEmployee;
		}else if(empType.equalsIgnoreCase("F"))
		{
			Freelancer freelancer= new Freelancer();
			return freelancer;
		}
		return null;
		
	}
	
}
