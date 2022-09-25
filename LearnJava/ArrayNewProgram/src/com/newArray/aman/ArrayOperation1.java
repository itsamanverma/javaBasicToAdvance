package com.newArray.aman;
import java.util.Scanner;
public class ArrayOperation1 
{

	 int[] readArray()
	  {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Size of the Array..");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    System.out.println("Enter "+n+" integer");
	    for(int i=0;i<arr.length;i++)
	     {
		   arr[i]=sc.nextInt();
	     }
	      return arr;
	  }
	 
	  void dispArray(int a[])
	  {
		  
	  }
}
