//Write The java Program To print First Even Number Between the 1 to nth number//
import java.util.Scanner;
public class CheckEvenOddNumber2 
{ 
    public static void main(String[] args) 
    {
	     Scanner sc = new Scanner(System.in);	
	     System.out.println("Enter the Number");
	     int no = sc.nextInt();
	     for(int i=0;i<=no;i++)
	     {
	    	 if(i/2*2==i)
	    		 System.out.println(i+" is Even Number");
	    	 else
	    		 System.out.println(i+" is Odd Number");
	     } 
	}
}
