package com.sorting.aman;
public class StackImplementationUsingSinglyLinkedList 
{
    class Node
  {
	Object data;
	Node next;
	public Node(Object obj)
	{
		this.data=data;
	}
  }
    Node head;
	public boolean push(Object obj) 
	{
		Node n=new Node(obj);
		if(head==null)
		{
			head=n;
			return true;
		}
	    Node t=head;
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
}
