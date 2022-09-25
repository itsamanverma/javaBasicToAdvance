package com.array.aman;

public class A10
{
  public static void main(String[] args)
  {
	 ArrayOperation ao = new ArrayOperation();
	 System.out.println("Read array elements ...");
	 int[] a=ao.readArray();
	 System.out.println("Enter the array elements..");
	 ao.dispArray(a);
	 ao.doubleValue(a);
	 
  }
}
