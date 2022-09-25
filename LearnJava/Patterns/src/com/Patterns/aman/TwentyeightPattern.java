package com.Patterns.aman;

import java.util.Scanner;

public class TwentyeightPattern 
{
   public static void main(String[] args) 
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Name In pattern...");
	  String st =sc.nextLine();
	  //pattern like that..
	  //        J
	  //      J S P
	  //    J S P D I
	  //  J S P I D E R
	  // J S P I D E R S
	  int n=st.length()/2+1;
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=n-i;j++)
		  {
			  System.out.print("  ");
		  }
		  for(int j=1;j<=2*i-1;j++)
		  {
			  if(j<=st.length())
			      System.out.print(st.charAt(j)+" ");
		  }
		  System.out.println( );
	  }
   }
}
