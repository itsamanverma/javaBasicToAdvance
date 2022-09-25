package com.Patterns.aman;

import java.util.Scanner;

public class ThirtyPattern 
{
    public static void main(String[] args) 
    {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Entere the rows In Pattern..");
	   int n = sc.nextInt();
	   //Pattern like that..
	   //1 1 1 1 1 2
	   //3 2 2 2 2 2
	   //3 3 3 3 3 4
	   //5 4 4 4 4 4
	   //5 5 5 5 5 6
	    for(int i=1;i<=n;i++)
	    {
	    	if(i%2==0)
	    		System.out.print(i+1+" ");
	    	for(int j=1;j<=n;j++)
	    	{
	    		System.out.print(i+" ");
	    	}
	    	if(i%2==1)
	    		System.out.print(i+1+" ");
	    	    System.out.println();
	    }
	}
}
