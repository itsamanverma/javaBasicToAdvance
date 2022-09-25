package com.Patterns.aman;

import java.util.Scanner;

public class TwentyteenPattern 
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the rows in Pattern..");
     int n = sc.nextInt();
     //pattern like that..
     //1
     //1 0
     //1 0 1
     //1 0 1 0
     //1 0 1 0 1
     //1 0 1 0 1 0
     
     for(int i=1;i<=n;i++)
     {
    	 for(int j=1;j<=i;j++)
    	 {
    		 System.out.print(j%2+" ");
    	 }
    	 System.out.println( );
     }
  }
}
