package com.collection.aman;
public class Car 
{
  String mdl;
  String regNum;//up
  
  public Car(String mdl,String regNum)
  {
	   this.mdl=mdl;
	   this.regNum=regNum;
  }
  @Override
  public int hashCode()
  {
	  return this.regNum.hashCode();
  }
  @Override
  public boolean equals(Object obj)
  {
	  boolean res=false;
	  if(obj instanceof Car)
	  {
		  Car anc = (Car)obj;
	  if(this.regNum.equals(anc.regNum))
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
	  return this.mdl+"  "+this.regNum;
  }
}
