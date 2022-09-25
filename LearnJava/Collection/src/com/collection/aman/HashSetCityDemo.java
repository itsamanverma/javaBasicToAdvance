package com.collection.aman;
import java.util.HashSet;
public class HashSetCityDemo 
{
   public static void main(String[] args) 
   {
	  City2 c1= new City2(560050,"Bangalore");
	  City2 c2= new City2(470084,"Delhi");
	  City2 c3=new City2(560050,"Bangalore");
	  
	  HashSet<City2> set= new HashSet<City2>();
	  set.add(c1);
	  set.add(c2);
	  set.add(c3);
	  set.add(null);
	  System.out.print("size of set "+"= "+ set.size());
	  System.out.println();
	  for(City2 c:set)
	  {
		  System.out.print(c+" ");
	  }
   }
}
