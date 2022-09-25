package com.array.aman;
//Write the java program to replace all the elements of array from 1 if no of elements in array is odd otherwise replace by 0:
public class A9 
{
  public static void main(String[] args) 
  {
     ArrayOperation ao = new ArrayOperation();
     System.out.println("Read the elements of array..");
     int a[]=ao.readArray();
     System.out.println("Enter the element of the array..");
     ao.dispArray(a);
     ao.replaceByOneOrZeroNo(a);
     for(int i=0;i<a.length;i++)
     {
    	 System.out.print(a[i]+" ");
     }
  }
}
