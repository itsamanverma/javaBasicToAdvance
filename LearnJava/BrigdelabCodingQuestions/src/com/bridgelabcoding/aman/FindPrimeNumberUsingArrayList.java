package com.bridgelabcoding.aman;
import java.util.ArrayList;
import java.util.List;
public class FindPrimeNumberUsingArrayList 
{
	public static void main(String[] args) 
	{
	  int n=10;
	  List<Integer> list = new ArrayList<Integer>();
	  for(int i=1;i<=n;i++)
	  {
		  list.add(i);
	  }
	 System.out.println(list);
	  
	  for(int i=0;i<list.size()-1;i++)
	  {
		  if(!isPrime(list.get(i)))
		  {
			  list.remove(list.get(i));
		  }
	  }
	  System.out.println(list);
	}
	private static boolean isPrime(int n) 
	{
	    boolean itIs=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				itIs=false;
				break;
			}
		}
		return itIs;
	}
}
