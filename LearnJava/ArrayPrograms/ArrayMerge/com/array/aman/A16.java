package com.array.aman;

import java.util.Scanner;

public class A16 
{
   public static void main(String[] args) 
   {
	  System.out.println("Enter the Number");
	  int no =new Scanner(System.in).nextInt();
	  nToW(no/10000000," crore");
	  nToW(no/100000%100," lakh");
	  nToW(no/1000%100," thousand");
	  nToW(no/100%10," hundred");  
	  nToW(no/100,"");
   }
   static void nToW(int n,String st)
   {
	String one[]= {"","one","Second","third","four","five","six","Seven","Eight","nine","Ten","Eleven","Twelve" ,"Thirteen","fourteen","fifthteen","sixteen","seventeen","eigthteen","nineteen"};  
   
	String two[]= {"","","Twenty","Thirty","Fourty","Fifthy","Sixty","Seventy","Eighty","Ninety"};
   
	if(n<20)
	{
		System.out.print(one[n]);
	}
	else
	{
		System.out.print(two[n/10]+" "+one[n%10]);
	}
	if(n!=0)
	{
		System.out.print(st+" ");
	}
   }
}
