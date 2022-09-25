package PatternFourteenTypePattern;

import java.util.Scanner;

public class PatternFourteenTypePattern {

	public static void main(String[] args) {
		//Printing the pattern like that
		//1010101
		//0101010
		//1010101
		//0101010
		//1010101
		//0101010
		//1010101
		
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int n1 = sc.nextInt();
		System.out.println("Here is your pattern..!!");
		
        // logic of the pattern
		for(int i=1;i<=n1;i++)
		{
			int num;
			if(i%2==0)
			{
				num=0;
				for( int j=1;j<=n1;j++ )
				{
					System.out.println(num);
					
					num = (num==0)? 1: 0;
				}
			}
			else
			{
				num =1;
				for (int j=1; j<=n1;j++)
				{
					System.out.println(num);
					num = (num==1)? 0: 1;
				}
				
			}
			System.out.println();
		}
		sc.close();
	}
}
