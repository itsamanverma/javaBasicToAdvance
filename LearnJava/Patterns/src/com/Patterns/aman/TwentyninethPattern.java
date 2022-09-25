package com.Patterns.aman;

import java.util.Scanner;

public class TwentyninethPattern 
{
   public static void main(String[] args) 
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Rows in Pattern..");
	  int n = sc.nextInt();
	  //Pattern like that-
	  //4 
	  //5 5 
	  //6 6 6
	  //7 7 7 7 
	  //7 7 7 7 
	  //6 6 6
	  //5 5
	  //4
	  int ele=1;
	  for(int i=1;i<=n;i++)
	   {
		for(int j=1;j<=ele;j++)
		{
			System.out.print(n/2+ele-1);
		}
		if(i<n/2)
			ele++;
		if(i>n/2)
			ele--;
		System.out.println();
	   }
   }
}
