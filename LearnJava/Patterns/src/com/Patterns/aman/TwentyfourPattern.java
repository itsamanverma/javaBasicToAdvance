package com.Patterns.aman;
import java.util.Scanner;
public class TwentyfourPattern 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the rows In the Pattern..");
	  int n = sc.nextInt();
	  //Pattern like That...
	  //        1
	  //      1 0 1
	  //    1 0 1 0 1
	  //  1 0 1 0 1 0 1
	  //1 0 1 0 1 0 1 0 1
	  
	  for(int i =1;i<=n;i++)
	  {
		  for(int j=1;j<=n-i;j++)
		  {
			  System.out.print("  ");
		  }
		  for(int j=1;j<=2*i-1;j++)
		  {
			  System.out.print(j%2+" ");
		  }
		  System.out.println( );
	  }

	}

}
