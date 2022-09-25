import java.util.Random;
import java.util.Scanner;
//Write the Java Program to print the Who win The Dice Game Between two Persons//

public class DiceGame
{

	public static void main(String[] args)
	{   
		int fCount=0,sCount=0;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter The Name of the First Player ");
        String fName = sc.next();
        System.out.println("Entre The Name Of the Second Player");
        String sName = sc.next();
        
        while(true)
        {
        	System.out.println(fName+" Press the Button To Flip the Dice");
        	sc.next();
        	int fno = rd.nextInt(6)+1;
        	System.out.println(fName+" you Scored "+fno);
        	if(fCount+fno<=100)
        	    fCount = fCount + fno;
        	if(fCount==100) {
        		System.out.println(fName+" won the Game");
                break;
        	}
        	System.out.println("Total Score is "+fCount);
        	    System.out.println("----------------------------------");
        	    
        	System.out.println(sName+" Press the Button To flip the Dice");
        	sc.next();
        	int sno = rd.nextInt(6)+1;
        	System.out.println(sName+" You Scored "+sno);
        	if(sCount+sno<=100)
        		sCount = sCount+sno;
        	if(sCount==100) 
        	{
        		System.out.println(sName+" won The Game");
        		break;
        	}
        	System.out.println("Total Score is "+sCount);
        }
	}
}
