package PatternNineTypeExample;

import java.util.Scanner;

public class PatternNineTypeExample {

	public static void main(String[] args) {
		// Print the series like that
		//1
		//121
		//12321
		//1234321
		//123454321
		//12345654321
		
		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.println("how many rows you want in this pattern");
		int n1 = sc.nextInt();
		System.out.println("here is your pattern..!!");
		
		//printing the  first half of pattern
		for( int i=1; i<= n1; i++)
		{
			for( int j=1; j<=i; j++)
			{
				System.out.println(j+" ");
			}
			//printing the second half pattern
			for( int j=i-1; j>=1; j--)
			{
				System.out.println(j+" ");
			}
			System.out.println();
		}
		//close the resources
		sc.close();
	}
}
