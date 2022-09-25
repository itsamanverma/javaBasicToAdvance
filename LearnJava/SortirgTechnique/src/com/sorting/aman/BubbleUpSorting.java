package com.sorting.aman;
import java.util.Scanner;
public class BubbleUpSorting 
{
  public static void main(String[] args) 
  {
	Scanner sc =  new Scanner(System.in);
    System.out.println("Enter the Size of Array");
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
    bubbleUpSortingAscendingOrder(ar);
  }

private static void bubbleUpSortingAscendingOrder(int[] ar) 
  {
     for(int i=0;i<ar.length;i++)
     {
    	 for(int j=0;j<ar.length-1-i;j++)
    	 {
    		  if(ar[j]>ar[j+1])
    		  {
    			  int t=ar[j];
    			  ar[j]=ar[j+1];
    			  ar[j+1]=t;
    		  }
    	 }
     }
     System.out.println();
     System.out.println("Array, After the BubbleUpSorting");
     for(int i=0;i<ar.length;i++)
     {
    	 System.out.print(ar[i]+" ");
     }
	
  }
}
