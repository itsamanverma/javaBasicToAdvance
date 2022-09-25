package com.bridgelabcoding.aman;
import java.util.Scanner;
public class BinarySearchForString
{
	  public static void main(String[] args)
	  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of String Array");
		int n =sc.nextInt();
		String str[]=new String[n];
		String st=sc.nextLine();
		System.out.println("Read the String Array Elements:");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		System.out.println("Enter the String Array Elements:");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
		int index=binarySearch(str,st);
		if(index==-1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at"+"index: "+index);
	  }
	private static int binarySearch(String[] str, String st) 
	{
		int l=0,r=str.length-1;
		while(l<=r)
		{
			int mid=l+(r-1)/2;
			int res=st.compareToIgnoreCase(str[mid]);
			if(res==0)
				return mid;
			if(res>0)
				l=mid+l;
			else
				l=mid-l;	
		}
		return -1;
	}
}

