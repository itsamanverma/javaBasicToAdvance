
public class Tea extends Beverage{
	@Override
	void drink() {
		System.out.println("Drink tea");
	}

	
	//sub-class specific method 
	void addGinger()
	{
		System.out.println("add ginger to tea");
	}
}
