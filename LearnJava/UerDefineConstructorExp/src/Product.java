
public class Product {
	String type;
	double price;
	int quan;
	 public Product(String tp ,double d,int q) {
		 this.type=tp;
		 this.price=d;
		 this.quan= q;
		 
	 }

	public static void main(String[] args) {
	 Product p = new Product("soap",30,10);
	 Product p1 = new Product("Aman",600,90);
	 System.out.println(p.type+" "+p.price+" "+p.quan+"\n"+p1.type+" "+p1.price+" "+p1.quan);

	}

}
