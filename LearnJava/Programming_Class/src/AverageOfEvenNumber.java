import java.util.Scanner;
public class AverageOfEvenNumber
{
   public static void main(String[] args) 
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Number To calculate the Average ");
	 int n = sc.nextInt();
	 double m = averageOfNumber(n);
	 System.out.println(m);
   }
   static double averageOfNumber(int n)
   {
	   int sum=0,count=0;
	   double avg=0;
	   for(int i=1;i<=n;i++)
	   {
		   if(i%2==0)
		   {
			   sum=sum+i;
		        count++;
		   }
		   avg =(double)sum/count;
	   }return avg;
   }
}
