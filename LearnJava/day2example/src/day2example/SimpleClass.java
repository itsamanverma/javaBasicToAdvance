package day2example;

public class SimpleClass {

	public static void main(String[] args) {
		// TODO Here we do some operator examples
		int a=10;
		int b=10;
		float f=20.5f;
		int c= (int)f;
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
		System.out.println(a++ + ++b);
		System.out.println(b++ - a++);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(10*10/5+2-3*4/2);
		System.out.println(10<<2);
		System.out.println(10>>3);
		System.out.println(10>>>3);
        System.out.println(c=a+b);
        System.out.println(a<b&&a<c);
        System.out.println(a<b&a<c);
        System.out.println(a<b&&a++<c);
        System.out.println(a);
        System.out.println(a<b&a++<c);
        System.out.println(a);
        System.out.println(a>b||a<c);
        System.out.println(a);
        System.out.println(a>b|a++<c);
        
      
       
	}

}
