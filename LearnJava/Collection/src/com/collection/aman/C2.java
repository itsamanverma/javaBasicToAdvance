package com.collection.aman;
import java.util.ArrayList;
public class C2 
{
   public static void main(String[] args) 
   {
	  ArrayList<String> lst=new ArrayList<String>();
	  lst.add("Ajit");
	  lst.add("Raghu");
	  lst.add("ShiShira");
	  lst.add("Null");
	  lst.add("Mahesh");
	  lst.add("Nikila");
	  lst.add("Ajit");
	  
	  for(int i=0;i<lst.size();i++)
	  {
		  String s=lst.get(i);
		  System.out.print(s+" ");
	  }
	  System.out.println();
	  for(String s:lst)
	  {
		  System.out.print(s+" ");
	  }
   } 
}
