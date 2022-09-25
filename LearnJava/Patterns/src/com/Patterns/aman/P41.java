package com.Patterns.aman;

import java.util.Scanner;

public class P41
{
   public static void main(String[] args)
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the rows in Pattern..");
	  int n = sc.nextInt();
	  // Pattern like that...
	  //       1
	  //     2 3 4
	  //   5 6 7 8 9
	  // 1 2 3 4 5 6 7 
	  //   8 9 1 2 3 
	  //     4 5 6
	  //       7
	  int sp=n/2,ele=1,k=1;
	  for(int i=1;i<=n;i++)
	  {   
		  for(int j=1;j<=sp;j++)
		  {
			  System.out.print("  ");
		  } 
		  for( int j=1;j<=ele;j++)
		  {
			  if(k<=9)
			  {
				  System.out.print(k+++" ");
			  }
			  else if(k==10)
			  {
				  k=1;
				  System.out.print(k+++" ");
			  }
			  //k++;
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
