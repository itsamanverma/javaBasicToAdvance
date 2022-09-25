package com.Patterns.aman;
import java.util.Scanner;
public class TwivelePattern 
{
	public static void main(String[] args) 
	{
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter The Pattern Rows..");
    int n = sc.nextInt();
    //pattern like that..
    //* * * * * 
    //  * * * *
    //    * * *
    //      * *
    //        *
     for(int i=1;i<=n;i++)
     {
    	 for(int j=1;j<=i-1;j++)
    	 {
    		 System.out.print("  ");
    	 }
    	 for(int j=1;j<=n-i+1;j++)
    	 {
    		 System.out.print("* ");
    	 }
    	 System.out.println( );
     }
	}
}
