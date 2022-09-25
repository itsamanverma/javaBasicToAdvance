//Write the Java program to check the two digit number//
import java.util.Scanner;
public class CheckTwoDigitNumber 
{
    public static void main(String[] args)
    {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Two Digit Number");
	   int no = sc.nextInt();
	   
	   if(no>9&&no<100||no>-9&&no<-100)
	   {
		   System.out.println(no+" is Two Digit Number");
	   }else 
		   System.out.println(no+" is Not Two Digit Number");
	}
}
