import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		// Sum of n natural num...
		Scanner sc = new Scanner(System .in);
		System.out.println("Enter the Sum of the number");
		int n = sc.nextInt();
		int Sum=0;
	    for(int i=0;i<=n;i++) {
	    	Sum+=i;
	    }
        System.out.println(Sum);
	}

}
