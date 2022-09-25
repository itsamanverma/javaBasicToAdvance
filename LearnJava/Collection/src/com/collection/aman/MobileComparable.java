package com.collection.aman;

public class MobileComparable implements Comparable<MobileComparable> 
{
	String model;
	String clr;
	
	public MobileComparable(String model,String clr) 
	{
	   this.model=model;
	   this.clr=clr;
	}
    //CompareTo()//
	@Override
	public int compareTo(MobileComparable anm) 
	{
		return this.model.compareToIgnoreCase(anm.model);
	}
	
	@Override
	public String toString()
	{
		return this.model+"   "+this.clr;
	}
}
