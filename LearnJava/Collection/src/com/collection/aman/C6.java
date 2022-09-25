package com.collection.aman;
import java.util.LinkedList;
import java.util.List;

public class C6 
{
  public static void main(String[] args)
  {
    List<String> lst=new LinkedList<String>();
    lst.add("Shishira");
    lst.add("Ajit");
    lst.add("Raghu");
    lst.add("Nikila");
    lst.add(2,"Kishana");
    
    for(String s:lst)
    {
    	System.out.print(s+" ");
    }
  }
}
