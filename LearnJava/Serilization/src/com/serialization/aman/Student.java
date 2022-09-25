package com.serialization.aman;
import java.io.Serializable;
public class Student implements Serializable
{
private static final long serialversionUID=1L;
  static int colCode;
  int id;
  String name;
 transient double per;
public Student(int id, String name, double per)
{
	this.id = id;
	this.name = name;
	this.per = per;
}
}
