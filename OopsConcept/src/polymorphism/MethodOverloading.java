package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
 
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(11, 12);
		obj.sum(2, 23.12);
		

}// method overloading is when the method name is same with different method signature (different arguments )
	public void sum() {// 
		System.out.println("This is a sum method with no parameters ");
		System.out.println("*****************************");
		}
	

	public void sum(int a) {
		System.out.println("This is a sum method with one parameter ");
		System.out.println(a);
		System.out.println("*****************************");
	}
	
	public void sum(int b, int c) {
		System.out.println("This is a sum method with two parametrs ");
		System.out.println(b+c);
		System.out.println("*****************************");
		}
	

	public void sum(int d, double e) {
		System.out.println("This is a sum method differnet parameters ");
		System.out.println(d+e);
}
}