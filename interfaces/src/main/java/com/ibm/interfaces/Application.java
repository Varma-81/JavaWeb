package com.ibm.interfaces;


public class Application  
{
	public void permissionToLandFlyer(Flyer flyer)
	{
		flyer.fly();
	}
	public static void main( String[] args )
	{
		Application application = new Application();
		Airplane airplane = new Airplane();
		application.permissionToLandFlyer(airplane);
		
	}
}