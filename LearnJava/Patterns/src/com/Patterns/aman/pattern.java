package com.Patterns.aman;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1; j<=n-1;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<2*i-1;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
