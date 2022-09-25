
public class Coin {

String currencyType ="INR";
 int value;
 
  void flip()

      {
	  System.out.println("Coin flipped");
	  }
  public static void main(String[] args) 
  {
   Coin c1 = new Coin();
   c1.value =1;
   
   Coin c2 = new Coin();
   c2.value=5;
   
   Coin c3 = new Coin();
   c3.value=10;
   System.out.println(c1.value+"\n"+c2.value+"\n"+c3.value);
   c1.flip();
   System.out.println("firstly c1 coin wil be flipped");
   c2.flip();
   c3.flip();
	
  }
}
