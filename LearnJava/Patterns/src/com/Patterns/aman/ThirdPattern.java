package com.Patterns.aman;
import java.util.Scanner;
public class ThirdPattern 
{
  public static void main(String[] args) 
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the how many row do you want in pattern");
	 int n = sc.nextInt();
	 System.out.println("Your pattern is Here.");
	 //pattern like that..
	 //*
	 //* *
	 //* * *
	 //* * * *
	 //* * * * *
	 //* * * * * *
	 for(int i=1;i<=n;i++)
	 {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print("* ");
		  }
		  System.out.println( );
	 }
  }
}
