package PatternThridteenTypePattern;

import java.util.Scanner;

public class PatternThridteenTypePattern {

	public static void main(String[] args) {
		//Printing the series like that pattern
		//1
		//10
		//101
		//1010
		//10101
		//101010
		//1010101
		  
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int n1= sc.nextInt();
		System.out.println("Here is your pattern..!!");
		//logic of the pattern	
		for (int i=1;i<=n1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2 == 0)
				{
					System.out.println(0);
				}
				else
				{
					System.out.println(1);
				}
				System.out.println();
			}
			sc.close();
		}
	}
}
