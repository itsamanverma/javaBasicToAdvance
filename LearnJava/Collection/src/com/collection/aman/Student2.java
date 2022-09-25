package com.collection.aman;

public class Student2 
{
  String name;
  int id;
  double perc; 
  
  public Student2(String name,int id,double perc)
  {
	  this.name=name;
	  this.id=id;
	  this.perc=perc;
  }
  @Override
  public boolean equals(Object obj)
  {
	  boolean res=false;
	  if(obj instanceof Student1)
	  {
		  Student1 ans = (Student1)obj;
	  if(this.id==ans.id)
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
	  return this.name+"  "+this.id;
  }
}
