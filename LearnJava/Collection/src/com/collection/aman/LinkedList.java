package com.collection.aman;
public class LinkedList 
{
 static Node head; //Current  Node Address
 static class Node
 {
	 int data;//data inside the node
	 Node next;//indicate the next node 
	 
	public Node(int d)//constructor//
	{
		data = d;
		next =null;
	}
 }
 /* Function to reverse the linkedList */
 public Node reverse(Node node)
 {
	 Node prev=null;
	 Node current = node;
	 Node next=null;
	 while(current!=null)
	 {
		 next=current.next;
		 current.next=prev;
		 prev=current;
		 current=next;
	 }
	return node=prev;
 }
 //Print Content of Double linked list//
 public void printList(Node node)
 {
	 while(node!=null)
	 {
		 System.out.println(node.data+"  ");
		 node=node.next;
	 } 
 }
 void add(int data)
 {
	 Node n= new Node(data);
	 if(head==null)
	 {
		 head=n;
		 return;
	 }
	 Node t=head;
	 while(t.next!=null)
	 {
		 t=t.next;
	 }
	 t.next=n;
 }
 public static void main(String[] args)
 {
	 LinkedList list = new LinkedList();
	 list.add(85);
	 list.add(15);
	 list.add(4);
	 list.add(20);
	 list.add(21);
	 list.add(24);
	 
	 System.out.println("Given Linked List");
	 list.printList(head);
	 head=list.reverse(head); 
	 System.out.println("  ");
	 System.out.println("Reversed Linked List");
	    list.printList(head);
 }
}
