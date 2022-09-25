package com.collection.aman;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapKeyValueDemo3
{
  public static void main(String[] args) 
  {
	//Map<pinCode,cityName>
	Map<Integer,String> map= new HashMap<Integer,String>();
	  map.put(560050,"Bangalore");
	  map.put(410782,"Dehli");
	  map.put(309867,"Trivendhram");
	  map.put(345675,"Nouth-bangalore");
	  map.put(406754,"Indore");
	  
	  Set<Integer> allKeys= map.keySet();
	  for(Integer pinCode:allKeys)
	  {
		  System.out.println(pinCode);
	  }
	  System.out.println("=======================");
	  Collection<String> allVals = map.values();
	  for(String cityName:allVals)
	  {
		  System.out.println(cityName);
	  }
  }
}
