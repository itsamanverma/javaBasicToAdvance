package PatternOneTypeExample;

import java.util.Scanner;

public class PatternOneTypeExample {

	public static void main(String[] args) {
		//print the series like that
		//1
		//12
		//123
		//1234
		//12345
		//123456
		//1234567
		
		Scanner sc = new Scanner(System.in);
		int rows = 0;
		System.out.print("How many rows you want in this pattern");
		int rows1 = sc.nextInt();
		System.out.println("Here is your pattern..!!");
		for(int i=1; i<=rows1; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println(j+" ");
			}
			System.out.println();
		}
		// close the resources
		sc.close();
	}
}
