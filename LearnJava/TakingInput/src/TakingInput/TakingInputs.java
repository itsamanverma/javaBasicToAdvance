package TakingInput;

import java.util.Scanner;

public class TakingInputs {
	        // 1. Take input for strings
			//2. Take input for integers
			//3. Take input for doubles
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Step 1. Declare each variable
		String name = "AMAN";//stores word or sentences
		int age = 0;// stores integer values
		double userHeight = 0;//stores decimals positive or negative number
		
		//Step 2. Prompt user and take input
		System.out.print("What is your name:");
		name = sc.next();//method in the scanner class  to take words.
		System.out.print("What is your age: ");
		age = sc.nextInt();//method in the scanner class to take integer.
		System.out.print("What is your height: ");
		userHeight = sc.nextDouble();
		//Step 3.user input
		System.out.println("Your name is,"+name);
		System.out.println("You are "+age+" yaers old.");
		System.out.println("You are "+userHeight+" cm tall.");
		
	}

}
