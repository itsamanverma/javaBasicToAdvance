package JavaTesting;
//Real world example like Account details 
 class Account{
	 int acc_no;
	 String name;
	 float amount;
	 void insert (int a, String n, float amt) {
		 acc_no =a;
		 name = n;
		 amount = amt;
	 }
	 void deposit(float amt) {
		 amount = amount+amt;
		 System.out.println(amt+"deposited");
	 }
	 void withdraw(float amt) {
		 if(amount<amt) {
			 System.out.println("insufficient Balance");
		 }else {
			 amount =amount-amt;
			 System.out.println(amt+"withdraw");
		 }
	 }
	 void checkBalance(){System.out.println("Balance is:"+amount);}
	 void display(){System.out.println(acc_no+"/"+name+"/"+amount);}
 }

public class JavaTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Account a1= new Account();
 a1.insert(832345,"Ankit",1000);
 a1.display();
 a1.checkBalance();
 a1.deposit(40000);
 a1.checkBalance();
 a1.withdraw(15000);
 a1.checkBalance();
	}
}
