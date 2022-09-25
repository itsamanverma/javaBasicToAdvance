package com.array.aman;
//Write the java program to replace all the elements of array from 1 if no of elements in array is odd otherwise replace by 0:
public class A8 
{
 public static void main(String[] args) 
 {
   ArrayOperation ao =new ArrayOperation();
   System.out.println("read the elements of the array..");
   int a[]=ao.readArray();
   System.out.println("enter the elements of array..");
   ao.dispArray(a); 
   ao.replaceBy10No(a);
   for(int i=0;i<a.length;i++)
   {
	   System.out.print(a[i]+" ");
   }
 }
}
