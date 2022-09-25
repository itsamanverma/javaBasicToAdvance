package com.Patterns.aman;
import java.util.Scanner;
public class FourPattern {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the How many row do u want in your series.");
       int n = sc.nextInt();
       System.out.println("here your pattern is.");
       //pattern like that
       //* * * * *
       //* * * *
       //* * *
       //* *
       //*
       for(int i=1;i<=n;i++)
       {
    	   for(int j=1;j<=n-i+1;j++)
    	   {
    		   System.out.print("* ");
    	   }
    	   System.out.println( );
       }
	}
}
