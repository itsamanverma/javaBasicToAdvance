//Write the Java program to print the Perfect Between 1 to n Number;
import java.util.Scanner;
public class PerfectNumBetweenN 
{
	public static void main(String[] args)
	{   
		Scanner  sc = new Scanner(System.in);
	    int n = sc.nextInt();
        for(int j=1;j<n;j++)//this for loop is for Number increment// 
       {
    	 int   sum=1;
    	       for(int i=2;i<j;i++)//this for loop is for Factor of number increment//
    	       {
    	    	   if(j%i==0) 
    	    	   {
    	    		   sum = sum+i;
    	    	   }
    	    	  
    	       }
    	       if(j==sum)
               {
                   System.out.print(j+",");           	   
               }
       }
	}
}
