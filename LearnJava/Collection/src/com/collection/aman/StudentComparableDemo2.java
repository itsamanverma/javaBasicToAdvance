package com.collection.aman;

public class StudentComparableDemo2 implements Comparable<StudentComparableDemo2>
{
    double perc;
    String name;
    
    public StudentComparableDemo2(double d,String name)
    {
    	this.perc=d;
    	this.name=name;
    }
	@Override
	public int compareTo(StudentComparableDemo2 s2) 
	{
		//Ascending Order Compare
		return this.name.compareTo(s2.name);
		//Descending Order compare
		//return this.name.compareTo(s2.name)*-1;
	}
	
	@Override
	public String toString()
	{
		return this.name+"  "+this.perc;
	}

}
