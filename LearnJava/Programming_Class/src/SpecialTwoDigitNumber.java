//WRITE THE JAVA PROGRAM TO CHECK THE NUMBER IS SPECIAL TWO NUMBER IS ORNOT?//
import java.util.Scanner;
  public class SpecialTwoDigitNumber 
  {
   public static void main(String[] args) 
     {
	    int sum=0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number to Check the Number is Special Two Digit Number is or not ");
	    int n = sc.nextInt();
	    int d1=n/10;
	    int d2=n%10;
	    sum =d1+d2+d1*d2;
	    
	    if(sum==n)
	    	System.out.println(n+" is Special Two Digit Number");
	    else 
	    	System.out.println(n+" is not Special Two Digit Number");
	    sc.close();
     }
  } 
