package com.collection.aman;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetCarDemo 
{
  public static void main(String[] args) 
  {
	Car c1 = new Car("Alto","KA15 AJ2258");
	Car c2 = new Car("Baleno","KA05 ME3697");
	Car c3 = new Car("Alto","KA15 AJ2258");
	
	LinkedHashSet<Car> set= new LinkedHashSet<Car>();
	set.add(c1);
	set.add(c2);
	set.add(c3);
	System.out.println("Size of set: "+set.size());
	for(Car c:set)
	{
		System.out.println(c+" ");
	}
	System.out.println("------------------");
	Iterator its=set.iterator();
	while(its.hasNext())
	{
		Car cr = (Car) its.next();
		System.out.println(cr);
	}
  }
}
