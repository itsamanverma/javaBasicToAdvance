package com.array.aman;
import java.util.Scanner;
public class A4 
{
  public static void main(String[] args)
  {
	 double sum=0;
	double weight[]= new double[8];
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter The weight of 8 person...");
	for(int i=0;i<weight.length;i++)
	{
		weight[i]=sc.nextDouble();
	}
	for(int i=0;i<weight.length;i++)
	{
		sum=sum+weight[i];

	}
	System.out.println("Average:"+ sum/8);
  }
}
