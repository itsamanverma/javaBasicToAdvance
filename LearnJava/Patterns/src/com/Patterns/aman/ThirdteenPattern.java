package com.Patterns.aman;
import java.util.Scanner;
public class ThirdteenPattern 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Pattern Rows.");
      int n =sc.nextInt();
      //pattern like that..
      //        *
      //      * * *
      //    * * * * *
      //  * * * * * * *
      //* * * * * * * * *
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=n-i;j++)
    	  {
    		  System.out.print("  ");
    	  }
    	  for(int j=1;j<=2*i-1;j++)
    	  {
    		  System.out.print("* ");
    	  }
    	  System.out.println( );
      }
	}

}
