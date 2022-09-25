package com.Patterns.aman;

import java.util.Scanner;

public class P48 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the row in Pattern..");
	int n = sc.nextInt();
	//Pattern like that...
	//        1
	//      1 2 1
	//    1 2 3 2 1 
	//  1 2 3 4 3 2 1
	//1 2 3 4 5 4 3 2 1
	int ele=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print("  ");
		}
		int k=1;
		for(int j=1;j<=2*i-1;j++)
		{
			System.out.print(k+" ");
			if(j<=(2*i-1)/2)
				k++;
			else
				k--;
		}
		System.out.println();
	}
  }
}
