package basics.concept;


	

public class CallByReference {

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle();
		r1.length=10;
		System.out.println("The value of r1 is  "+ r1.length);// output is 10 - 

		modify(r1);
		System.out.println("The value of r1 after changing the reference is  " + r1.length);// output-20 //the value of the object is changed 
		
		
		
	}
	
	public static  void modify(Rectangle r2) {
		r2.length=20;
		System.out.println(r2.length);// output is 20 
}
	
	

}


