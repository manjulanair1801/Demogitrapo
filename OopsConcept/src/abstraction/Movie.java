package abstraction;

public abstract class Movie {
	
	public void movieTicket(int noOfperople) {
		System.out.println("The ticket rate for $ "+  noOfperople * 10 + "for tonights show");
	}	
	public abstract void hindiMovie();
	public abstract void englishMovie();			
}
