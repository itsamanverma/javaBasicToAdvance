package com.Patterns.aman;

import java.util.Scanner;

public class P38 
{
   public static void main(String[] args)
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the rows in Pattern..");
	  int n= sc.nextInt();
	  //Pattern like that..
	  //        1
	  //      0 1 0
	  //    1 0 1 0 1
	  //  0 1 0 1 0 1 0
	  //    1 0 1 0 1
	  //      0 1 0
	  //        1
	  int sp=n/2,ele=1,k=1;
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=sp;j++)
		  {
			  System.out.print("  ");
		  }
		  for(int j=1;j<=ele;j++)
		  {
			  System.out.print(k%2+" ");
			  k++;
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
