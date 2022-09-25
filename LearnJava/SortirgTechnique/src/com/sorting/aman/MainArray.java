package com.sorting.aman;

public class MainArray 
{
public static void main(String[] args)
  {
	MyArrayList ma = new MyArrayList(6);
	ma.add("Raju");
	ma.add("Manju");
	ma.add("sanju");
	ma.add("teju");
	ma.add("samu");
	ma.add("ramu");
	ma.add("banu");
	ma.add("daya");
  //ma.add("lalu");
	System.out.println(ma.add("sona"));
  //System.out.println(ma.add("mini"));
	System.out.println(ma);
	System.out.println(ma.capacity());
	System.out.println(ma.size());
	Object obj1[]=ma.toArray();
	for (Object object : obj1)
	{
	System.out.println(object);
	}
  //System.out.println(ma.toArray());
	MyArrayList ma1 = new MyArrayList(6);
	ma1.add("monu");
	ma1.add("monika");
	ma1.add("manoj");
	System.out.println(ma1);
	ma1.addAll();
  }
}
