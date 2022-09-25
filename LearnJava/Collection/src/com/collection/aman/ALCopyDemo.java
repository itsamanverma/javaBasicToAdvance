package com.collection.aman;

import java.util.ArrayList;
import java.util.HashSet;

public class ALCopyDemo 
{
   public static void main(String[] args) 
   {
	   HashSet<String> set = new HashSet<String>();
	   set.add("Ajit");
	   set.add("Nikila");
	   set.add("Null");
	   set.add("Shishira");
	   set.add("Raghu");
	   
	   ArrayList<String> lst= new ArrayList<String>(set);
	   {
		   System.out.println(lst);
	   }
   }
}
