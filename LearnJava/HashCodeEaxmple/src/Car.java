public class Car 
{
	
	String model;
	String regNum;
	int price;
	public Car(String model, String regNum,int price) {
		
		this.model=model;
		this.regNum=regNum;
		this.price=price;
	} 
	
	@Override
	public int hashCode()
	{
		return this.regNum.hashCode();
	}
	@Override
	public String toString()
	{
		return this.model+"="+this.price+" Rs.";
	}
  public static void main(String[] args)
  {
	Car c1= new Car("Aulto","587HDF",548188);
	Car c2= new Car("Lambo","558KJUUF",9889988);
	System.out.println(c1+" "+c2);
	
}
}
