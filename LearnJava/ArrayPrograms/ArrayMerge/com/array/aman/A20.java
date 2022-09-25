package com.array.aman;

import java.util.Scanner;

public class A20 
{
  public static void main(String[] args)
  
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Size of Array...");
	  int n =sc.nextInt();
	  int a[]=new int[n];
	  System.out.println("Read the Elements of Array...");
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=sc.nextInt();
		  }
		  for(int i=0;i<a.length;i++)
		  {
			  System.out.print(a[i]+" ");
		  }
		  System.out.println( );
		  System.out.println("Enter the Nth Biggest Number..");
		  int s=sc.nextInt();
		  int r = nthBiggestNumber(a,s);
		  System.out.print(r+" ");
  }
  static int nthBiggestNumber(int a[], int n)
  {
	  for(int i=0;i<a.length;i++)
	  {
		  int count=0;
		  for(int j=0;j<a.length;j++)
		  {
			  if(a[j]>a[i])
				  count++;
			  if(count==n-1)
				  return a[i];
		  }
	  }
	return 1;
  }
}
