package com.ibm.objectclass;

class Point
{
	public int x;
	public int y;
	
	public boolean equals(Object target)
	{
		if(target!=null && target instanceof Point)
		{
			Point point2=(Point)target;
			if(this.x == point2.x && this.y == point2.y)
			{
				return true;
			}
		}
		return false;
		
	}
}

public class Application
{
	public static void main( String[] args )
	{
		Point point1,point2;
		
		point1 = new Point();
		point2 = new Point();
		
		point1.x=10;
		point1.y=19;
		
		point2.x=10;
		point2.y=19;
		
		System.out.println(point1.equals(point2));
		System.out.println(point1);
	}
}