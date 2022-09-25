import java.util.Scanner;
//Write the Java program to print the Biggest Number Among the Three Number
public class BiggestNumber
{

	public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Numbers");
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       int n3 = sc.nextInt();
       
       if(n1>n2&&n1>n3)
    	   System.out.println(n1+" is the Biggest Number");
       else if(n2>n3)
    	   System.out.println(n2+" is the Biggest Number");
       else
    	   System.out.println(n3+" is the  Biggest Number");
	}

}
