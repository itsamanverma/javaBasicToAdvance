import java.util.Scanner;
//write the Java program to print the First N perfect number//
public class FirstNthPecfectNumber 
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Numbers");
       int n = sc.nextInt();
       int[] arr = new int[5];
       int temp=0;
       
       for(int j=1;j<n;j++)
       {
    	   int  sum=1;
    	   for(int i=2;i<j;i++)
    	   {
    		 if(j%i==0)
    			 sum= sum+i;
    	   }
       
       if(j==sum)
         {
    	   arr[temp]=sum;
    	   System.out.print(arr[temp]+",");
           temp++;
         }
       }
    }
}

