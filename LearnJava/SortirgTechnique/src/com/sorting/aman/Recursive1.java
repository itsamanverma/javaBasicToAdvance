 package com.sorting.aman;
import java.util.Scanner;
//Write the recursive program to print the no between 1 to N//
public class Recursive1 
{
public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Range Natural Number");
	int n = sc.nextInt();
	 print(n);
  }

private static void print(int n)
{
	if(n>1)
	print(n-1);
	System.out.println(n);
}
}
