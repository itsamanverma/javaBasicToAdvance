package com.sorting.aman; 

public class MainQueue 
{
public static void main(String[] args) throws NullPointerException
  {
	MyQueue mq = new MyQueue(10);
	mq.enQueue("Sona");
	mq.enQueue("Mini");
	mq.enQueue("raju");
	mq.enQueue("teju");
	mq.enQueue("Sonu");
	mq.enQueue("Sonam");
	mq.enQueue("Soni");
	mq.enQueue("Keshu");
	mq.enQueue("ramesh");
	mq.enQueue("suresh");
	System.out.println(mq);
	//mq.display();
	System.out.println("Object current indicate by front:"+mq.peek());
	System.out.println(mq);
	System.out.println("the Object which is currently deQueue from the Queue:"+mq.deQueue());
	System.out.println("Object current indicate by front:"+mq.peek());
	System.out.println("the Object which is currently deQueue from the Queue:"+mq.deQueue());
	System.out.println("the Object which is currently deQueue from the Queue:"+mq.deQueue());
	System.out.println("the Object which is currently deQueue from the Queue:"+mq.deQueue());
	System.out.println("Object current indicate by front:"+mq.peek());
	System.out.println("Size of the Queue:"+mq.size());
  }
}
