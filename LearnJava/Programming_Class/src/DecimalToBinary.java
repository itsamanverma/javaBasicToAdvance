import java.util.Scanner;
public class DecimalToBinary 
 {
   public static void main(String[] args) 
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Decimal Number to Convert into Binary");
	int n = sc.nextInt();
	
	String s =  deciToBin(n);
   }
   
   static String deciToBin(int n)
   {
	   String bin="";
	   do {
		   int r = n%2;
		   bin = r+bin;
		   n=n/2;
	   }while(n!=0);
	   System.out.println(bin);
	   return bin;
   }
  }
