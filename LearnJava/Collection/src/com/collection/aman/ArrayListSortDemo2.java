package com.collection.aman;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSortDemo2 
{
  public static void main(String[] args) 
  {
	Double d1 = new Double(80.5);
	Double d2 = new Double(20.6);
	Double d3 = new Double(30.7);
	Double d4 = new Double(50.2);
	
	ArrayList<Double> lst = new ArrayList<Double>();
	lst.add(d1);
	lst.add(d2);
	lst.add(d3);
	lst.add(d4);
	
	Collections.sort(lst);
	System.out.println(lst);
	System.out.println("-------------------------------");
	Collections.sort(lst);
	for(Double d:lst)
	{
		System.out.println(d);
	}
  }
}
