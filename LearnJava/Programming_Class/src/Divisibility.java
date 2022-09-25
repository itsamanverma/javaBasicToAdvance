import java.util.Scanner;
public class Divisibility 
{
   public static void main(String[] args)
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter The Range Of The Number");
	  int n = sc.nextInt();
	  Divisibility ds = new Divisibility();
	  ds.checkDivisibility(n);
   }
    int checkDivisibility(int n) 
    {
       int count=0;
       for(int i=1;i<n;i++)
       {
    	   if(i%3==0 && i%5==0)
    		   System.out.print(i+",");
    	   count++;
       } 
       return count; 
    }  
}
