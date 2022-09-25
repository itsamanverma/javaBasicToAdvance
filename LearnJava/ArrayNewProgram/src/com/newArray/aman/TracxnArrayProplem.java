package com.newArray.aman;
//
import java.util.Scanner;
public class TracxnArrayProplem 
{
	static int flag[]= {1,2};
	static int sum=0;
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Size Of Array");
	    int n = sc.nextInt();
        int arr[]= new int[n];

        System.out.println("Read the Elements Of Array");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
       for(int i=0;i<arr.length;i++)
        {
        	if(flag[0]==1)
        	{
        		if(arr[i]%2==0)
        		{
        		sum=sum+arr[i];
             	}
        	}
        }System.out.println("Sum Of Even Place Number:"+sum);
        sum=0;
        for(int i=0;i<arr.length;i++)
        {
        	if(flag[1]==2)
        	{
        		if(arr[i]%2==1)
        		{
        			sum=sum+arr[i];
        		}
        	}
        } System.out.println("Sum of odd place Number:"+sum);
	}
}
