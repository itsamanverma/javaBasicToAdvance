import java.util.Scanner;
//Write the java program to print the perfect Number within the n Number//
public class PerfectNumberWithinN 
{
	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Numbers ");
      int n = sc.nextInt();
      for(int i=1;i<=n;i++)
      {
    	  boolean rs = isPerfect(n);
    	  {
    		  if(rs)
    			  System.out.print(i+",");
    	  }
      }	
    }
    static boolean isPerfect(int x)
    {
    	int sum=0,j=1;
    	while(j<=x/2)
    	{
    		if(x%j==0)
    		{
    			sum = sum+j;
    		}j++;
    	}return x==sum;
    }
}
