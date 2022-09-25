
public class Custmor {
 void takeMedicine() {
	 Money m = new Money();
	 System.out.println("take money");
	 Prescription p = new Prescription();
	 MedicalShop m1 = new MedicalShop();
	 Medicine mc = m1.give(p, m);
 }
	public static void main(String[] args) {
		Custmor c = new Custmor();
		 c.takeMedicine();
		
System.out.println(" Coustmor get the Medicine");
	}

}
