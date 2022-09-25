package com.collection.aman;

import java.util.LinkedList;

public class C4 
{
  public static void main(String[] args) 
  {
	LinkedList<String> lst= new LinkedList<String>();
	lst.add("Rama");
	lst.add("Shama");
	lst.add("Bhama");
	lst.add("Arindam");
	lst.add(2,"Kishan");
	lst.add("Nama");
	
	for(String s:lst)
	{
		System.out.print(s+" ");
	}
	lst.add(4,"Aman");
	System.out.println();
	for(String s:lst)
	{
		System.out.print(s+" ");
	}
  }
}
