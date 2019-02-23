package Hashtable.com;

import java.util.Hashtable;

public class HastableConcept {

	public static void main(String[] args) {
		// How to declare a hashtable
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Tom");// inserting values using Put method 
		h1.put(2, "Suraj");
		h1.put(3, "Tina");
		h1.put(4, "Piya");
		
		//Create a clone copy /Shallow copy
		Hashtable<Integer, String> h2 =new Hashtable<Integer, String>();
		h2= (Hashtable)h1.clone();
		System.out.println("the values from h1"+h1);
		System.out.println("The values from h2"+h2);
		
		h1.clear();
		System.out.println("the values from h1"+h1);
		System.out.println("The values from h2"+h2);
		

	}

}
