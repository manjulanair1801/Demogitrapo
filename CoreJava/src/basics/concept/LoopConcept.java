package basics.concept;

public class LoopConcept {

	public static void main(String[] args) {// disadvantage of while loop- it will go into infinity if we 
		//dont give the increment operator 
		// Print the numbers 1-10
		// While loop
		 int i=0;
		 while (i<=10) {
			 System.out.println(i);
			 i++;
		 }
System.out.println("***************************************");	
	 // Print backwords 10 to -10
	 //For loop
		 
		 for (int j= 10; j>= -10; j--) {
			 System.out.println(j);
		 }
		 
	}

}
