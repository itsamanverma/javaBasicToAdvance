package com.sorting.aman;
public class MyArrayList
{
  private int capacity;
  private Object ele[];
  private int in=0;
public MyArrayList() 
{
	capacity = 10;
	ele=new Object[capacity];
}
public MyArrayList(int capacity) 
{
	this.capacity = capacity;
	ele =new Object[capacity];
}
  public boolean add(Object obj)
  {
	  if(in==capacity)
	  {
		  capacity=(3*capacity/2)+1;
		  Object ne[]=new Object[capacity];
		  for(int i=0;i<ele.length;i++)
		  {
			  ne[i]=ele[i];
		  }
		  ele=ne;
	  }
	  if(in<capacity)
	  ele[in++]=obj;
	  return true;
  }
  public int capacity()
  {
	  return capacity;
  }
  public int size()
  {
	  return in;
  }
  public String toString()
  {
	  String st="[ ";
	  for(int i=0;i<ele.length;i++)
	  {
		  st=st+ele[i];
		  if(i<in-1)
		  st=st+",";
	  }
	  return st+" ]";
  }
  public boolean addAll() 
  {
  return true;	
  } 
public Object[] toArray() 
{
	Object obj1[]=new Object[in];
	for(int i=0;i<in;i++)
	{
		obj1[i]=ele[i];
	}
	return obj1;
}
 
}
