package basics.concept;

public class FinalizeConcept {// finalize is a method 

	public void Finalize() {
		System.out.println("finalized method");
	}
	public  static void main(String[] args) {
	
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
	        	f1= null;// the reference is not there , only blank objects .
				f2=null;
				System.gc();
		
	}

}
