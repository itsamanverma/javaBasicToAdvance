package com.String.aman;

import java.util.Scanner;

public class NoOfOccurance 
{
  public static void main(String[] args) 
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter te Sentence:");
	 String st= sc.nextLine();
	 int count[]= new int[128];
     char ch[]=st.toCharArray();
	 for(int i=0;i<st.length();i++)
	 {
		 //char ch[]=st.toCharArray();
		// count[ch[i]]++;
		 char c =st.charAt(i);
		 count[c]++;
	 }int c=0;
	 for(int i=0;i<count.length;i++)
	 {
		 if(count[i]!=0)
		 {
			 System.out.println((char)i+"->"+count[i]);
			 c++;
		 }
	 }System.out.println(c);
  }
}
