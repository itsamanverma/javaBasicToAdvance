package Prime;

import java.util.Scanner;
public class SumPrime {

	public static void main(String[] args) {
		//Print the Sum of the Prime number 
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the range to print sum of the prime num");
        int range = scn.nextInt();
        int sum=0;
        //logic of the program
        for(int i=1;i<range;i++)
        {

        	if(isPrime(i))
        		sum = sum+i;
        	
        
        	
        }
	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
