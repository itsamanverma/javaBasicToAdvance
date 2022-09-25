package com.sorting.aman;
import java.util.Scanner;
public class BubbleDownSortingDecendindOrder 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of the Array");
	int n =sc.nextInt();
	int ar[]= new int[n];
	System.out.println("Read the element of Array");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	System.out.println("Enter the Element of Array");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
	bubbleDownSortingDecendingOrder(ar);
  }

private static void bubbleDownSortingDecendingOrder(int[] ar) 
{
   	for(int i=0;i<ar.length-1;i++)
   	{
   		for(int j=i+1;j<ar.length;j++)
   		{
   			if(ar[i]<ar[j])
   			{
   				int t=ar[i];
   				ar[i]=ar[j];
   				ar[j]=t;
   			}
   		}
   	}
   	System.out.println();
   	System.out.println("Array,After the BubbleSorting Decending Order");
   	for(int i=0;i<ar.length;i++)
   	{
   		System.out.print(ar[i]+" ");
   	}
}
}
