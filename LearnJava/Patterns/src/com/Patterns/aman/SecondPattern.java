package com.Patterns.aman;
import java.util.Scanner;
public class SecondPattern 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the How many row do you want in your pattern..");
      int n = sc.nextInt();
      System.out.println("Your pattern is here..");
      // pattern like that
      //11111
      //22222
      //33333
      //44444
      //55555
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=n;j++)
    	  {
    		  System.out.print(i);
    	  }
    	  System.out.println( );
      }
	}
}
