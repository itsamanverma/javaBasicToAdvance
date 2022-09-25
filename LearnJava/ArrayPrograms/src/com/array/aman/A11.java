package com.array.aman;

public class A11 
{
   public static void main(String[] args) 
   {
  ArrayOperation ao = new ArrayOperation();
	System.out.println("Read the First array elements..");
	int a[]=ao.readArray();
	System.out.println("Read the Second array Elements..");
	int b[]=ao.readArray();
	System.out.println("Enter the First Array elements..");
	ao.dispArray(a);
	System.out.println("Enter the second array Elements..");
	ao.dispArray(b);
	for(int i=0;i<a.length+b.length;i++)
	{
	ao.zigZag(a,b);
    }
	}
}
