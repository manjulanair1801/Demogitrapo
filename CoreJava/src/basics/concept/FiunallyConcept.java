package basics.concept;

public class FiunallyConcept {

	public static void main(String[] args) {
		test1();
		
	}
	
	public static void test1() {
		try {System.out.println("insie test 1 method");
		throw new Exception("TEST exception");
		}catch(Exception e) {
			System.out.println("Inside catch block");
		}
		finally {
		System.out.println("inside finally block");// finally will be called always
	}

}
}