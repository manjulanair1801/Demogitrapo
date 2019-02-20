package InterfaceDemo;

public class Maithili implements Dancer {

	@Override
	public void Introduction() {
		System.out.println("The introduction starts with biopic and pushpanjali");
	}

	@Override
	public void maintheme() {
		System.out.println("She is Performing Janthavarisa");
		
	}

	@Override
	public void Tickets(int hours) {
		System.out.println("The cost of the ticket  " + hours* 10 );
		
	}
	

}
