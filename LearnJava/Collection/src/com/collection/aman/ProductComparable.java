package com.collection.aman;

public class ProductComparable implements Comparable<ProductComparable>
{
int pid;
String type;
double price;

public ProductComparable(int pid,String type,double price)
{
	this.pid=pid;
	this.type=type;
	this.price=price;
}
	@Override
	public int compareTo(ProductComparable anp) 
	{
		if(this.pid==anp.pid)
		{
			return 0;
		}
		else if(this.pid>anp.pid)
		{
			return 1;
		}else 
			return -1;
	}
}
