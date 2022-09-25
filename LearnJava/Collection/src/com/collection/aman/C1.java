package com.collection.aman;
import java.util.ArrayList;
import java.util.List;

public class C1//(StudentSortDemo)
{
   public static void main(String[] args) 
   {
	 StudentC1 s1 = new StudentC1("Raghu",89.3);
	 
	 StudentC1 s2 = new StudentC1("Ajit",87.5);
	 
	 StudentC1 s3 = new StudentC1("Nikila",91.2);
	 
	//<<interface>>//      //Subclass of List interface//
	List<StudentC1> lst=new ArrayList<StudentC1>();
	 {
		 lst.add(s1);
		 lst.add(s2);
		 lst.add(s3);
		 
		for(StudentC1 s:lst)
		{
			System.out.println(s);
		}
	 }
   }
}
