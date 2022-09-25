import java.util.Scanner;

public class VendingMachine
{
 
	Beverage give()	
	{
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your choice");
	System.out.println("1-Coffee    2-Tea");
	int choice = scan.nextInt();
	
	if(choice == 1)
		return new Coffee();
	else 
		return new Tea();
	
	}
	
}

