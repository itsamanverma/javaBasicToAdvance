package com.Patterns.aman;

import java.util.Scanner;

public class P50 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the rows in pattern...");
	int n =sc.nextInt();
	//Pattern like that..
	//1
	//2 3
	//4 5 6
	//7 8 9 1
	//2 3 4 5 6
	int ele=1;
	for(int i=1;i<=n;i++)
	{
		int k=ele;
		for(int j=1;j<=i;j++)
		{ 
			System.out.print(k+" ");
			if(j<=i)
			{
		    ele++;
			}
			if(k==10)
			{
			ele=1;
			}
		}
		System.out.println();
	}
	
	
  }
}
