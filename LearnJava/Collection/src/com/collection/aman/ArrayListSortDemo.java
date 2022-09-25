package com.collection.aman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortDemo 
{
  public static void main(String[] args) 
  {
	List<String> lst= new ArrayList<String>();
	lst.add("Red");
	lst.add("White");
 	lst.add("Yellow");
	lst.add("Blue");
	lst.add("Green");
	
	//To sort ArrayList we use the  inbuilt Utility(method) of Collections Class//
	
	Collections.sort(lst);//Ascending order 
	System.out.println(lst);
	//Reverse(Descending Order) Sorting
	System.out.println("----------------------------------");
	Collections.sort(lst,Collections.reverseOrder());
	System.out.println(lst);
  }
}
