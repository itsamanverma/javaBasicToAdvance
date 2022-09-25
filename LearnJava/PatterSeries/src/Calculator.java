
public class Calculator {
	void AreaOfTheCircle(double r) {
		double a = 3.14 *r *r;
		System.out.println("Area of the circle"+ a);
		
	}
	void AreaOfTheTriangle(double h,double b) {
		double area = 0.5 * h * b;
		System.out.println("Area Of The Triangle"+"  "+ area);
	}
	void AreaOfTheRectangle(double h,double b) {
		double area = h * b;
		System.out.println("Area Of The Rectangle"+"  "+ area);
	}
	
public static void main(String[] args) {
	Calculator c = new Calculator();
	c.AreaOfTheCircle(70.5);
	c.AreaOfTheCircle(50.5);
	c.AreaOfTheTriangle(10.2,10.2);

	
}
}
