package com.serialization.aman;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class MainStudent 
{
	public static void main(String[] args) throws Exception 
	{
		Student.colCode=111;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the name ,id ,Per");
		String name=sc.next();
		int id = sc.nextInt();
		double per=sc.nextDouble();
		Student std = new Student(id,name,per);
		System.out.println("Student colCode:"+std.colCode);
		System.out.println("Student id:"+std.id);
		System.out.println("Student name:"+std.name);
		System.out.println("Student per:"+std.per);
		
		FileOutputStream fout = new FileOutputStream("F://New folder//aman.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(std);
		out.flush();
		out.close();
		fout.flush();
		fout.close();
		System.out.println("Successfully written..!!");
	}
}
