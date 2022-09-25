package PatternFourTypeExample;

import java.util.Scanner;

public class PatternFourTypeExample {

	public static void main(String[] args) {
		// Print the series like that
		//1234567
		//123456
		//12345
		//1234
		//123
		//12
		//1
		
		Scanner sc = new Scanner(System.in);
		int rows =0;
		System.out.println("How many rows you want in this series pattern");
		int rows1= sc.nextInt();
		System.out.println("Here is your series pattern");
		
		//print the series 
		for (int i=rows1;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.println(j+" ");
			}
			System.out.println();
		}
		//close the resources
		sc.close();
	}
}
