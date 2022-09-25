package com.Patterns.aman;

import java.util.Scanner;

public class P47 
{
   public static void main(String[] args)  
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the rows In Pattern..");
	 int n=sc.nextInt();
	 //Pattern Like That...
	 //         1
	 //       1 * 2
	 //     1 * 2 * 3
	 //   1 * 2 * 3 * 4
	 // 1 * 2 * 3 * 4 * 5
	 //   1 * 2 * 3 * 4
	 //     1 * 2 * 3
	 //       1 * 2
	 //         1
	 int i=1,sp=n/2-i+1,ele=1;
	 for(i=1;i<=n;i++)
	 {     
		 int k=1;
		 for(int j=1;j<=sp;j++)
		 {
			 System.out.print("  ");
		 }
		 for(int j=1;j<=ele;j++)
		 {
			if(j%2==0)
				System.out.print("* ");
			else
				System.out.print(k+++" ");
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
		 System.out.println();
	 }
   }
}
