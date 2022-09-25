 import java.util.Scanner;
 public class CheckTheNumberDivisibilityBy3And5
 {
	 public static void main(String[] args) 
	 {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Range of the Number.");
	    int n = sc.nextInt();
	    int d = checkDivision(n);
	 }
	 //Write the java program to print the Number which is divisible by 3 & 5 both between the 1 to n.// 
	 static int  checkDivision(int n)
	 {
		 int count=0;
		 for(int i=1;i<=n;i++)
		 {
			 if(i%3==0 && i%5==0)
			 {
				 System.out.print(i+",");
			 }count++;
		 }return count;
	 }
 }