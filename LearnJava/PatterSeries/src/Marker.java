
public class Marker {
		
	String color;
	double price=25;
	
	void write()
	{
		System.out.println("Marker writes");
	}
	public static void main(String[] args) {
		Marker m1= new Marker();	
		Marker m2= new Marker(); 
	    Marker m3 =new Marker();
	     System.out.println(m1);
	    
	    m1.color="Red";
	    System.out.println(m1.color);//red
	    
	    System.out.println(m2.color);//Null
	    m3.color="Green";
	    System.out.println(m3.color);
	    m1.write();
	    
	}


}
