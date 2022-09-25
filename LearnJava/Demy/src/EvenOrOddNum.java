import java.util.Scanner;

public class EvenOrOddNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check The Num is Even Or Odd");
		
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println(n+"Even number");
		}
	     else
			{
				System.out.println(n+"Odd number");
			}
	}
}
