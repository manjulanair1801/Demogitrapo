package basics.concept;

public class MethodCalling {

	public static void main(String[] args) {//calling method 
		int a= 10;// 
		int b =20;
		int c =sum(a,b);
		// a and b are called actual aruments or parameters 
		//because they are going to obtain the value of sum 
System.out.println("Sum is :" + c);
		

	}
	
	public static int sum (int x , int y) {//called method 
		// x and y are called the formal arguments because these variables are 
		//going to recieve the data wuthin the two variables 
		int z = x+y;
		return z;
}
}