package com.bridgelabcoding.aman;
public class SinglyLinkedList 
{
   class Node
   {
	   Object data;
	   Node next;
	   
	   public Node(Object data)
	   {
		   this.data=data;
	   }
   }
     Node head;
     
public boolean add(Object obj) 
{
	Node n = new Node(obj);
	if(head==null)
	{
	  head=n;
	  return true;
	}
	Node t = head;
	while(t.next!=null)
	{
		t=t.next;
	}
      t.next=n;
      return true;
}
   @Override
   public String toString()
   {
	   String st="";
	   Node t = head;
	   while(t!=null)
	   {
		       st=st+t.data;
		       if(t.next!=null)
		    	   st=st+"->";
		           t=t.next;
	   }
	   return st;
   }
public boolean addFirst(Object obj)
{
   Node n = new Node(obj);
    n.next=head;
    head=n;
	return true;
}
public boolean add(Object obj, int in) 
{
	Node n = new Node(obj);
	 if(in==0)
	 {
		 n.next=head; 
		 head=n;
		 return true;
	 }
	 Node t=head;
	 while(in>1)
	 {
		in--;
		t=t.next;
	 }
	 n.next=t.next;
	 t.next=n;
	 return true;
}
public Object deleteFirst() 
{
    Object obj=head.data;
    head=head.next;
	return obj;
}
public Object deleteLast() 
{
	Object obj;
	if(head.next==null)
	{
		obj=head.data;
		head=null;
	}
	else
	{
		Node t=head;
		while(t.next.next!=null)
		{
			t=t.next;
		}
		obj=t.next.data;
		t.next=null;
	}
	return obj;
}

public Object deleteSpecificIndex(int in) 
{
    Object obj;
    if(in==0)
    {
       obj=head.data;
       head= head.next;
    }
    else
    {
       Node t=head,t1=t;
       while(in>0)
       {
    	    in--;
    	    t1=t;
    	    t=t.next;
       }
       t1.next=t.next;
       obj=t.data;
    }
	return obj;
}
public Object searchElementDelete(Object ele) 
{
     Object obj;
     if(head.data==ele)
     {
    	 obj=head.data;
    	 head=head.next;
     }
     else
     {
    	 Node t=head,t1=t;
    	 while(t.data!=ele && t!=null)
    	 {
    		 t1=t;
    		 t=t.next;
    	 }
    	 if(t==null)
    	 {
    		 System.out.println("Element not here..!");
    		 return null;
    	 }
    	 t1.next=t.next;
    	 obj=t.data;
     }
	return obj;
}
public void display() 
{
   Node t = head;
   while(t!=null)
   {
	   System.out.println(t.data);
	   t=t.next;
   }
}
public void displayRev() 
{
   rev(head);	
}
private void rev(Node n) 
{
  	if(n.next!=null)
  	rev(n.next);
  	System.out.println(n.data);
}
public void reverse() 
{
   Node prev=null;
   Node current=head;
   Node next=null;
   while(current!=null)
   {
	   next=current.next;
	   current.next= prev;
	   prev=current;
	   current=next;
   }
   head= prev;
}
public Object printMiddle() 
 {
    Node fast=head;
    Node slow=head;
    while(fast!=null && fast.next!=null)
    {
    	fast=fast.next.next;
    	slow=slow.next;
    }
	return slow.data;
 }
public Object deleteMiddle() 
{
	Node fast=head;
	Node slow=head;
	Node t=head;
	while(fast!=null && fast.next!=null)
	{
		fast=fast.next.next;
		t=slow;
		slow=slow.next;
	}
	t.next=slow.next;
	return slow.data;
}
public Object searchElement(Object ele) 
{
	Object obj;
	if(head.data==ele)
	{
		obj=head.data;
		head=head.next;
		System.out.println("Element is Present");
	}
	return ele;
 }
public void rotate(int k) 
{
    Node current =head;
    int count=1;
	while(count<k && current!=null)
	{
		current=current.next;
		count++;
	}
	if(current==null)
	return;
	Node kNode=current;
	while(current.next!=null)
	{
		current=current.next;
		current.next=head;
		head=kNode.next;
		kNode.next=null;
	}
}
}
