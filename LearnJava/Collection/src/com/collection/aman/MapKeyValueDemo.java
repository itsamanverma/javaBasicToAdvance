package com.collection.aman;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapKeyValueDemo 
{
   public static void main(String[] args) 
   {
	 Map<Integer,String> map= new HashMap<Integer,String>();
	  map.put(560050,"Bangalore");
	  map.put(410782,"Dehli");
	  map.put(309867,"Trivendhram");
	  map.put(345675,"Nouth-bangalore");
	  map.put(406754,"Indore");
	
	  Set<Entry<Integer,String>> set=map.entrySet();
	  System.out.println(set);
   }
}
