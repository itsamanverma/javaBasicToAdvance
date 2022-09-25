package com.array.aman;

import java.util.Scanner;

public class A1 
{
    public static void main(String[] args) 
    {
	   Scanner sc =new Scanner(System.in);
	   int arr[];//declared the array;
	   System.out.println("Enter the size of array..");
	   int size =sc.nextInt();
	   arr = new int[size];//Allocate the memory 
	   System.out.println(" Enter Array of "+size+" vales");
	   for(int i=0;i<=size-1;i++)
	   {
		   arr[i]=sc.nextInt();
	   }   
	 
	}
}
