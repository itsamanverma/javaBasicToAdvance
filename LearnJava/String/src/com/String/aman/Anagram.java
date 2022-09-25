package com.String.aman;

import java.util.Scanner;

public class Anagram 
{
 public static void main(String[] args) 
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the First sentence");
   String s1=sc.nextLine();
   System.out.println("Enter the Seceond Sentence");
   String s2=sc.nextLine();
   boolean rs=isAnagram(s1,s2);
   if(rs)
   {
	   System.out.println("String is Anagram");
   }
   else
   {
	   System.out.println("Strings is not Anagram ");
   }
 }
 static int[] countOccurance(String s)
 {
	return null;
 }
private static boolean isAnagram(String s1, String s2) 
{

	return false;
}
}
