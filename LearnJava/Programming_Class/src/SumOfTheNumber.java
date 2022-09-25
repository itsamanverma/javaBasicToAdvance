import java.util.Scanner;

//Write the Java program fto print the Sum of the N Number
public class SumOfTheNumber {

	public static void main(String[] args)
	{ int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			sum =sum+i;
		}
		System.out.println(sum);

	}

}
