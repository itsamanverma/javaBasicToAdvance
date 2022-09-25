package com.Patterns.aman;

import java.util.Scanner;

public class SixteenPattern {

	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Rows Requird in Pattern...");
      int n = sc.nextInt();
      //pattern like that..
      //1
      //1 2
      //1 2 3
      //1 2 3 4
      //1 2 3 4 5
      //1 2 3 4 5 6
       
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=i;j++)
    	  {
    		  System.out.print(j+" ");
    	  }
    	  System.out.println( );
      }
	}

}
