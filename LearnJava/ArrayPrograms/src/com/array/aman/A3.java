package com.array.aman;
import java.util.Scanner;
public class A3 
{
   public static void main(String[] args) 
   { 
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter the length of Array");
	   int length=input.nextInt();
	   
	   String[] names = new String[length];// Array declaration with  Allocation
	   
	   for(int i=0;i<length;i++)
	   {
		   System.out.println("Enter the Name of Friends"+ i+1);
		   names[i]=input.next();
	   }
	   input.close();
	   
	      System.out.print("Yoyrs frinends are"+"\n");
	      for(int i=0;i<length;i++)
	      {
	    	  System.out.println(names[i]);
	      }
   }
}
