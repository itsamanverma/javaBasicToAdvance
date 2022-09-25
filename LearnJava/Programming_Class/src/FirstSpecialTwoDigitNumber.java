//WRITE THE JAVA PROGRAM TO PRINT THE FIRST N SPECIAL TWO DIGIT NUMBER WITHIN THE RANGE//
import java.util.Scanner;
public class FirstSpecialTwoDigitNumber 
{

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Number");
	   int n = sc.nextInt();
	   for(int i=10;n>0;i++)
	   {
	   boolean rs = isSpecialTwoDigt(i);
	   if(rs)
	   {
		   System.out.print(i+",");
		   n--;
	   }
	   }
	}
    
	static boolean isSpecialTwoDigt(int x)
	{
		int sum=0,t=x;
		    if(x<100)
		    {
			int d1=x/10;
			int d2=x%10; 
			sum=d1+d2+d1*d2;
			if(sum==x)
				return true;
			else
				return false;
		    }return sum==x;
	}
	 
}
