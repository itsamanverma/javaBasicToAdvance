package com.serialization.aman;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class MainStudent1Deserializable 
{
 public static void main(String[] args) throws Exception
  {
	FileInputStream fin = new FileInputStream("F://New folder//aman.txt");
	ObjectInputStream oin=new ObjectInputStream(fin);
	Object obj=oin.readObject();
	Student st=(Student)obj;
	System.out.println(st.colCode);
	System.out.println(st.id);
	System.out.println(st.name);
	System.out.println(st.per);
  }
}
