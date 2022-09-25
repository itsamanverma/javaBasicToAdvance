package Prime;
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// Check the number is prime or not
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
	    int i;
	   // logic to check number is prime or not
	    if(n==1)
	    {
	    	System.out.println("Prime Start with 2");
	    }
	    for(i=2;i<n;i++) 
	    {
	    	if(n%i==0)
	    	{
	    	    System.out.println("not a prime Number");
	    	    break;
	    	}
	    }
	    if(n==i)
	    	System.out.println("Prime Number");

	}

}
