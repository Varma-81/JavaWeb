package com.ibm.exception;

class IllegalException extends Exception
{
	@Override
	public String getMessage() {
		return "You need to be 18 or above to register for voting";
		
	}
}

class Voting
{
	void register(int age) throws IllegalException
	{
		if(age<18)
		{
			throw new IllegalException();
		}
	}
}

public class Application {
	public static void main(String[] args) {
		
//------Custom Exception------------
//		Voting voting = new Voting();
//		try {
//			voting.register(17);
//		} catch (IllegalException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Catch Block Executed");
//		}
//		System.out.println("THE END");
		
		
// -----------ASSERTIONS-------------------
		assert (new Arithmetic().sum(2,4)==6):"You ";
		System.out.println("THE END");
		
		
		
	}
}

//-----------EXCEPTION-------------------
//	try {
//		System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
//	} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
//		System.out.println("You need to provide 2 numbers");
//	} catch (ArithmeticException e) {
//		System.out.println("You can't divide by zero");
//	}  catch (Exception e) {
//		System.out.println("Unknown Exception");
//	}
//	
//		System.out.println("!THE END");
//	
//}

//catch (NumberFormatException e) {
//	System.out.println("You need to provide 2 valid numbers");
//}