package com.Patterns.aman;
import java.util.Scanner;
public class TwentyfivePattern 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows in Pattern");
        int n = sc.nextInt();
        //Pattern like That..
        //        1
        //      0 1 0
        //    1 0 1 0 1
        //  0 1 0 1 0 1 0
        //1 0 1 0 1 0 1 0 1 
        int k=1;
        for(int i=1;i<=n;i++)
        {    
        	 
        	for(int j=1;j<=n-i;j++)
        	{
        		System.out.print("  ");
        		k=j;
        	}
        	for(int j=1;j<=2*i-1;j++)
        	{
        	System.out.print(k%2+" ");
        	k++;
        	}
        	System.out.println( );
        }
	}

}
