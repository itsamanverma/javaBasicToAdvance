package com.bridgelabcoding.aman;
public class ReverseLinkedList 
{
  static Node head;
  static class Node
  {
	  int data;
	  Node next;
	  
	 public Node(int d)
	 {
		 data=d;
		 next=null;
	 }
  }
  public Node reverseLinkedList(Node node)
  {
    Node prev=null;;
    Node current=head;
    Node next=null;
    while(current!=null)
    {
    	next=current.next;
    	current.next=prev;
    	prev=current;
    	current =next;
    }
	  node=prev;
	  return prev;
  }
  
  void printList(Node node)
  {
	  while(node!=null)
	  {
		  System.out.print(node.data+" ");
		  node=node.next;
	  }
  }
  
  void add(int data)
  {
	  Node n = new Node(data);
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
	  ReverseLinkedList list = new  ReverseLinkedList();
	  list.add(23);
	  list.add(56);
	  list.add(38);
	  list.add(45);
	  list.add(78);
	  System.out.println("Given LinkedList");
	  list.printList(head);
	  head=list.reverseLinkedList(head);
	  System.out.println("");
	  System.out.println("Reversed LinkedList");
	  list.printList(head);
  }
}
