package com.collection.aman;
public class C5
{
	public static void main(String[] args)
	{
	  String s1=new String("Shishira");
	  String s2=new String("Shishira Bhat");
	  
	  System.out.println(s1.hashCode()+"  "+s2.hashCode());
	  
	  Double d1 =new Double(45.32);
	  Double d2 =new Double(56.45);
	  Double d3 =new Double(98.23);
	  
	  
	  System.out.println(d1.hashCode()+" "+d2.hashCode());
	  System.out.println(d1.hashCode()+" "+d3.hashCode());
	}
}
