package com.sorting.aman;
import java.util.Scanner;
//Write the recursive program to print the no between N to 1//
public class Recursive2  
{
 public static void main(String[] args) 
 {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range Natural Number");
		int n = sc.nextInt();
        display(n);	
 }

private static void display(int n)
  {
	System.out.println(n);
	if(n>1)
	display(n-1);
  }
}
