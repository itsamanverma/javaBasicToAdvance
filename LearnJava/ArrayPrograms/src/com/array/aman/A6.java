package com.array.aman;

import java.util.Scanner;

public class A6 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array..");
      int n = sc.nextInt();
   
      int arr[] = new int[n];
      System.out.println("read the element of Array....");
      for(int i=0;i<arr.length;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      System.out.println("Enter the items which do u want in aaray.. ");
      int items=sc.nextInt();
      
      for(int i=0;i<arr.length;i++)
      {
    	  int my_array=arr[i];
      }
      System.out.println(contains(arr,items));
   }
   public static boolean contains(int[] my_array, int items)
   {
	   for(int i=0;i<my_array.length;i++)
	   {
	   if(my_array[i]==items)
		    return true;  
	   }
	   return false;
   }
   
}
