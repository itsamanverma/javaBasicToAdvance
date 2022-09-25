package com.Patterns.aman;

import java.util.Scanner;

public class ThortyfourPattern {

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the rows In pattern..");
	   int n = sc.nextInt();
	   //Pattern Like That...
	   //      1
	   //    3 3 3 
	   //  5 5 5 5 5
	   //7 7 7 7 7 7 7 
	   //  5 5 5 5 5
	   //    3 3 3 
	   //      1
	   int sp=n/2,ele=1;
	   for(int i=1;i<=n;i++)
	   {
		 for(int j=1;j<=sp;j++)
		 {
			 System.out.print("  ");
		 }
		 for(int j=1;j<=ele;j++)
		 {
			 System.out.print(ele+" ");
		 }
		 if(i<=n/2)
		 {
			 sp--;
			 ele=ele+2;
		 }
		 else
		 {
			 sp++;
			 ele=ele-2;
		 }
		 System.out.println( );
	   }
	   
	}

}
