package com.ibm.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Application
{
	
//	public Collection<String> getData(){
//		Collection<String> result =new LinkedList<String>();
//		result.add("A");
//		result.add("C");
// 		result.add("B");
// 		result.add("E");
// 		result.add("C");
//		return result;
//	}
	
	public Map<Integer,String> getData(){
		Map<Integer,String> result =new HashMap<Integer,String>();
		result.put(1,"A");
		result.put(2,"C");
 		result.put(3,"B");
 		result.put(4,"E");
 		result.put(5,"C");
 		result.put(6,"F");
		return result;
	}
	
	public static void main( String[] args )
	{
		//Point<Float> point1 = new Point<Float>(3.5f,2.5f);
		//System.out.println(point1.getX()+" , "+point1.getY());
		
		//Point<Integer> point2 = new Point<Integer>(3,2);
		//System.out.println(point2.getX()+" , "+point2.getY());
		
		//ArrayList<String> arrayList = new ArrayList<String>();
		//arrayList.add("A");
		//arrayList.add("B");
		//arrayList.add("D");
		//arrayList.add("E");
		//arrayList.add("C");
		
		
//		Application application =new Application();
//		Collection<String> data = application.getData();
//		
//		Iterator<String> iterator=data.iterator();
//		
//		while(iterator.hasNext())
//		{
//			String text =iterator.next();
//			System.out.println(text);
//		}
//		
//		Set<Integer> keys = data.keySet();
//		Iterator<Integer> keyIterator = key.Iterator();
//		while(keyIterator.hasNext()) {
//			Integer key = keyIterator.next();
//			String valu = data.get(key);
//			System.out.println(key+"--->"+value);
//		}
		
		
		
		
		Application application =new Application();
		Map<Integer,String> data = application.getData();
		 Set<Entry<Integer,String>> entrySet = data.entrySet();
		Iterator<Entry<Integer,String>> entrySetIterator = entrySet.iterator();
		while(entrySetIterator.hasNext())
		{
		Entry<Integer,String> entry = entrySetIterator.next();
		System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	
	}
}


	