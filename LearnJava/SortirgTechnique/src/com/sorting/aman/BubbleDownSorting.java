package com.sorting.aman;
import java.util.Scanner;

public class BubbleDownSorting 
{
  public static void main(String[] args) 
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of Array");
	int n=sc.nextInt();
	int ar[]= new int[n];
	System.out.println("Read the Element of Array");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	System.out.println("Enter the Element of The Array");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+"  ");
	}  
	  bubbleDownSorting(ar);
    }

   private static void bubbleDownSorting(int[] ar) 
   {
	for(int i=0;i<ar.length-1;i++)
	{
		for(int j=i+1;j<ar.length;j++ )
		{
			if(ar[i]>ar[j])
			{
				int t=ar[i];
				ar[i]=ar[j];
				ar[j]=t;
			}
		}
	}
	System.out.println();
	System.out.println("Array after the Down Bubble Sort");
	for(int i=0;i<ar.length;i++)
	{
	System.out.print(ar[i]+" ");
	}
   }
}
