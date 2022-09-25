package com.Patterns.aman;

import java.util.Scanner;

public class TwentysixPattern 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the rows In Pattern");
      int n = sc.nextInt();
      //pattern like that..
      //1
      //0 1
      //0 1 0
      //1 0 1 0
      //1 0 1 0 1
      //0 1 0 1 0 1
      //0 1 0 1 0 1 0
      int k=1;
      for(int i=1;i<=n;i++)
      {
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print(k%2+" ");
    		k++;
    	}
    	System.out.println( );
      }
	}

}
