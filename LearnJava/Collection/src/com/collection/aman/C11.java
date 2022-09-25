package com.collection.aman;

import java.util.ArrayList;
import java.util.Iterator;

public class C11 
{
 public static void main(String[] args) 
 {
   ArrayList<String> lst= new ArrayList<String>();
   lst.add("Blue");
   lst.add("Red");
   lst.add("Green");
   lst.add("White");
   lst.add("Yellow");
   
   Iterator<String> its= lst.iterator();
   while(its.hasNext())//hasNext() use to chexk The next elements are present or not//
   {
	   String ele=its.next();
	   System.out.println(ele.toUpperCase());
   }
 }
}
