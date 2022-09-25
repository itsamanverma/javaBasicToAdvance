package PatternSixTypeExample;

import java.util.Scanner;

public class PatternSixTypeExample {

	public static void main(String[] args) {
		// Print the series like that
		//7
		//76
		//765
		//7654
		//76543
		//765432
		//7654321
		
		Scanner sc = new Scanner(System.in);
		int rows =0;
		System.out.println("how many rows you want in this pattern");
		int rows1 = sc.nextInt();
		System.out.println("Here is your pattern..!!");
		
		for (int i=rows1; i>=1;i--) 
		{
			for(int j =rows1;j>=i;j--)
			{
				System.out.println(j+" ");
			}
			System.out.println();
		}
		//close the resources
		sc.close();

	}

}
