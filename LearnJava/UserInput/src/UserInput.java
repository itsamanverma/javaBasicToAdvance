import java.util.Scanner;

class UserInput {

	public static void main(String[] args) {
	 
		Scanner s = new Scanner(System.in);// Line of code to create a Scanner Object;
         System.out.println("Enter your name ");
         String name = s.nextLine();
         
         System.out.println("enter your age ");
         int age = s.nextInt();
         
         System.out.println("Enter your phone number");
         long phoneno= s.nextLong();
         
         System.out.println("enter your salary");
         double salary = s.nextDouble();
        
         s.close();
         
         System.out.println("Your deatils aie !");
         System.out.println("Name: "+name);
         System.out.println("Age is  :" +age);
         System.out.println("Phone number " + phoneno);
         System.out.println("Salary is " +salary);
	}

}
