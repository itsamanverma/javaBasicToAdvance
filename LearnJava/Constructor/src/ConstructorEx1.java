//Constructor example one 
public class ConstructorEx1 {
	String model;
	
	public ConstructorEx1(String s) {
		this.model = s;
		
	}
	public static void main(String[] args) {
		ConstructorEx1 m1 = new ConstructorEx1("iPhoneX");
		
		ConstructorEx1 m2 = new ConstructorEx1("S9");
		
		ConstructorEx1 m3 = new ConstructorEx1("OnePlus6T");
		
		System.out.println(m1.model+"\n"+m2.model+"\n"+m3.model);
		
	}

}
