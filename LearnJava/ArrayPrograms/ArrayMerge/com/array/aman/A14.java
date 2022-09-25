package com.array.aman;
//Reverse Array
public class A14 
{
  public static void main(String[] args) 
  {
	 ArrayOperation ao = new ArrayOperation();
	 System.out.println("Read the elements of array..");
     int a[]=ao.readArray();
     System.out.println("Enter the element of the array..");
     ao.dispArray(a);
     
    int c[]=ao.reverse(a);
    System.out.println("the reverse array is...");
    for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]+",");
  }
  }
}
