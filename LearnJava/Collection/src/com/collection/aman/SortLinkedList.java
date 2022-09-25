package com.collection.aman;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class SortLinkedList
{
  public static void main(String[] args) 
  {
	
	    Car1 c1 = new Car1("Alto",5000000);
		Car1 c2 = new Car1("Baleno",650000);
		Car1 c3 = new Car1("Alto",700000);
		
		LinkedList<Car1> lst = new LinkedList<Car1>();
		lst.add(c1);
		lst.add(c1);
		lst.add(c1);
		System.out.println("Size Of LinkedList:"+lst.size());
		
		System.out.println("-------------------");
		//Collections.sort(lst);
		 ListIterator<Car1> itr= lst.listIterator();
		 while(itr.hasNext())
		 {
			 Car1 model = itr.next();
			 System.out.print(model+" ");
         }
		
    }
  }
