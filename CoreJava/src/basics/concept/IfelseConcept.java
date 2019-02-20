package basics.concept;

public class IfelseConcept {

	public static void main(String[] args) {
		int a = 20;
		int b= 30;
		//If-Else
		if(b>a) {
			System.out.println("b is greater than a");
			}
		else
		{
			System.out.println("a is greater than b");
		}
		
		// comparison operators - >< >= !=
		
		if (a==b) {
			System.out.println("a and b are equal");
		}
		else
		{
			System.out.println("a and b are not equal");
		}
	// Write a logic to find out the ghreatest number out of three
		
		int x = 10;
		int y=  40;
		int z = 30;
		
		if (x>y& x >z) {
			System.out.println("x is the greatest number");
		}else if (y > z) {
			System.out.println("y is the greater number ");
		}else
		{
			System.out.println("z is the greatest number ");
		}
	
	}
	
	

}
