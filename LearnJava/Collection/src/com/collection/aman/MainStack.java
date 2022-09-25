 package com.collection.aman;

public class MainStack 
{
  public static void main(String[] args) 
  {
	Mystack ms = new Mystack(10);
	ms.push("Sona");
	ms.push("Mini");
	ms.push("raju");
	ms.push("teju");
	ms.push("manju");
	ms.push("sanju");
	ms.push("aman");
	ms.push("keshu");
	ms.push("Meghu");
	ms.push("trishu");
	System.out.println(ms);
	System.out.println("size of stack: "+ms.size());
	System.out.println(ms.pop());
	System.out.println(ms);
	System.out.println("size of stack: "+ms.size());
	System.out.println(ms.pop());
	System.out.println(ms);
	System.out.println(ms.peek());
	System.out.println("position of Object search: "+ms.search("Sona"));
	System.out.println(ms);
	System.out.println("size of stack: "+ms.size());
  }
}
