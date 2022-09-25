package com.collection.aman;
import java.util.ArrayList;
import java.util.ListIterator;
//write the program to Iterate the ArrayList in reverse Direction using  ListIterator.//
public class ArrayListIteratorDemo1 
{
  public static void main(String[] args) 
  {
	ArrayList<String> lst= new ArrayList<String>();
	lst.add("Red");
	lst.add("Blue");
	lst.add("White");
	lst.add("Yellow");
	lst.add("Green");
	
	ListIterator<String> itr=lst.listIterator(lst.size());
			while(itr.hasPrevious())
			{
				System.out.print(itr.previous()+" ");
			}
			// int n=((ListIterator<String>) lst).previousIndex();
		   //System.out.print(n+" ");
  }
}
