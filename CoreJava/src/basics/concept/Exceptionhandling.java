package basics.concept;

public class Exceptionhandling {
	int a =10;
	public static void main(String[] args) {
		System.out.println("ABC");
		try {
			throw new Exception("Manju Exception");// creating my own exception using the keyword new 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("PQR");
		
		//Exceptionhandling obj =new  Exceptionhandling();
		//obj.sum();
		//System.out.println("abc");
		//Uncaught exception
		//int i=9/0;
		//System.out.println(i);
		
		
		//Caught exception
		//Thread.sleep(2000);
		
	//	Exceptionhandling obj = new Exceptionhandling();
		//obj =null;// we assigned null to obj that is to the reference .
       // System.out.println(obj.a);// null pointer exception
		
		
		//Types of Eception 
		//Try catch block:
		// It is used to cath the exception and to do reporting also
		//try{
		//int i = 9/0;//this code will throw an exception/
		
		//}catch(ArithmeticException e) {
		

		//System.out.println("ABC");
		//System.out.println("Hey this is try catch block");
		
	//	public void sum()  {
		//	try{div();
		//	}catch(ArithmeticException e) {
			//}
			//	public void div() {
			//int i=9/0;//exception line
			
		
		
}		
}
	