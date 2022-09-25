package com.bridgelabcoding.aman;
import java.util.Scanner;
class PowerOf2
{
	public static void main(String[] args) 
	{
	   Scanner sc = new  Scanner(System.in);
	   System.out.println("Enter the Number for you want The Table");
	    int n = sc.nextInt();
	      table(n);
	}

	static void table(int n)
	{    
		System.out.println("Here the your table, you want");
		for(int i=1;i<=10;i++)
		{   
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
} 