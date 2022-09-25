package com.newArray.aman;
import java.util.Scanner;
public class A1 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of Array...");
	int n = sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Read the Elements of Array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the Elements Of Array");
	StringBuffer output = new StringBuffer(110);
	output.append("[");
	for(int i=0;i<arr.length;i++)
	{
		  output.append(arr[i]+" ");
	}
	output.append("]");
	System.out.println(output);
  }	
}
