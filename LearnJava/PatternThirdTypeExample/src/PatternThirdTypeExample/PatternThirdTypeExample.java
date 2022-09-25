package PatternThirdTypeExample;

import java.util.Scanner;

class PatternThirdTypeExample {

	public static void main(String[] args) {
		// Now print the series pattern like that
		//1
		//12
		//123
		//1234
		//12345
		//123456
		//1234567
		//123456
		//12345
		//1234
		//123
		//12
		//1
		
		Scanner sc = new Scanner(System.in);
		int rows =0;
		System.out.println("How many rows you want in this pattern");
		int rows1 = sc.nextInt();
		System.out.println("Here is your pattern..!!");
		//Print upper half series pattern
		for(int i=1; i<=rows1;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.println(j+" ");
			}
			System.out.println();
		}
		//Print lower half series pattern
		for(int i=rows1-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.println(j+" ");
			}
			System.out.println();
			
		}
		// close the resources
		sc.close();
	}

}
