package PatternTwelevTypeExample;

import java.util.Scanner;

public class PatternTwelevTypeExample {

	public static void main(String[] args) {
		// Printing the series like that 
		//1 2 3 4 5 6 7
		// 2 3 4 5 6 7
		//  3 4 5 6 7
		//   4 5 6 7
		//    5 6 7
		//     6 7
		//      7
		//     6 7
		//    5 6 7
		//   4 5 6 7
		//  3 4 5 6 7
		// 2 3 4 5 6 7
		//1 2 3 4 5 6 7
		
		int rows =0;
		Scanner sc = new Scanner(System.in);
		//taking input from user
		System.out.println("How many pattern do you want in this pattern");
		int rows1 =sc.nextInt();
		System.out.println(" Here is your pattern..!!");
		
		//Printing the upper half of the pattern
		for (int i=1; i<=rows1;i++)
		{
			//taking space 
			for(int j=1; j<i; j++)
			{
				System.out.println(" ");
			}
			for(int j=i;j<=rows1;j++) 
			{
				System.out.println(j+" ");
			}
			System.out.println();
		}
			//Printing the lower half of the pattern
			for(int i = rows1-1;i>=1;i--)
			{
				for(int j=1;j<i;j++)
				{
					System.out.println(" ");
				}
				for(int j=i;j<=rows1;j++)
				{
					System.out.println(j+" ");
				}
				System.out.println();
			}
				//close the resources
				sc.close();
	}

}
