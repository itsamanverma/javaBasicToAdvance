package com.collection.aman;

public class ComparableDemo 
{
 public static void main(String[] args) 
 {
   Double d1= new Double(10.5);
   Double d2= new Double(20.5);
   System.out.println("Compare Value:"+d1.compareTo(d2));
   Double d3= new Double(30.5);
   Double d4= new Double(30.5);
   System.out.println("Compare Value:"+d3.compareTo(d4));
   Double d5= new Double(50.5);
   Double d6= new Double(10.5);
   System.out.println("Compare Value:"+d5.compareTo(d6));
   
 }
}
