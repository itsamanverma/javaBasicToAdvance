package com.Patterns.aman;
import java.util.Scanner;
public class NinePattern 
 {
	public static void main(String[] args)  
	{
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter The Pattern rows..");
      int n =sc.nextInt();
      //pattern like that..
      //* * * * *
      //* * * * 
      //* * *
      //* *
      //*
      int i=1;
      while(i<=n)
      {
    	  int j=n;
    	  while(j>=i)
    	  {
    		  System.out.print("* ");
    		  j--;
    	  }
    	  System.out.println( );
    	  i++;
      }
    		  
	}

}
