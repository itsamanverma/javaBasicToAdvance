import java.util.Scanner;
public class CheckTheMultipleOf7 
{
	public static void main(String[] args)
	{
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number");
         int n = sc.nextInt();
         int d = checkMultiple(n);

   }
	static int checkMultiple(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
		   if(i%7==0)
			   System.out.print(i+",");
		       count++;
		}return count;
	}
}
