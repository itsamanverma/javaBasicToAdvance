package com.collection.aman;

public class StudentComparableDemo implements Comparable<StudentComparableDemo>
  {
	
	double perc;
	String name;
	public StudentComparableDemo(double perc,String name)
	{
		this.perc=perc;
		this.name=name;
	}
   
	@Override
	public int compareTo(StudentComparableDemo s) 
	{
		if(this.perc==s.perc)
			return 0;
		else if(this.perc>s.perc)
			return 1;
		else
		return -1;
	}
	
	//Sort according to name//
//	@Override
//	public int CompareTo(StudentComparableDemo s1)
//	{
//		return this.name.compareTo(s1.name);
//	}
//	
	@Override
	public String toString()
	{
		return this.name+"   "+this.perc;
	}
  }
