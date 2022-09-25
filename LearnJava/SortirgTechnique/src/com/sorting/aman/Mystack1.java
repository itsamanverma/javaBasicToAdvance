package com.sorting.aman;
public class Mystack1
{
private int capacity;
private Object stk[];
int top=-1;
//CONSTRUCTOR//
public Mystack1(int capacity)
{
	this.capacity=capacity;
	stk=new Object[capacity];
}
//PUSH METHOD TO ADD THE OBJECT IN THE STACK//
public boolean push(Object obj)
{
	if(top==capacity-1)
	{
	System.out.println("Stack overflow..");
	return false;
	}
	stk[++top]=obj;
	System.out.println(obj + " pushed into stack"); 
	return true;
}
//POP METHOD TO REMOVE THE OBJECT WHICH IS LAST IN FIRST OUT(LIFO) OR FIRST OUT LAST IN(FOLI)//
public Object pop()
{
	if(top==-1)
	{
		System.out.println("Stack Underflow..");
		return null;
	}
	return stk[top--];
}
//PEEK METHOD TO GET THE CURRENT TOP VALUE//
public Object peek()
{
	if(top==-1)
	{
		System.out.println("Stack underflow..");
		return null;
	}
	return stk[top];
}
//Search method to position of the object w.r.t top//
public int search(Object obj)
{
	int count=0;
	for(int i=top;i>=0;i--)
	{
		count++;
		if(obj==stk[i])
			return count;
	}
	return 0;
}
//Override toString method to get content present in the Stack//
@Override
public String toString()
{
	String st="[ ";
	for(int i=0;i<=top;i++) 
	{
	 st=st+stk[i];
	 if(i<top)
	 st=st+",";
	}
	return st+" ]";
}
//Size of Stack//
public int size()
{
	return top+1;
}
}

