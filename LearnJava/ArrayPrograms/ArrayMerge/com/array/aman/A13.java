package com.array.aman;
import java.util.Scanner;
//write the Java program to return how many specified element present in array.//
public class A13
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	ArrayOperation ao =new ArrayOperation();
	System.out.println("read The elements of Array..");
	int arr[]=ao.readArray();
	System.out.println("Enter the Specified Elements which do u search in Array.");
	int element = sc.nextInt();
	System.out.println(ao.countSpecifiedElement(arr,element));
  }
}
