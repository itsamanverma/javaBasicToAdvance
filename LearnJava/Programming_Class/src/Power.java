//Write the Java program to calculate the power of the Number ie N^p//
import java.util.Scanner;
public class Power  
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the Number ");
      int no =sc.nextInt();
      System.out.println("Enter the values of power");
      int p = sc.nextInt();
      Power pow = new Power();
      pow.power(no,p);
	}
	void power(int no, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw = pw*no;
			p--;
		}System.out.println(pw);
	}
}
