package NaturnalNum;
import java.util.Scanner;

public class NaturnalNum {
	
	public static void main(String[] args) {
		// print n natural number
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
         System.out.println(i);			
		}

	}

}
