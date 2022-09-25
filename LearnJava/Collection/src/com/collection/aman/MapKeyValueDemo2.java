package com.collection.aman;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapKeyValueDemo2 
{
  public static void main(String[] args)
  {
	 // Map<pinCode,cityName>
	 Map<Integer,String> map=new HashMap<Integer,String>();
	  map.put(560050,"Bangalore");
	  map.put(410782,"Dehli");
	  map.put(309867,"Trivendhram");
	  map.put(345675,"Nouth-bangalore");
	  map.put(406754,"Indore");
	  
	  Set<Entry<Integer,String>> set = map.entrySet();
	  //First way of Iteration of Map interface
	  for(Entry<Integer,String> entry:set)
	  {
		  Integer key= entry.getKey();
		  String value=entry.getValue();
		  System.out.println(key+"--------"+value);
	  }
	  System.out.println("============================");
	  //Second Way of Iteration of Map interface
	/* using for-each loop for iteration over Map.entrySet() */
	  Iterator itr =set.iterator();
	      while(itr.hasNext())
	      {
	    	 Map.Entry<Integer,String> entry= (Entry<Integer, String>) itr.next();
	    	  System.out.println("Keys: "+"  "+entry.getKey()+"\n"+"Values: "+"  "+entry.getValue());
	      }
	      System.out.println("===========================");
	   //Third Way of Iteration of Map interface
	      for(Integer keys: map.keySet())
	      System.out.println("Keys:"+"   "+keys);
	      for(String values: map.values())
	    	  System.out.println("Values:"+"  "+values);
	      System.out.println("===========================");
	      //Fourth way of Iteration Of Map Interface//
	      
	      map.forEach((Integer,String)->  System.out.println("Keys: "+"  "+Integer+"\n"+"Values: "+"  "+String));
	      
	      System.out.println("===========================");
	      //fifth way Of Iteration Of Map Interface// 
          /* Iterating over keys and searching for values (inefficient)*/	
	      for(Integer keys:map.keySet())
	      {
	    	  //Search the Values 
	    	  String url=map.get(keys);
	    	  System.out.println("Keys:"+"  "+keys+"\n"+"Values:"+"   "+url);
	      }
  }
}
