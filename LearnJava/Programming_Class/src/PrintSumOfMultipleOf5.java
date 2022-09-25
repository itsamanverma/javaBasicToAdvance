import java.util.Scanner;
public class PrintSumOfMultipleOf5 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Numbers");
    int n = sc.nextInt();
    
    int m = sumOfMultiple(n);
    System.out.println(m);
	}
    static int sumOfMultiple(int n)
    {
    	int sum=0;
    	for(int i=1;i<=n;i++)
    	{
    		if(i%5==0)
    			sum = sum+i;
    	}return sum;
    }
}
