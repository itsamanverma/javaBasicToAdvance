package com.bridgelabcoding.aman;

public class ReplaceName 
{
  public static void main(String[] args) 
  {
	  String str1, str2, str3, str4;
		Utility u = new Utility();
		System.out.print("Enter String: ");
		str1 = u.inputString();

		System.out.print("Enter name you want to replace: ");
		str2 = u.inputString();

		System.out.print("Enter name you want to replace with: ");
		str3 = u.inputString();

		str4 = str1.replace(str2, str3);
		System.out.println("New String: " + str4);
  }
}
