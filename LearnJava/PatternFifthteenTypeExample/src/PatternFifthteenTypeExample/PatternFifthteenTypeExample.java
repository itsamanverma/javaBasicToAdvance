package PatternFifthteenTypeExample;

import java.util.Scanner;

public class PatternFifthteenTypeExample {

	public static void main(String[] args) {
		// printing the pattern like that 
		//1111111
		//1111122
		//1111333
		//1114444
		//1155555
		//1666666
		//7777777
		
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows yuo want in this pttern?");
		int n1 = sc.nextInt();
		System.out.println("Here is your pattern..!!");
		
		//pattern logic 
         for(int i=1;i<=n1;i++)
         {
        	 for(int j=1;j<=n1-i;j++) 
        	 {
        		System.out.println(1); 
        	 }
        	 for(int j=1;j<=i;j++)
        	 {
        		 System.out.println(i);
        	 }
        	 System.out.println();
         }
         sc.close();
	}

}
