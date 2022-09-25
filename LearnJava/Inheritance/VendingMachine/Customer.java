
public class Customer {
      void drinkBeverage() {
    	  VendingMachine vm = new VendingMachine();
    	  Beverage b = vm.give();
    	  
    	  if(b instanceof Tea)
    	  {
    		  Tea t = (Tea)b;
    		  t.addGinger();
    	  }
    	  b.drink();
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.drinkBeverage();

	}

}
