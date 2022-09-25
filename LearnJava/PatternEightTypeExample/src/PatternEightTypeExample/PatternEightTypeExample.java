package PatternEightTypeExample;

import java.util.Scanner;

public class PatternEightTypeExample {

	public static void main(String[] args) {
		//Print the series like that
		//1234567
		//123456
		//12345
		//1234
		//123
		//12
		//1
		//12
		//123
		//1234
		//12345
		//123456
		//1234567
		
		Scanner sc= new Scanner(System.in);
		int rows =0;
		System.out.println("how many rows you want in this pattern");
		int rows2 = sc.nextInt();
		System.out.println("Here is your pattern..!!");
		
		//print upper half of the pattern
		for (int i=rows2; i>=1;i--) {
			for(int j=1;j<=i;j++){
				System.out.println(j+" ");
			}
			System.out.println();
		}
		// print lower half of the pattern
			for(int i=2;i<=rows2;i++) {
				for(int j=1;j<=i;j++) {
					System.out.println(j+" ");
				}
				System.out.println();
			}
			//close the resources
			sc.close();
		}

}
