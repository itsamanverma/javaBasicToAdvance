package com.collection.aman;

public class Student1 
{
  int id;
  String name;
  public Student1(int id,String name) 
  {
	  this.id=id;
	  this.name=name;
  }
  
 @Override
 public boolean equals(Object obj)
 {
	if(obj instanceof Student1)
	{
		Student1 ans =(Student1)obj; //down Casting
	     if(this.id==ans.id)
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
   Student1 s1= new Student1(1,"Shishira");
   Student1 s2= new Student1(2,"Ajit");
   Student1 s3= new Student1(3,"Nikila");
   Student1 s4= new Student1(1,"Shishira");
   
   System.out.println(s1.equals(s2));
   System.out.println(s1.equals(s4));
   System.out.println(s2.equals(s3));
 }
}

