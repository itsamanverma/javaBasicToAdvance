//Second example of constructor// 
public class Flower {
	String clr, type;
	
	public Flower(String clr, String type) {
		this.clr =clr;
		this.type = type;
		
	}
	public static void main(String[] args) {
		
		Flower f1 = new Flower("pink","lotus");
		System.out.println(f1.clr+" "+f1.type);
		
		Flower f2 = new Flower("Red","Rose");
		System.out.println(f2.clr+" "+f2.type);
		
		Flower f3 = new Flower("white", "Sun-flower");
		System.out.println(f3.clr+" "+f3.type);
		
	}
	

}
