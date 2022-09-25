 package com.collection.aman;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMetthodDemo 
{
  public static void main(String[] args) 
  {
	//Map(eid,ename)//
	  Map<Integer,String> map = new HashMap<Integer,String>();
	  map.put(1,"Aman");
	  map.put(2,"Swarna");
	  map.put(3,"Mini");
	  map.put(4,"Sona");
	  map.put(5,"Riya");
	 Set<Integer> allKeys= map.keySet();
	 for(Integer i:allKeys)
	 {
		 System.out.print(i+"  ");
	 }
	 System.out.println();
	 System.out.println("----------------");
	 Collection<String> vals=map.values();
	 for(String val:vals)
	 {
		 System.out.print(val+" ");
	 }
	 System.out.println();
	 System.out.println(map);
	 System.out.println(map.containsKey(1));
	 System.out.println(map.containsKey(25));
	 System.out.println(map.containsValue("Swarna"));
	 System.out.println(map.containsValue("Ankita"));
	 map.remove(2);
	 System.out.print(map+" ");
  }
}
