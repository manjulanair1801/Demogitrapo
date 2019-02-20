package basics.concept;

public class CallByValue2 {

	public static void main(String[] args) {
		int x=10;
		int y = 20;
		System.out.println("sum =" +sum(x,y));
		System.out.println(x);
		System.out.println(y);
	}
		
	public static int sum(int a, int b) {
		a= 5;
		b= 10;
		int c=a+b;
		return c;
	}
}
