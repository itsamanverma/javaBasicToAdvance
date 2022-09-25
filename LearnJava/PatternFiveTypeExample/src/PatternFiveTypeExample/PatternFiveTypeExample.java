package PatternFiveTypeExample;

import java.util.Scanner;

public class PatternFiveTypeExample {

	public static void main(String[] args) {
		// Print the series like that 
		//7777777
		//666666
		//55555
		//4444
		//333
		//22
		//1
		
	Scanner sc = new Scanner(System.in);
	int rows =0;
	System.out.println("how many rows you want in the pattern");
	int rows1= sc.nextInt();
	System.out.println("here is your series pattern");
	
	//logic of print series pattern
	for(int i= rows1;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.println(i+" ");
		}
		System.out.println();
		
	}//close the resources
	sc.close();
	
	

	}

}
