package com.collection.aman;

import java.util.Collections;
import java.util.LinkedList;

public class MobileSortDemo 
{
  public static void main(String[] args) 
  {
	 MobileComparable m1 = new MobileComparable("iPhoneX","Red");
	 MobileComparable m2 = new MobileComparable("S9","White");
	 MobileComparable m3 = new MobileComparable("onePlus6T","RoseGold");
	 
	 LinkedList<MobileComparable> lst=new LinkedList<MobileComparable>();
	   lst.add(m1);
	   lst.add(m2);
	   lst.add(m3);
	   
	  for(MobileComparable mob:lst)
	  {
		  System.out.println(mob);
	  }
	  
	  System.out.println( "---------------------");
	  Collections.sort(lst);
	  for(MobileComparable mob:lst)
	  {
		  System.out.println(mob);
	  }
	  System.out.println("----------------------");
	  System.out.println(lst);
  }
}
