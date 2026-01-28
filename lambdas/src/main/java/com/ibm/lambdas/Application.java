package com.ibm.lambdas;

interface Printer
{
	public void printing(String name,int count);//functional interface
}
class Process
{
	public void execute(String printerName,int count,Printer printer)
	{
		printer.printing(printerName,count);
	}
}

public class Application
{

	 static void printIt(String name,int count)
	{
		System.out.println(name+" printer printing "+count+" pages");
	}
	 
	public static void main( String[] args )
	{
		Stream.displayStream();
//		Process process = new Process();
//		process.execute("HP",5,Application::printIt);
//		
//		process.execute("Canon", 8,(pname,count)->System.out.println(pname+" printer printing "+count+" pages"));
//		
//		process.execute("HP",(pname)-> System.out.println(pname+" printer Printing"));
//		process.execute("HP",System.out::println);//lambda Method Reference.
//		process.execute("Canon",(pname)-> System.out.println(pname+" printer Printing"));
		
		
	}
}