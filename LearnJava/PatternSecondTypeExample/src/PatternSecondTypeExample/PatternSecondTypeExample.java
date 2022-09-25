package PatternSecondTypeExample;

import java.util.Scanner;

public class PatternSecondTypeExample {

	public static void main(String[] args) {
		// Now print the series like that 
		// 1
		//2 2
		//3 3 3
		//4 4 4 4
		//5 5 5 5 5
		Scanner sc = new Scanner(System.in);
		int rows = 0;
		System.out.println("how many rows you want in this series");
		int rows1 = sc.nextInt();//method in the scanner class to the integer.
		System.out.println("Here is your serier pattern..!!");
		
		for(int i=1; i<= rows1; i++) {
			for(int j=1; j<=i;j++) {
				System.out.println(i+" ");
			}
			System.out.println();
			
		}
		// close the resources
		sc.close();
	}

}
