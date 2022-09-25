package com.array.aman;

public class ArrayMerge 
{
  public static void main(String[] args) 
  {
	ArrayOperation ao = new ArrayOperation();
	System.out.println("read the first array  elements..");
	int a[]=ao.readArray();
	System.out.println("read the second Array elements..");
	int b[]=ao.readArray();
	System.out.println("Enter the first Array elements..");
	ao.dispArray(a);
	System.out.println("Enter the second Array elements..");
	 ao.dispArray(b);
	 
	 int c[]=ao.merge(a,b);
	 System.out.println("Merge Arrray:");
	 ao.dispArray(c);
  }
  
}
