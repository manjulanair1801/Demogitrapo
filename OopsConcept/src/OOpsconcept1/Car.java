package OOpsconcept1;

public class Car {
	
	//Class car
	String mod ;
	int milage;
	
	
	public static void main(String[]args) {
		// creating an object-- new Car(object of the car class)
		//object is created using the new operator 
		//obj1,obj2,obj3 are the object reference variable 
		
		 Car obj =new Car();
		 obj.mod = "Ferrari";
		 obj.milage =265;
		 
		 Car obj1 = new Car();
		 obj1.milage = 300;
		 obj1.mod = "Innova";
		 
		 
		 Car obj2 = new Car();
		 obj2.milage=400;
		 obj2.mod ="tesla";
		 
		 
		 System.out.println(obj.milage);
		 System.out.println(obj.mod);
		 
		 System.out.println(obj1.milage);
		 System.out.println(obj1.mod);
		 
		 System.out.println(obj2.milage);
		 System.out.println(obj2.mod);
		 
		 // shifting of object reference 
		 
		 obj =obj1 ;// obj will point to obj1 // obj1 will point to obj2
		 obj1=obj2;//obj=innova , obj1= tesla ,obj2 =ferrari
		 obj2=obj;
		 
		System.out.println("**************************"); 
		 System.out.println(obj.mod);
		 System.out.println(obj1.mod);
		 System.out.println(obj2.mod);
		 				 
}
}