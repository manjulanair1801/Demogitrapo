package basics.concept;

public class CallByValue {

	public static void main(String[] args) {//primitive data type
											// int x =10;-----stored in stack
		int x=10;
		modify(x);
		System.out.println("This is the value of x " + x);
		
		
	}

	public static void modify(int data){// int data= 10 ------stored in stack
		
		data = 20; // int data = 20----it has no impact on 'x'
		System.out.println("This is the value of Data " + data);
	}
}