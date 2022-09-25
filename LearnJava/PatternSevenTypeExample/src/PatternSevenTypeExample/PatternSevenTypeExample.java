package PatternSevenTypeExample;

import java.util.Scanner;

public class PatternSevenTypeExample {

	public static void main(String[] args) {
		// Print the series like that.
		//7654321
		//654321
		//54321
		//4321
		//321
		//21
		//1
		Scanner sc = new Scanner(System.in);
		int rows =0;
		System.out.println("how many rows you want in this pattern");
		int rows1 = sc.nextInt();
		System.out.println("here is your pattern..!!");
		
		for (int i=rows1; i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.println(j+" ");
			}
			System.out.println();
		}
		//close the resources
		sc.close();
	}

}
