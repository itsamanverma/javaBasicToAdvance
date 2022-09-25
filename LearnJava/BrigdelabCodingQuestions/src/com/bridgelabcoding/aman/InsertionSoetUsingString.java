package com.bridgelabcoding.aman;
import java.util.Scanner;      
public class InsertionSoetUsingString 
{
   public static void main(String[] args) 
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the String");
	   String st= sc.nextLine();
	   char ch[]=st.toCharArray();
	   System.out.println("Enter the String Character by Character...");
	   for(int i=0;i<ch.length;i++)
	   {
		   System.out.print(ch[i]+" ");
	   }
	   insertionSort(ch);
   }
   
   private static void insertionSort(char[] ch)
   {
	for(int i=1;i<ch.length-1;i++)
	{
		char ch1=ch[i];
		int j=i-1;
		while(j>=0 && ch1<ch[j])
		{
			ch[j+1]=ch[j];
			j--;
		}
		ch[j+1]=ch1;
   	}
	System.out.println();
	System.out.println("String After the Insertion sort : ");
	for(int i=0;i<ch.length;i++)
	{
		System.out.print(ch[i]+" ");
	}
  }
}
