package com.ibm.arrays;

//class Point
//{
//	int x;
//	int y;
//	public Point(int x,int y)
//	{
//		this.x=x;
//		this.y=y;
//	}
//}


class Test
{
//	int num ; //class scope -accessibility// instance varible-ownership.
	
	static int num;//class varible;
	
	public void testing()
	{
		int value;//local scope
	}
	
}

public class Application
{
	
	
	public static void main( String[] args )
	{
		
		Test test1 = new Test();
		Test test2 = new Test();
		
		test1.num=1;
		test2.num=2;
		
		Test.num=10;
		System.out.println(test1.num+","+test2.num);
		
		
		
		
		
//		int numbers[];
//		
//		numbers = new int[5];
//		
//		System.out.println(numbers.length);
//		
//		numbers[2] = 6;
//		
//		for(int num:numbers)
//		{
//			System.out.println(num);
//		}
		
//		Integer numbers[];
//		numbers = new Integer[5];
//		
//		System.out.println(numbers.length);
//		
//		numbers[0]=1;//AutoBoxing
//		numbers[1]=2;
//		numbers[2]=3;
//		numbers[3]=4;
//		numbers[4]=5;
		
//		for(Integer num:numbers)
//		{
//			System.out.println(num);
//		}
		
//		Point[] points;
//		points = new Point[3];
//		
//		points[0] = new Point(2,4);
//		points[1] = new Point(3,6);
//		points[2] = new Point(4,8);
//		
//		for(Point point:points)
//		{
//			System.out.println(point.x+","+point.y);
//		}
//		
		
//		int[][] nums;
//		nums = new int[3][2];
//		
//		nums[1][1]=4;
//		
//		for(int[] firstDim:nums)
//		{
//			for(int value:firstDim)
//			{
//				System.out.print(value);
//			}
//			System.out.println();
//		}
		
		
		
		
		
	}
}