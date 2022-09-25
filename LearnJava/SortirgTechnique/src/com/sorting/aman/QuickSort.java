package com.sorting.aman;
import java.util.Scanner;
public class QuickSort 
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
		 quickSort(ar,0,ar.length-1);
		 System.out.println();
		 System.out.println("sorted Array");
		 for(int i=0;i<ar.length;i++)
		 {
			 System.out.print(ar[i]+" ");
		 } 
	   }
	 
	 private static void quickSort(int ar[],int low,int high)
	 {
		if(low<high)
		{
			int p =partition(ar,low,high);
			       quickSort(ar,low,p-1);
			       quickSort(ar,p+1,high);
		}
	 }
	private static int partition(int[] ar, int low, int high) 
	{
		int key=ar[low];
		int i=low+1,j=high;
		while(i<j)
		{
			while(i<j && ar[i]<key)
				i++;
			while(j>=i && ar[j]>key)
				j--;
			if(i<j)
			{
				int t=ar[i];
				ar[i]=ar[j];
				ar[j]=t;
			}
			else 
			{
				ar[low]=ar[j];
				ar[j]=key;
			}
		}
		return j;
	}
}
