package basics.concept;

public class ConstructorConceptwithThis {
	String name;
	int age;

	public static void main(String[] args) {
		ConstructorConceptwithThis obj = new ConstructorConceptwithThis("Tom",30);//the constructor is executed when we create an object
		
		
}
public ConstructorConceptwithThis(String name, int age){// A constructor should have the same name as class
	System.out.println(name);
	System.out.println(age);
	this.name =name;// This keyword is used to intialize the class /global variables in the constructor .
	this .age = age;

	
}

}