package com.collection.aman;
import java.util.HashSet;
public class C9 
{
	public static void main(String[] args) 
	{
	  HashSet<String> set= new HashSet<String>();
	  set.add("Rama");
	  set.add("Shishira");
	  set.add("Ajit");
	  set.add("Raghu");
	  set.add("Nikila");
	  set.add(null);
	  set.add("Raghu");
	  System.out.print(set);
	}
}
