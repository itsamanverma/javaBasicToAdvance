package com.Patterns.aman;

import java.util.Scanner;

public class P39 
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the rows in pattern..");
	int n = sc.nextInt();
	//Pattern like that..
	//          1
	//        1 * 2
	//      1 * 2 * 3
	//    1 * 2 * 3 * 4
	//  1 * 2 * 3 * 4 * 5
	int ele=1;
	for(int i=1;i<=n;i++)
	{    int k=1;
		for(int j=1;j<=n-i;j++)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=ele;j++)
		{
			if(j%2==0)
			{
				System.out.print("* ");
			}
			else
				System.out.print(k+++" ");
			 
		}
		ele=ele+2;
		System.out.println( );
	}
  }
}
