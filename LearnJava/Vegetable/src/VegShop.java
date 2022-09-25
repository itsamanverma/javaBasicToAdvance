import java.util.Scanner;
public class VegShop 
{
	Vegetable sell() 
	{
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter your choice");
	  System.out.println("1-Carrot  2-Beans   3-Onion");
	  int choice = scan.nextInt();
	   if(choice==1)
	   {
		   Carrot c = new Carrot();
		   return c;
	   }else if(choice==2) 
	   {
		   Beans b = new Beans();
		   return b;
	   }else if(choice==3)
	   {
		   Onion o = new Onion();
		   return o;
	   }
	return new Vegetable();
	  
	    
	 }
  }
