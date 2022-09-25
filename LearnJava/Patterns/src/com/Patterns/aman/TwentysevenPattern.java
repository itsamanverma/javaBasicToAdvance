package com.Patterns.aman;
import java.util.Scanner;
public class TwentysevenPattern
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	//pattern like That..
	//R
	//R A
	//R A G
	//R A G H
	//R A G H U
	String st="RAGHU";
	for(int i=1;i<=st.length();i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(st.charAt(j)+" ");
		}
		System.out.println( );
	}
  }
} 
