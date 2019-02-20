package inheritance;

public class TestCarFeature {

	public static void main(String[] args) {
	
	//Run Time Polymorphism & Method-Overriding :- when same method is present on child class and parent class with same name
	//and same number of argument.
		
		Bmw B = new Bmw();
		
		B.start();//Run time Polymorphism & Method -Overriding//over ridden method 

		B.stop();
		B.thefysafety();
		
		System.out.println("**************************");
		Car C = new Car();
		C.start();
		C.stop();
		C.refuel();
		//A parent class/Base case cannot inherit any property from child class 
		
		System.out.println("************************");
		
		Car C1 = new Bmw();//Upcasting /Supercasting 
		C1.start();// child class object can be referred by parent class reference variable is called top casting
		
		System.out.println("************************");
		
		Bmw B1 = (Bmw) new Car();//Down-casting is not allowed and it gives an exception classcastexception.
		//here new Car() will be called Bmw , it will refer to B1
		System.out.println(B1);
		
		
		
		
		
	}

}
