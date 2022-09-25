package com.sorting.aman;
import java.util.Scanner;
public class MergeSort 
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
	 mergeSort(ar,0,ar.length-1);
	 System.out.println();
	 System.out.println("Sorted Array:");
	 for(int i=0;i<ar.length;i++)
	 {
		 System.out.print(ar[i]+" ");
	 }  
	 
  }

private static void mergeSort(int[] ar, int low, int high) 
   {
     if(low<high)
     {
    	 int mid=(low+high)/2;
    	 mergeSort(ar,low,mid);
    	 mergeSort(ar,mid+1,high);
    	 mergeSort(ar,low,mid,high);
     }
   }

private static void mergeSort(int[] ar, int low, int mid, int high) 
{
	int ar1[]=new int[high-low+1];
	int i=low,j=mid+1,k=0;
	while(i<=mid && j<=high)
	{
		if(ar[i]<ar[j])
		{
			ar1[k++]=ar[i++];
		}
		else
		{
			ar1[k++]=ar[j++];
		}
	}
	while(i<=mid)
	{
		ar1[k++]=ar[i++];
	}
	while(j<=high)
	{
		ar1[k++]=ar[j++];
	}
	k=0;
	for(int i1=low;k<ar1.length;i1++)
	{
	ar[i1]=ar1[k++];	
	}
}
}
