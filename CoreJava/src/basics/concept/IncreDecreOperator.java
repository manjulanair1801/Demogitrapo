package basics.concept;

public class IncreDecreOperator {

	public static void main(String[] args) {
		
		//++ Increment operator
		//-- Decrement operator
		
		int i =1;
		int j= i++;// post increment
		
		System.out.println(i);
		System.out.println(j);// first it assigned the value of i to J so J=1 then it icrements so i =2
		System.out.println("*****************************");
		
		int a =0;
		int b =++a;// pre increment
		
		System.out.println(a);
		System.out.println(b);// first it increments and then assigns the value
		System.out.println("*****************************");
		
		int m = 2;
		int n = m--;// post decrement 
		System.out.println(n);
		System.out.println(m);
		System.out.println("*****************************");
		
		int x =3;
		int y =--x;//pre decrement
		System.out.println(x);
		System.out.println(y);
		
	}

}
