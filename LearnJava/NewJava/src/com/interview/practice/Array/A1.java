package com.interview.practice.Array;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) 
	{
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the num of the people");
		
		int people = sc.nextInt();
		
		double peopleWeight[] = new double[people];
		
	    for (int i = 0; i < peopleWeight.length; i++) 
	    {
	    	System.out.println( i+1 +" read the each people weight.");
	    	peopleWeight[i] = sc.nextDouble();
		}
	    
	    double weightSum=0;
	    
	    for (int i = 0; i < peopleWeight.length; i++) {
	    	System.out.println( i+1 + " enter the each people weight. "+peopleWeight[i]);
			weightSum = weightSum+peopleWeight[i];
		}
	    System.out.println("average weight of people is "+weightSum/people);
	}

}
 