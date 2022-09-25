package AnimalExample;

public class TestAnimal {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.color= "white";
		c.type ="Pet Animal";
		c.eat();
		c.scratch();
		System.out.println(c.color+" "+c.type);
		
		System.out.println("__________________________");
		
		Tiger t = new Tiger();
		t.color = "brown";
		t.type = "Killer Animal";
		t.eat();
		t.roar();
		System.out.println(t.color+" "+t.type);

	}

}
