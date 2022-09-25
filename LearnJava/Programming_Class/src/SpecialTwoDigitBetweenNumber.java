//WRITE THE JAVA PROGRAM TO PRINT THE SPECIAL TWO DIGIT NUMBER BETWEEN 10 TO 100//
import java.util.Scanner;
public class SpecialTwoDigitBetweenNumber 
{
   public static void main(String[] args) 
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Range of the Numebr");
	 int n = sc.nextInt();
	 //logic of the program//
	 int count=0;
	 for(int i=10;i<100;i++) 
	 {
		 boolean rs = isSpecialTwoDigt(i);
		 if(rs)
		 {
			 System.out.print(i+",");
		     count++;
		     System.out.println(count);
		 }
		  
	 }
   }
   static boolean isSpecialTwoDigt(int x)
   {
	   int sum=0;
	   int d1=x/10;
	   int d2=x%10;
	   sum = d1+d2+d1*d2;
	   if(sum==x)
		   return true;
	   else
		   return false;
   }
}
