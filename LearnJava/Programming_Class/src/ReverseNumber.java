import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number ");
	int n = sc.nextInt();
     int m = reverseNumber(n);
     System.out.println(m);
	}
   static int reverseNumber(int n)
   {
	  int rev=0;
	  do
	  {
		  int r= n%10;
		  rev= rev*10+r;
		  n= n/10;
	  }while(n!=0);
	  return rev;
   }
}
