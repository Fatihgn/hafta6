package Recursive;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class hashmap {
	
	public static void main(String[] args) {
		LinkedList<String> cars=new LinkedList<String>();
		Integer a = 5;
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add(1,"Fiat");
		Iterator<String> it=cars.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		
		System.out.println(a.doubleValue());
		
		  
		  
		/*  
		System.out.println(cars.get(0).hashCode());
		System.out.println(cars.get(1).hashCode());
		String a = cars.get(1);
		System.out.println(a.hashCode());
		String b="Fiat";
		if(a=="BMW")
			System.out.println("Eşitlik sağlandi");
		else if(b.equals(cars.get(1)))
			System.out.println("equals saglandi");
		else
			System.out.println("eşitlik sağlanamadi");
		
		HashMap<String,Integer> people = new HashMap<String,Integer>();
		people.put("ahmet", 32);
		people.put("mehmet", 40);
		people.put("ali", 25);
		for(String i:people.keySet())
		{
			System.out.println("key : "+i+" Value : "+people.get(i));
		}
		*/

	}

}
