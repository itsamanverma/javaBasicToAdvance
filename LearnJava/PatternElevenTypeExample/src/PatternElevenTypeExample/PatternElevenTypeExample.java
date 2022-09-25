package PatternElevenTypeExample;

import java.util.Scanner;

public class PatternElevenTypeExample {

	public static void main(String[] args) {
		// Printing the series like that 
		//1234567
		// 234567
		//  34567
		//   4567
		//    567
		//     67
		//      7
		//     67
		//    567
		//   4567
		//  34567
		// 234567
		//1234567
         int rows =0;
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows1 = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        //Printing upper half of the pattern
         
        for (int i = 1; i <= rows1; i++) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= rows1; j++) 
            { 
                System.out.print(j); 
            } 
             
            System.out.println(); 
        } 
         
        //Printing lower half of the pattern 
         
        for (int i = rows1-1; i >= 1; i--) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= rows1; j++)
            {
                System.out.print(j);
            }
             
            System.out.println();
        }
         
        //Closing the resources
         
        sc.close();
    } 
}