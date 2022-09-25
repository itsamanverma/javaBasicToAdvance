//WRITE THE JAVA PROGRAM TO DISPLAY THE DETAIL INFORMATION ABOUT SOMEONE//
import java.util.Scanner;
public class Detail 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi!, Please Enter Your Name... ");
		String name = sc.next();
		System.out.println("Hello!, "+name+" What's your age");
	    int age = sc.nextInt();
	    
	    if(age<18)
	    	System.out.println("Hey! you r Child");
	    else
	    	System.out.println( "Hou Your Adult!");
	}

}
