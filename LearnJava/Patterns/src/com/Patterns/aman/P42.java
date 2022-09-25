package com.Patterns.aman;

import java.util.Scanner;

public class P42 
{
   public static void main(String[] args) 
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the rows In Pattern..");
	  int n =sc.nextInt();
	  //Pattern like that...
	  //1 2 3 4 5 6 7
	  //  1 2 3 4 5
	  //    1 2 3
	  //      1
	  //    1 2 3
	  //  1 2 3 4 5
	  //1 2 3 4 5 6 7
	  int sp=0,ele=n,st=1;
	  for(int i=1;i<=n;i++)
	  {
		  int k=st;
		  for(int j=1;j<=sp;j++)
		  {
			  System.out.print("  ");
		  }
		  for(int j=1;j<=ele;j++)
		  {
		 	  System.out.print(k+" ");
			  k++;
		  }
		  if(i<=n/2)
		  {
			  sp++;
			  ele=ele-2;
		  }
		  else
		  {
			  sp--;
			  ele=ele+2;
		  }
		  System.out.println( );
	  }
   }
}
