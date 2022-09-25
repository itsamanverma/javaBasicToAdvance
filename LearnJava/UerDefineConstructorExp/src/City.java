
public class City {
	String name;
	int pinCode;
	
	public City(String m,int p) {
		this.name = m;
		this.pinCode = p;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       City c1 = new City("Jaipur" ,221001);
       City c2 = new City ("goa", 331009);
       System.out.println(c1.name+" "+c1.pinCode+"\n"+c2.name+" "+c2.pinCode);
	}

}
