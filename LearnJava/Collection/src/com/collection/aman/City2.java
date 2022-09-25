package com.collection.aman;

public class City2 
{
  int pinCode;
  String name;

  public City2(int pinCode, String name) 
  {
      this.pinCode=pinCode;
      this.name=name;

  }

@Override
  public int hashCode()
  {
	  return this.pinCode;
  }
  @Override
  public boolean equals(Object obj)
  {
	  boolean res=false;
	  if(obj instanceof City2)
	  {
		  City2 anc =(City2)obj;
		  if(this.pinCode==anc.pinCode)
			  res=true;
		  else
			  res =false;
	  }
	  return res;
  }
  @Override 
  public String toString()
  {
	  return this.name+"  "+this.pinCode;
  }
}
