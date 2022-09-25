import java.util.Scanner;

public class MiddleValue 
{
	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number");
      int n1 =sc.nextInt();
      int n2 =sc.nextInt();
      int n3 =sc.nextInt();
      
      if(n1<n2 && n1>n3 || n1<n3 && n1>n2)
          System.out.println(n1+" is the Middle Value.");
      else if(n2<n1 && n2>n3 || n2<n3 && n2>n1)
    	  System.out.println(n2+" is the Middle Value.");
      else 
    	  System.out.println(n3+" is the Middle Value.");
	 sc.close();
	}
}
