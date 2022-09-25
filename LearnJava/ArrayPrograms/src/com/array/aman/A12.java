package com.array.aman;
public class A12 
{
   public static void main(String[] args) 
   {
	  ArrayOperation ao = new ArrayOperation();
	  System.out.println("read the First Array Elements..");
	  int a[]=ao.readArray();
	  System.out.println("Read the second Elements of Array..");
	  int b[]=ao.readArray();
	  System.out.println("elements of first Array ");
	  ao.dispArray(a);
	  System.out.println("elements of Second Array.");
	  ao.dispArray(b);
	  
	  int c[]=ao.zigZag(a, b);
	  System.out.println("The zigzag array is:");
	  for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]+",");
	}
   }
}
