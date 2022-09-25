package com.sorting.aman;
import java.util.Scanner;
public class SelectionSort 
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
	 selectionSort(ar);
   }

private static void selectionSort(int[] ar) 
{
    for(int i=0;i<ar.length;i++)
    {
    	int k=i;
    	for(int j=i+1;j<ar.length;j++)
    	{
    		if(ar[k]>ar[j])
    		k=j;
    	}
    	int t=ar[i];
    	ar[i]=ar[k];
    	ar[k]=t;
    }
	System.out.println("");
	System.out.println("Array, after Selection Sorting");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
}
}
