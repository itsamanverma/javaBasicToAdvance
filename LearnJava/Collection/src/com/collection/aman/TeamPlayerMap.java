package com.collection.aman;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TeamPlayerMap //Player.java connectivity 
{
public static void main(String[] args) 
  {
	 Player p1 = new Player(7,"Dhoni");
	 Player p2 = new Player(18,"Kohli");
	 Player p3 = new Player(333,"Gayle");
	 Player p4 = new Player(7,"Dhoni");
	 
	 //map<K,V>;
	 Map<Player,String> map= new HashMap<Player,String>();
	 
	 map.put(p1,"CSK");
	 map.put(p2,"RCB");
	 map.put(p3,"KXIP");
	 map.put(p4,"CSK");
	 
	 
	 Set<Entry<Player,String>> set= map.entrySet();
	 for(Entry<Player,String> entry:set)
		 {
			 Player p = entry.getKey();
			 String val= entry.getValue();
			 System.out.println("Keys:"+"  "+p+"\n"+"Vals:"+"  "+val);
		 }
  }
}
