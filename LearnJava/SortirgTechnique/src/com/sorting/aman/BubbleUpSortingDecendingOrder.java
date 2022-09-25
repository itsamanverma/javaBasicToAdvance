package com.sorting.aman;
import java.util.Scanner;
public class BubbleUpSortingDecendingOrder 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Size of the Array..!!");
	int n =sc.nextInt();
	int ar[]=new int[n];
	System.out.println("Read the elementof array");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	System.out.println("Enter the Elements of array");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+"  ");
	}
	bubbleUpSort(ar);
  }

private static void bubbleUpSort(int[] ar) 
{
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;i<ar.length-1-i;j++)
		{
			if(ar[j]<ar[j+1])
			{
				int t=ar[j+1];
				ar[j+1]=ar[j];
				ar[j]=t;
			}
		}
	}
	System.out.println();
	System.out.println("Array ,after the BubbleUpSorting in Decending Order");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
  }
}
