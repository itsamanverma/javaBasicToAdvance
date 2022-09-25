//WRITE THE JAVA PROGRAM TO DISPLAY WHO WIN THE GAME BETWEEN TWO//
import java.util.Scanner;
import java.util.Random;
public class GuessGame 
{
   public static void main(String[] args) 
   {
	    Random rd = new Random();
	    int rno = rd.nextInt(10);
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Guess the Number Between 1 to 9");
	    int no = sc.nextInt();
	    if(rno==no)
	    	System.out.println(rno+" Wow!, you Won the Game");
	    else
	    	System.out.println(rno+" Oh!, sry You Lose the Game");
	    
   }
}
