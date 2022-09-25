package com.Patterns.aman;

import java.util.Scanner;

public class P43 
{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the rows in Pattern..");
	int n =sc.nextInt();
	// Pattern like that..
	//      1
	//    1 0 1
	//  1 0 1 0 1
	//1 0 1 0 1 0 1
	int sp=n/2+1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=sp;j++)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=2*i-1;j++)
		{
			System.out.print(j%2+" ");
		}
		if(i<n)
		{
			sp--;
		}
		System.out.println( );
	}
}
}
