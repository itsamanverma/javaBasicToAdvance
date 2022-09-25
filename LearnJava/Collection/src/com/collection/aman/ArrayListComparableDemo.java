package com.collection.aman;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListComparableDemo 
{
  public static void main(String[] args) 
  {
	  StudentComparableDemo s1 = new StudentComparableDemo(83.4,"AMAN");
	  StudentComparableDemo s2 = new StudentComparableDemo(80.1,"MINI");
	  StudentComparableDemo s3 = new StudentComparableDemo(75.5,"SONA");
	  
	  ArrayList<StudentComparableDemo> lst = new ArrayList<StudentComparableDemo>();
	  lst.add(s1);
	  lst.add(s2);
	  lst.add(s3);
	  
	  Collections.sort(lst);
	  System.out.println(lst);
	  
	  System.out.println("-------------------------------");
	  
	  Collections.sort(lst,Collections.reverseOrder());
	  for(StudentComparableDemo s:lst)
	  {
		  System.out.println(s); 
	  }
	  
	  
  }
}
