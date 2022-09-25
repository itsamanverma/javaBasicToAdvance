package com.Patterns.aman;
import java.util.Scanner;
public class EightteenPattern 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the rows In Patterns...");
      int n = sc.nextInt();
      //pattern like that..
      //1
      //2 4
      //3 6 9
      //4 8 12 16
      //5 10 15 20 25
      
      for( int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=i;j++) 
    	  {
    		System.out.print(i*j+" ");  
    	  }
    	  System.out.println( );
      }
	}

}
