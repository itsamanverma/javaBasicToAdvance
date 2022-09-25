package com.collection.aman;
import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListIteratorDemo 
{
  public static void main(String[] args) 
  {
	 ArrayList<String> lst = new ArrayList<String>();
	 lst.add("Red");
	 lst.add("White");
	 lst.add("Blue");
	 lst.add("Green");
	 lst.add("Yellow");
	 lst.add(null);
	 
	 ListIterator<String> itr= lst.listIterator();
	 while(itr.hasNext())
	 {
		 String clr = itr.next();
		 System.out.print(clr+" ");
		 //if(clr.equals("Black"))
		 //itr.remove(); 
	 }
  }
}
