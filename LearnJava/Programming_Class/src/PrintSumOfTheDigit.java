import java.util.Scanner;
public class PrintSumOfTheDigit {

	public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number");
       int n = sc.nextInt();
       int m = sumOfTheDigit(n);
       System.out.println(m);
	}
    static int sumOfTheDigit(int n)
    {
    	int sum=0;
    	do
    	{
    		int r = n%10;
    		sum = sum+r;
    		n=n/10;
    	}while(n!=0);
    	return sum;
    }
}
