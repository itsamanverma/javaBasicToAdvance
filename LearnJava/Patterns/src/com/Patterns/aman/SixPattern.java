package com.Patterns.aman;
import java.util.Scanner;
public class SixPattern 
{
	public static void main(String[] args)  
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no row..");
       int n = sc.nextInt();
       //pattern 
       //5 4 3 2 1
       //4 3 2 1
       //3 2 1
       //2 1
       //1
       for(int i=1;i<=n;i++)
       {
    	   for(int j=n;j>=i;j--)
    	   {
    		   System.out.print(j+" ");
    	   }
    	   System.out.println( );
       }
   }
}
