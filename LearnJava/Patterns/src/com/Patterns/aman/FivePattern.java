package com.Patterns.aman;
import java.util.Scanner;
public class FivePattern 
{
	public static void main(String[] args)  
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no row..");
       int n = sc.nextInt();
       //pattern 
       //* * * * *
       //* * * *
       //* * *
       //* *
       //*
       for(int i=n;i>=1;i--)
       {
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print("* ");
    	   }
    	   System.out.println( );
       }
	}
}
