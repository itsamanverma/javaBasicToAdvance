package com.sorting.aman;
import java.util.Scanner;
public class InsertionSort 
{
	 public static void main(String[] args)
	   {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of array");
		 int n = sc.nextInt();
		 int ar[]=new int[n];
		 System.out.println("Read the Elements of Array");
		 for(int i=0;i<ar.length;i++)
		 {
			 ar[i]=sc.nextInt();
		 }
		 System.out.println("Enter the Elements of Array");
		 for(int i=0;i<ar.length;i++)
		 {
			 System.out.print(ar[i]+" ");
		 }
		   insertionSort(ar);
       }
	 
     private static void insertionSort(int[] ar)
	{
		for(int i=1;i<ar.length;i++)
		{
			int ele =ar[i];
			int j=i-1;
			while(j>=0 && ele<ar[j])
			{
				ar[j+1]=ar[j];
				j--;
			}
			  ar[j+1]=ele;
		}
		System.out.println("");
		System.out.println("Array, af ter insertion Sorting");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
   