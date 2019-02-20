package constructor.sup.concept;

public class Parent {

	public Parent() {// constructor 1 with 0 argument
		System.out.println("Parent class.....");
	}
	public Parent(int i) {// constructor 2 with 1 argument
		System.out.println("The value of i is "+ i);
	
	}
	public Parent(int x, int y) {// constructor 3 with 2 argument
		System.out.println("The value of x is "+ x);
		System.out.println("The value of y is "+ y);
		
	}
}
