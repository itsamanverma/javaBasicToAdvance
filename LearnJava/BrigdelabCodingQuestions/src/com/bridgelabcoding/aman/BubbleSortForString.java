package com.bridgelabcoding.aman;
import java.util.Scanner;
public class BubbleSortForString 
{
  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		char ch[]=str.toCharArray();
		System.out.println("Enter the Element of The Array");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+"  ");
		}  
		  bubbleDownSorting(ch);
	    }

	   private static void bubbleDownSorting(char[] ch) 
	   {
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++ )
			{
				if(ch[i]>ch[j])
				{
					char t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
		}
		System.out.println();
		System.out.println("Array after the Down Bubble Sort");
		for(int i=0;i<ch.length;i++)
		{
		System.out.print(ch[i]+" ");
		}
	   }
  }
