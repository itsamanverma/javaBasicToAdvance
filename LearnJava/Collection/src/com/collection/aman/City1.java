package com.collection.aman;

public class City1 
{
  int pinCode;
  String name;
  
  public City1(int pinCode,String name)
  {
	  this.pinCode=pinCode;
	  this.name=name;
  }
  @Override
  public boolean equals(Object obj)
  {
	  if(obj instanceof City1)
	  {
		  City1 anc= (City1)obj;
		  if(this.pinCode==anc.pinCode)
		  {
			  return true;
		  }
		  else 
			  return false;
	  }
	  return false;
  }  
  public static void main(String[] args) 
  {
	City1 c2= new City1(560050,"Bangalore");
	City1 c3= new City1(487643,"Delhi");
	City1 c4= new City1(560050,"Bangalore");
	
	System.out.println(c2.pinCode+"  "+c2.name);
	System.out.println(c3.pinCode+"  "+c3.name);
	System.out.println(c4.pinCode+"  "+c4.name);
	System.out.println(c2.pinCode+"  "+c3.pinCode);
	System.out.println(c2.pinCode+"  "+c4.pinCode);
  }
}
