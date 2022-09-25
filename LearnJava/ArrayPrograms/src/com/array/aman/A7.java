package com.array.aman;
//write the java program to count the prime no in the Array//
public class A7 
{
  public static void main(String[] args) 
  {
	ArrayOperation ao= new ArrayOperation();
	System.out.println("read the elements of The Array..");
    int a[]=ao.readArray();
    System.out.println("Enter the elemens of the array..");
    ao.dispArray(a);
    System.out.println(ao.countPrintNumber(a));
  }
}
