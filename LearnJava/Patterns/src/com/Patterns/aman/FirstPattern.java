package com.Patterns.aman;
import java.util.Scanner;
public class FirstPattern 
{
   public static void main(String[] args)
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.println(" Enter The How many rows do you want ");
	  int n = sc.nextInt();
	  System.out.println("Your Pattern is here..");
	  //pattern like that..
	  //*****
	  //*****
	  //*****
	  //*****
	  //*****
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=n;j++)
		  {
			  System.out.print("* ");
		  }
		  System.out.println( );
	  }
	  
   }
}
