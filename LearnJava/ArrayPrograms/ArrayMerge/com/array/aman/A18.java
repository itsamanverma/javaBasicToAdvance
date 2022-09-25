package com.array.aman;

import java.util.Scanner;
public class A18 
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in); 
	ArrayOperation ao=new ArrayOperation();
	System.out.println("Read the Elents of Array..");
	int a[]=ao.readArray();
	System.out.println("Enter the Elements Of Array ");
	ao.dispArray(a);
	System.out.println("Enter the Number");
	int n= sc.nextInt();
	ao.nThBiggest(a,n);
	
	
  }
}
