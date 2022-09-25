import java.util.Scanner;
//write the java program to calculate the power of the Number ie N^p?//
public class CalculatePowerOfNum 
{
	public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number");
       int no = sc.nextInt();
       System.out.println("Enter the Power Value");
       int p  = sc.nextInt();
       int pw=1;
       while(p>0)
       {
    	   pw=no*pw;
    	   p--;
       }
         System.out.println(pw);
	}

}
