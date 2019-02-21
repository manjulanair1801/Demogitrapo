package constructor.sup.concept;

public class Child extends Parent{
 public Child() {
	 super();
	 
	 }
 
 public Child(int i) {
	 super(i);
	 
 }
 
 public Child(int x, int y) {
	 super(x,y);
	 
 }
 public static void main(String[] args) {

	Child n1 =new Child(); // we use new keyword to pass vallues in the constructor arguments.
	Child n2 = new Child(10);
	Child n3 = new Child(5,2);
	
	
}
}
