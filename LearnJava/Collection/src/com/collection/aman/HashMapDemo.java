package com.collection.aman;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo 
{
    public static void main(String[] args) 
    {
    	Student2 s1 =new Student2("Aman",1,78.2);
    	Student2 s2 =new Student2("Sona",2,74.2);
    	Student2 s3 =new Student2("Mini",3,76.2);
    	Student2 s4 =new Student2("Falu",4,73.2);
    	Student2 s5 =new Student2("Golu",5,75.2);
    	
        College c1 = new College("Oct");
        College c2 = new College("Octd");
        College c3 = new College("Octr");
        College c4 = new College("Octs");
        College c5 = new College("Ocit");
	    Map<Student2,College> map= new HashMap<Student2,College>();
	    map.put(s1, c1);
	    map.put(s2, c2);
	    map.put(s3, c3);
	    map.put(s4, c4);
	    map.put(s5, c5);
	    
	    Set<Student2> allid= map.keySet();
		  for(Student2 id:allid)
		  {
			  System.out.println(id);
		  }
		  System.out.println("-------------------------");
		  Collection<College> allVals = map.values();
		  for(College Name:allVals)
		  {
			  System.out.println(Name);
		  }
		  
		  System.out.println("-------------------------");
		  
		  Set<Entry<Student2, College>> set = map.entrySet();
		  //First way of Iteration of Map interface
		  for(Entry<Student2, College> entry:set)
		  {
			  Student2 allStudentsId= entry.getKey();
			  College collegeName=entry.getValue();
			  System.out.println(allStudentsId+"--------"+collegeName);
		  }
	}
}
