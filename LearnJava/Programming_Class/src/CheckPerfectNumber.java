import java.util.Scanner;

//Write the Java program to check the Number is Perfect Number is or not? Without return the Values means  //
public class CheckPerfectNumber 
{
   public static void main(String[] args)
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Number");
	  int n = sc.nextInt();
	 
	  CheckPerfectNumber pn = new CheckPerfectNumber();
	      pn.perfectNumber(n);
   }
   
   void perfectNumber(int n)
   {
	   int sum=0;
	   for(int i=1;i<=n/2;i++)
	   {
		   if(n%i==0)
	   	   sum =sum+i;
	   }
		   if(sum==n)
			   System.out.println(n+" is Perfect Number");
		   else
			   System.out.println(n+" is Not Perfect Number");
   }
}
