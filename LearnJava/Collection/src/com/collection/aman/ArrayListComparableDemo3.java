package com.collection.aman;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListComparableDemo3 
{
  public static void main(String[] args) 
  {
	  StudentComparableDemo2 s1= new StudentComparableDemo2(75.5,"Swarna");
	  StudentComparableDemo2 s2= new StudentComparableDemo2(79.9,"Shama");
	  StudentComparableDemo2 s3= new StudentComparableDemo2(84.5,"Rama");
	  StudentComparableDemo2 s4= new StudentComparableDemo2(91.5,"Sona");
	  
	  List<StudentComparableDemo2> lst = new LinkedList<StudentComparableDemo2>();
	  lst.add(s1);
	  lst.add(s2);
	  lst.add(s3);
	  lst.add(s4);
	  
	  Collections.sort(lst);
	  for(StudentComparableDemo2 s:lst)
	  {
		  System.out.println(s.name);
		  System.out.println("--------------------------");
		  System.out.println(s);//Not confused because Sorting done based on name not  percentage//
	  }
	  
  }
}
