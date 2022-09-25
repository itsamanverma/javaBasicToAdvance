package Prime;
 import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		//loop through number one by one
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println("Prime number is 1 to " +n);
		
		for(int i=1;i<n;i++)
		{
			boolean isPrime = true;
			//check the number is Prime or Not
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime = false;
					break;
				}
			}
			//Print the number
			if(isPrime)
				System.out.println(i+"");
		}

	}

}
