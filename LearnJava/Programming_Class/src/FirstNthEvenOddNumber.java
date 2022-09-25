//Write the java program to print first Nth EVEN NUMBER//
import java.util.Scanner;
public class FirstNthEvenOddNumber
{
    
	public static void main(String[] args)
	{   
		String st[] = {"Even","Odd"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to get First Nth Even Number");
		int no = sc.nextInt();
		for(int i=0;no>0;i++)
	 	  {
	 		  System.out.println(i+" is "+st[no%2]+",");
	 	      no--;
	 	  }
	}
}
