import java.util.Scanner;
import java.util.Scanner;
public class SpecialTwoDigitMthToNthNumber 
{

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number to get Special two digit Number");
		 int n = sc.nextInt();//
		 int m = sc.nextInt();
		 
		 int s = specialTwoDigt(m,n);
	}
	
	static int specialTwoDigt(int m, int n)
	{
		if(m>n)
		{
			m=m+n;
			n=m-n;
			m=m-n;
		}
		int sum=0,count=0;
		do 
		{
		  	int d1=m/10;
		  	int d2=m%10;
		  	sum =d1+d2+d1*d2;
		  	if(sum==m)
		  	{
		  		System.out.print(m+",");
		  	}
		  	m++;
		  	count++;
		 }while(m<=n);
		return count;
	}
}
