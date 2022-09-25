package com.collection.aman;

public class City 
{
  int pinCode;
  String name;
  
  public City(int pinCode,String name)
  {
	  this.pinCode=pinCode;
	  this.name=name;
  }
  @Override
  public int hashCode()
  {
	  return this.pinCode;
  }
  public static void main(String[] args)
  {
	 City c1= new City(560050,"Bangalore");
	 City c2= new City(458741,"Delhi");
	 City c3= new City(560050,"Bangalore");
	 
	 System.out.println(c1.hashCode()+"  "+c2.hashCode());
	 System.out.println(c1.hashCode()+"  "+c3.hashCode());
  }
}
