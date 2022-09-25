import java.util.Scanner;
//Write the java program to print table of number//
public class NumberTable 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number");
      int n = sc.nextInt();
      NumberTable nt = new NumberTable();
       nt.table(n);
     
	}
  void table(int n)
  {
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println(n+"*"+i+"="+n*i);
	  }
  }
}
