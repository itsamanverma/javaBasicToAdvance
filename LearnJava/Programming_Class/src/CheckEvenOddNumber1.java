//Write the java program to check the number is even or odd.//
import java.util.Scanner;
public class CheckEvenOddNumber1 
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number To check ");
	int no = sc.nextInt();
	
	if(no%2==0)
		System.out.println(no+" is Even Number");
	else 
		System.out.println(no+" is Odd Number");
  }
}
