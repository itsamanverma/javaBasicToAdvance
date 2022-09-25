package com.Patterns.aman;
import java.util.Scanner;
public class FourTeenPattern 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Rows In Petterns..");
      int n = sc.nextInt();
      // pattern like that
      //* * * * * * * * * 
      //  * * * * * * *
      //    * * * * *
      //      * * *
      //        *
      
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=i-1;j++)
    	  {
    		  System.out.print("  ");
    	  }
    	  for(int j=1;j<=2*(n-i)+1;j++)
    	  {
    		  System.out.print("* ");
    	  }
    	  System.out.println( );
      }
      
	}

}
