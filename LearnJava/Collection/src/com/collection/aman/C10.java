package com.collection.aman;

import java.util.TreeSet;

public class C10 
{
  public static void main(String[] args) 
  {
    TreeSet<String> ts= new TreeSet<String>();
    ts.add("Blue");
    ts.add("Red");
    ts.add("Green");
    ts.add("Blue");
    ts.add("Yellow");
    //ts.add(null);
    ts.add("White");
    ts.add("Red");
    ts.add("White");
    ts.add("Blue");
    System.out.println("Size od TreeSet:"+ts.size());
    System.out.print(ts+" ");
  }
}
