package com.collection.aman;

public class Car1
{        
  String model;
  int price;
  
  public Car1(String model,int price)
  {
	  this.model=model;//unique parameter//
	  this.price=price;
  }
  @Override
  public int hashCode()
  {
	  return this.model.hashCode();
  }
  @Override
  public boolean equals(Object obj)
  {
	  boolean res=false;
	  if(obj instanceof Car1)
	  {
		  Car1 anc = (Car1)obj;
	  if(this.model.equals(anc.model))
	    {
		  res= true;  
	    } 
	  else
		  res =false;
	  }
	  return res;
  }
  @Override
  public String toString()
  {
	  return this.model+"  "+this.price;
  }
//@Override
//public int compareTo(Object anc) 
//{
 // return this.model.equals(anc.model);
//}
 
}
