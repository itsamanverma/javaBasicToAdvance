package com.bridgelabcoding.aman;
import java.util.Scanner;
public class CheckPanagram 
{
	public static void main(String[] args) 
	  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String inputs...");
		String st=sc.nextLine();
		boolean rs=isPanagram(st);
		if(rs)
			System.out.println("String are Panagram");
		else
			System.out.println("String not Panagram");
	  }

	private static boolean isPanagram(String st) 
	{
		if(st.length()<26)
			return false;
		int c[]=countOccurance(st);
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==0)
				return false;
		}
		return true;
	}

	private static int[] countOccurance(String st) 
	{
		int c[]=new int[26];
		for(int i=0;i<c.length;i++)
		{
			char ch=st.charAt(i);
			if(ch>= 65 && ch<=90)
				c[ch-65]++;
			if(ch>=97 && ch<=122)
				c[ch-97]++;
		}
		return c;
	}
}
