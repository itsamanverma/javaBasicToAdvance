package com.collection.aman;

public class Mobile 
{
  String model,clr;
  
  public Mobile(String model,String clr)
  {
	  this.model= model;
	  this.clr=clr;
  }
  @Override
  public boolean equals(Object obj)
  {
	  if(obj instanceof Mobile)
	  {
		  Mobile anm= (Mobile)obj;
		  if(this.model.equals(anm.model))
		  {
			  return true;
		  }
		  else 
			  return false;
	  }
	  else
		  return false;
  }
  public static void main(String[] args) 
  {
	Mobile m1= new Mobile("iPhoneX","Gold");
	Mobile m2= new Mobile("SamsungC7","Blank");
	Mobile m3= new Mobile("Redmi","Gold");
	Mobile m4= new Mobile("iPhoneX","Gold");
	
	System.out.println(m1.equals(m4));
	System.out.println(m2.equals(m3));
  }
}
