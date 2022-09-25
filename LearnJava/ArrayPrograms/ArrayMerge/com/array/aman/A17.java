package com.array.aman;

import java.util.Scanner;

public class A17 
{
  public static void main(String[] args) 
  {
	  Scanner sc= new Scanner(System.in);
	 ArrayOperation ao= new ArrayOperation();
	 System.out.println("Enter the Array Elements... ");
	 int a[]=ao.readArray();
	 System.out.println("Enter the Array Elements..");
	 ao.dispArray(a);
	 int n=sc.nextInt();
	 System.out.println(ao.insertSpecficeEle(a,n));
 
  }
}
