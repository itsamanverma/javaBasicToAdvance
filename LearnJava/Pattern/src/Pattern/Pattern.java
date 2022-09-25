package Pattern;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		//1
		//22
		//333
		//4444
		//55555
		//666666
		//7777777
		
// define the scanner class
		Scanner sc = new Scanner(System.in);
		int row = 0;
		System.out.println("How many pattern do you in this pattern");
		int row1 = sc.nextInt();
		System.out.println("Here is your pattern");
		
		//logic of the program
		for(int i=1;i>row1;i++) {
			for(int j=1;j>=i;j++) {
				System.out.println(i+" ");
			}
			System.out.println(" ");
			
				
		}
		sc.close();
	}

}
