package com.Patterns.aman;

import java.util.Scanner;

public class SeventeenPattern {

	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Row In Pattern..");
      int n = sc.nextInt();
      //pattern like that..
      //2
      //3 4
      //4 5 6
      //5 6 7 8
      //6 7 8 9 10
      //7 8 9 10 11 12
      
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=i;j++)
    	  {
    		  System.out.print(i+j+" ");
    	  }
    	  System.out.println( );
    	   
      }
	}

}
