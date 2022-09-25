package PatternTenTypeExample;

import java.util.Scanner;

public class PatternTenTypeExample {

	public static void main(String[] args) {
		// Print the series like that 
		//1
		//21
		//321
		//4321
		//54321
		//654321
		//7654321
		
		Scanner sc= new Scanner(System.in);
		int n=0;
		System.out.println("How many rows you want in this pattern");
		int n1 = sc.nextInt();
		System.out.println("here is your pattern..!!");
		
		for(int i=1; i<=n1; i++)
		{
			for( int j=i;j>=1;j--)
			{
				System.out.println(j+" ");
			}
			System.out.println();
		}
		//close the resources 
		sc.close();

	}

}
