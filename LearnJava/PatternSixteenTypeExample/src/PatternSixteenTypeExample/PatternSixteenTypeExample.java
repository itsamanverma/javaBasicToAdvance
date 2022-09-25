package PatternSixteenTypeExample;

import java.util.Scanner;

public class PatternSixteenTypeExample {

	public static void main(String[] args) {
		//printing the pattern like that
		//0000000
		//0100000
		//0020000
		//0003000
		//0000400
		//00000500
		//0000006
        int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rows you want in the pattern?");
		int n1 =sc.nextInt();
		System.out.print("Here is your pattern..!!");
		
		//logic of pattern
		for(int i=0;i<=n1;i++)
		{
			for(int j=0;j<=n1;j++)
			{
				if(i==j)
				{
					System.out.println(i);
				}
				else 
				{
					System.out.println(0);
				}
				System.out.println();
			}
			sc.close();
		}
	}

}
