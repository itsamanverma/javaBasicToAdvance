package ReverseNum;

import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		//Reverse number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Reverse num ");
		int Num = sc.nextInt();
		for(int i=Num;i>=1;i--)
		{
			System.out.println(i);
		}
		

	}

}
