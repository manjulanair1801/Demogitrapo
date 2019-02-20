package basics.concept;

public class StringConcatination {

	public static void main(String[] args) {

		int a=20;
		int b=19;
		
		String x = "Hello";
		String y ="World";
		
		double c =12.13;
		double d =10.13;
		
 System.out.println(x+y+a+b);// + sign is called concatination operatpor 
 System.out.println(a+b+x+y);
 System.out.println(a+b);
 System.out.println(x+y);
 System.out.println(x+a+y+b);
 System.out.println(a+b+x+y+a+b+x+b+y);
 System.out.println(a+b+x+y+a+b);
 System.out.println(x+y+(a+b));
 System.out.println(x+y+c+d);
 
 System.out.println("Hello World");
 System.out.println(a);
 System.out.println("The value of a is =" + a);
 System.out.println("The sum of a and b is "+(a+b));
	}

}
