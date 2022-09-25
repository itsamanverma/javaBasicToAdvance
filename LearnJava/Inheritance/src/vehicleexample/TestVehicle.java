package vehicleexample;

public class TestVehicle {
 public static void main(String[] args) {
	car c = new car();
	c.color = "blue";
	c.price = 850000;
	c.acTemp = 22.5;
	c.brand = "BMW";
	c.start();
	c.cruizeControl();
	c.Stop();
	System.out.println(c.color+" "+c.price+ " "+c.brand+" "+c.acTemp);
	
	System.out.println("-----------------------------------------------");
	
	Bike b = new Bike();
	b.color = "Red";
	b.brand= "CBZ";
	b.price = 25000;
	b.isKickPresent = true;
	b.start();
	b.kick();
	b.Stop();
	System.out.println(b.color+" "+b.price+" "+b.brand+" "+b.isKickPresent);
	
}
}
