import java.util.Scanner;

public class CountTheNoOfDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to count no of Digits");
		int n = sc.nextInt();
		int m = countDigit(n);
		System.out.println(m);

	}
   static int countDigit(int n)
   {
	   int count=0;
	   do 
	   {
		count++;
		n=n/10;
	   }while(n!=0);
	   return count;
   }
}
