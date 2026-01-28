package com.ibm.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class Application
{
	public static void main( String[] args )
	{
//		Vector<Integer> v = new Vector<>(3);//Size.
		
		Vector<Integer> v =new Vector<>(3,2);//when full by 3 , it increases by 2.
		System.out.println("Initial size:"+v.size());
		System.out.println("Initial Capacity:"+v.capacity());
		
		v.add(1); 
	    v.add(2); 
	    v.add(3); 
	    v.add(4);
	    
	    System.out.println("Capacity after four additions: " + 
                v.capacity()); 
	    System.out.println("Initial size:"+v.size());
	    v.add(5); 
	    System.out.println("Current capacity: " + 
	                       v.capacity()); 
	    
	    v.add(6); 
	    v.add(7); 
	 
	    System.out.println("Current capacity: " + 
	                       v.capacity()); 
	    v.add(9); 
	    v.add(10); 
	 
	    System.out.println("Current capacity: " + 
	                       v.capacity()); 
 	    v.add(11); 
	    v.add(12); 
	    v.add(13);
	    System.out.println("Current capacity: " + 
                v.capacity()); 
	    
	    System.out.println("First Element:"+v.firstElement());
	    System.out.println("Last Element:"+v.lastElement());
	    
	    if(v.contains(3))
	    {
	    	System.out.println("Collection contains 3");
	    }
	    
	    System.out.println("\nElements in collection:"); 
	    Iterator<Integer> itr = v.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.print(itr.next()+" ");
	    }
	    System.out.println();



		
	}
}


//HashMap<String,Double> hm = new HashMap<String,Double>();
//hm.put("John Doe",new Double(3434.34));
//hm.put("Tom Smith", new Double(123.22));  
//hm.put("Jane Baker", new Double(1378.00));  
//hm.put("Tod Hall", new Double(99.22));  
//hm.put("Ralph Smith", new Double(-19.08));  
//
//Set<Entry<String,Double>> entry =hm.entrySet();
////Iterator<Entry<String,Double>> itr =entry.iterator();
//for(Entry<String,Double> me:entry)
//{
//	System.out.println(me.getKey()+"-->"+me.getValue());
//}
//
//Double balance = hm.get("John Doe");
//hm.replace("John Doe", balance+1000);
//
// System.out.println("John Doe's new balance: " +  
// hm.get("John Doe"));  
//


//ArrayList<String> al =new ArrayList<String>();
//
//al.add("C"); 
//al.add("A"); 
//al.add("E"); 
//al.add("B"); 
//al.add("D"); 
//al.add("F"); 
//
////Iteration.
//System.out.println("Original contents of al: "); 
//Iterator<String> iterator =al.iterator();
//while(iterator.hasNext())
//{
//	String value = iterator.next();
//	System.out.print(value+" ");
//}
//System.out.println(); 
//
//ListIterator<String> itr =al.listIterator();
//while(itr.hasNext())
//{
//	String value = itr.next();
//	itr.set(value+"+");
//}
//
//System.out.print("Modified contents of al: "); 
//iterator = al.iterator();  
//while(iterator.hasNext()) { 
//  String element = iterator.next(); 
//  System.out.print(element + " "); 
//} 
//System.out.println(); 
//
//
//System.out.println("Reverse Order");
//while(itr.hasPrevious())
//{
//	String element = itr.previous();
//	System.out.print(element+" ");
//}
//System.out.println(); 




//ArrayList<String> result = new ArrayList<>();
//result.add("B");
//result.add("C");
//result.add("D");
//result.add("X");
//result.add("Y");
//result.add("Z");
//result.add("A");
//
//result.add(1,"A2");
//System.out.println(result);
//
//System.out.println("Original Content of the result :"+result);
//
//System.out.println(result.remove("F"));//Removes the element if exists and return true else false
//result.remove(2);
//System.out.println("Contents of result after deletion: " 
//        + result); 
//
//result.remove(0);
//result.remove(result.size()-1);
//
// System.out.println("result after deleting first and last: " 
//         + result); 
//
// String val = result.get(2);
// result.add(2, val+"Changed");
// System.out.println("result after change: " + result);