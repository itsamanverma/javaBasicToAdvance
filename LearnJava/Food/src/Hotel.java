import java.util.Scanner;
public class Hotel 
{
	 Food serve()
	 {
	 
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your choice");
	System.out.println("1-Idly   2-Roti   3-Dosa");
	int choice =  scan.nextInt();
	
     if(choice ==1)
     {
    	 Idly i = new Idly();
    	  return i;
     }else if(choice ==2) {
    	 Roti r = new Roti();
    	 return r;
     }else if(choice ==3) {
    	 Dosa d = new Dosa();
    	 return d;
     }
	return null;
 
}

}
