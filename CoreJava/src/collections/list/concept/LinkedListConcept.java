package collections.list.concept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		LinkedList<String> l1= new LinkedList<String>();
		l1.add("POM");
		l1.add("Page Factory");
		l1.add("Page Object");
		l1.add("Page Layer");
		
		//Print
		System.out.println("content of linked list " +l1);
		
		
		// Add 
		l1.addFirst("AUTOMATION");
		l1.addLast("Testing");
		
		System.out.println("content of linked list " +l1);
		
		//Get value 
		System.out.println(l1.get(0));
		
		//set value
		l1.set(1, "Repositories");
		System.out.println(l1.get(1));
		
		//remove first element and last element
		
		l1.removeFirst();
		System.out.println(l1);
		l1.remove(3);
		System.out.println(l1);
		
		
		//How to iterate
		System.out.println("For loop ***************");
		for(int n=0;n<l1.size();n++) {
			System.out.println(l1.get(n));
		}
		System.out.println("Advanced For loop ***************");	
		for (String str:l1) {
			System.out.println(str);
		}

		
		//Using Iterator 
		Iterator<String> It = l1.iterator()	;
			while(It.hasNext()) {
				System.out.println(It.next());
				
			}
		
	}

}
