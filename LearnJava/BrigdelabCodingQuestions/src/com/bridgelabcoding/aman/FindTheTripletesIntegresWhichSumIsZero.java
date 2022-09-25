package com.bridgelabcoding.aman;
import java.util.Scanner;
public class FindTheTripletesIntegresWhichSumIsZero 
{
public static void main(String[] args) 
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of Array..!");
	 int n =sc.nextInt();
	 int ar[]=new int[n];
	 System.out.println("Read the Elements of Array!..");
	 for(int i=0;i<ar.length;i++)
	 {
		 ar[i]=sc.nextInt();
	 }
	 System.out.println("Enter the Elements of Array..!");
	 for(int i=0;i<ar.length;i++)
	 {
		 System.out.print(ar[i]+" ");
	 }
	 
	 for(int i=1;i<ar.length-2;i++)
	 {
		for(int j=i+1;j<ar.length-1;j++)
		{
			for(int k=i+2;k<ar.length;k++)
			{
				if(ar[i]+ar[j]+ar[k]==0)
				{
					System.out.print("The triple integer:"+ar[i]+" "+ar[j]+" "+ar[k]);
				}
				System.out.println();
			}
		}
	 }
   }
}
