
package com.Patterns.aman;

import java.util.Scanner;

public class NineteenPattern {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Rows in Pattern");
       int n = sc.nextInt();
       //pattern like that..
       //0
       //1 0
       //2 1 0
       //3 2 1 0
       //4 3 2 1 0
       //5 4 3 2 1 0
       
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=i;j++) 
    	  {
    		System.out.print(i-j+" ");  
    	  }
    	  System.out.println( );
      }
	}

}
