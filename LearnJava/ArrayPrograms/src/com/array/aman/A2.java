package com.array.aman;
import java.util.Scanner;
public class A2
{
   public static void main(String[] args) 
   {
	   double sum=0,avg;
	  Scanner sc =new Scanner(System.in);
	 
	  System.out.println("Enter the weigth of the person..");
	  int length=sc.nextInt();
	  
	 double person[] = new double[length];//Allocation of Array with declaration (Provides the memory location to Array of type double name as arr.//
	  for(int i=0;i<length;i++)
	  {   
		  System.out.println("Enter the weight of the Persons.."+ i+1);
		  person[i]=sc.nextDouble();
	  }
	  for(int i=0;i<length;i++) 
	  {
   	   sum=sum+person[i];
	  }
	   avg=sum/length;
  	   System.out.println("Enter the Average of weigth"+avg);
   }
}
