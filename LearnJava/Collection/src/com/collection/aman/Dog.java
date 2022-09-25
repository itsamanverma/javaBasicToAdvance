package com.collection.aman;

public class Dog 
{
  public String clr,brand;
  
  public Dog(String clr,String brand)
  {
	  this.clr=clr;
	  this.brand=brand;
  }
  @Override
  public String toString() 
  {
	return this.brand+"  "+this.clr;  
  }
  public static void main(String[] args)
  {
   Dog d= new Dog("white","Labrador");
   System.out.println(d);
  }
}
