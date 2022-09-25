package com.newArray.aman;
import java.util.Scanner;
public class A2
{
	static double sum=0;
 public static void main(String[] args) 
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Size of Array ");
	 int n = sc.nextInt();
	 double ar[]=new double[n];
	 System.out.println("Read the Person Weight in Array");
	 for(int i=0;i<ar.length;i++)
	 {
		 ar[i]=sc.nextDouble();
	 }
	 System.out.println("Enter the weight of Person in Array ");
	 for(int i=0;i<ar.length;i++)
	 {
		 System.out.print(ar[i]+"  ");
	 }
	 for(int i=0;i<ar.length;i++)
	 {
		 sum=sum+ar[i];
	 }
	 System.out.println();
		System.out.println("Average of Weight of person:"+"\n"+ "Avg:-"+ sum/n);
  }
}
