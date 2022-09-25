package com.Patterns.aman;

import java.util.Scanner;

public class ThirtyonePattern 
{
   public static void main(String[] args) 
   {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the rows In Pattern..");
	 int n = sc.nextInt();
	 //Pattern like that..
	 //* * * * * * * 
	 //  * * * * * 
	 //    * * * 
	 //      *
	 //    * * * 
	 //  * * * * * 
	 //* * * * * * *
	 int sp=0,star=n;
	 for(int i=1;i<=n;i++)
	 {
		 for(int j=1;j<=sp;j++)
		 {
			 System.out.print("  ");
		 }
		 for(int j=1;j<=star;j++)
		 {
			 System.out.print("* ");
		 }
		 if(i<=n/2)
		 {
			 sp++;
			 star =star-2;
		 }
		 else
		 {
			 sp--;
			 star = star+2;
		 }
		 System.out.println();
	 }
	 
   }
}
