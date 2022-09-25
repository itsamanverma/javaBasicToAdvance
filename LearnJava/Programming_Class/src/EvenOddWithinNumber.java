//Write the java program to print Even Number up to Nth Number//
import java.util.Scanner;
public class EvenOddWithinNumber 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        String st[]= {"Even","Odd"};
        for(int i=0;i<=no;i++)
        {
        	System.out.println(i+" is "+st[no%2]);
        }
	}

}
