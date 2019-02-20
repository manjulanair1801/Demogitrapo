package InterfaceDemo;

public class Reya implements Dancer{

	@Override
	public void Introduction() {
		System.out.println("The introduction starts with biopic and welcomedance");
	}
	

	@Override
	public void maintheme() {
		System.out.println("She is Performing Allarippu");
		
	}

	@Override
	public void Tickets(int hours) {
		System.out.println("The cost of the ticket  " + hours* 5 );
	}
	

}
