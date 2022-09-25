package com.sorting.aman;
public class MyQueue 
{
int capacity;
Object qu[];
int front,rear;
public MyQueue(int capacity)
{
	this.capacity = capacity;
	qu=new Object[capacity];
	front = rear =-1;
} 

public boolean enQueue(Object obj)
{
	if(rear==capacity-1)
	{
		System.out.println("Queue is Full");
		return false;
	}
	if(front==-1)
	{
		front=0;
	}
	qu[++rear]=obj;
	return true;
}
public void display() 
{
	for(int i=front;i<=rear && i>=0;i++)
	{
		System.out.println(qu[i]);
	}
}

public Object deQueue()
{
	if(front==-1)
	{
		System.out.println("Queue is Empty");
		return null;
	}
	Object obj=qu[front++];
	if(front>rear)
	{
		front=rear=-1;
	}
	return obj;
}
@Override
public String toString()
{
	String st="[ ";
	 for(int i=front;i<=rear;i++)
	 {
		 st=st+qu[i];
		 if(i<rear)
		 st=st+",";
	 }
	 return st+" ]";
}
public Object peek()
{
if(front==-1)
{
	System.out.println("Queue is Empty");
	return null;
}
return qu[front];
}

public int size()
{
	return rear+1;
}
}