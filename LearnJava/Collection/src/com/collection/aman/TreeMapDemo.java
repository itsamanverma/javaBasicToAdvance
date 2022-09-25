package com.collection.aman;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo 
{
  public static void main(String[] args)
  {
	Map<Integer,String> map=new TreeMap<Integer,String>();
	  map.put(560050,"Bangalore");
	  map.put(410782,"Dehli");
	  map.put(309867,"Trivendhram");
	  map.put(345675,"Nouth-bangalore");
	  map.put(406754,"Indore");
	  
	  Set<Entry<Integer,String>> set =map.entrySet();
	  for(Entry<Integer,String> entry:set)
	  {
		  System.out.println(entry.getKey());
	  }
	  System.out.println("=================================");
	  
	  Iterator itr =set.iterator();
	  while(itr.hasNext())
	  {
		  Map.Entry<Integer, String> entry=(Entry<Integer,String>) itr.next();
		  System.out.println("Keys:"+"   "+entry.getKey()+"-----"+"Vals:"+"  "+entry.getValue());
		  
	  }
  }
}
