package com.collection.aman;
import java.util.Vector;
public class C3 
{
   public static void main(String[] args) 
   {
	  Vector<String> vct=new Vector<String>();
	  vct.add("Rama");
	  vct.add("Shama");
	  vct.add("Bama");
	  vct.add("Nama");
	  
	  for(int i=vct.size()-1;i>=0;i--)
	  {
		  String s=vct.get(i);
		  System.out.print(s+" ");
	  }
	  System.out.println( );
	  for(int i=0;i<=vct.size()-1;i++)
	  {
		  String s=vct.get(i);
		  System.out.print(s+" ");
	  }
   }
}
