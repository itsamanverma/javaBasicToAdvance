package com.bridgelabcoding.aman;
import java.util.Scanner;
public class CheckAnagram 
{
public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First String inputs...");
	String st1=sc.nextLine();
	System.out.println("Enter the Second String Inputs..");
	String st2=sc.nextLine();
	boolean rs=isAnagram(st1,st2);
	if(rs)
		System.out.println("String are Anagram");
	else
		System.out.println("String not Anagram");
  }

private static boolean isAnagram(String st1, String st2)
{
	int c1[]=countOccurance(st1);
	int c2[]=countOccurance(st2);
	for(int i=0;i<c2.length;i++)
	{
		if(c1[i]!=c2[i])
			return false;
	}
	return true;
}

private static int[] countOccurance(String st) 
{
	int c[]= new int[26];
	for(int i=0;i<st.length();i++)
	{
		char ch=st.charAt(i);
		if(ch>=65 && ch<=90)
			c[ch-65]++;
		if(ch>=97 && ch<=122)
			c[ch-97]++;
	}
	return c;
}
} 
