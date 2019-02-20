package basics.concept;

public class StaticInstanceLocalVar {
	
	static String name ="Tom";// Static Variable
	int age = 30;//instance variable or non static variable
	
	 

	public static void main(String[] args) {
		
      System.out.println(name);// Static variable can be called directly without any object 
      
      StaticInstanceLocalVar obj1 = new  StaticInstanceLocalVar();// Instance variable has to instantiated
      int a =obj1.age;
      System.out.println(a);
      obj1.add();// calling the method 
     
	}

	public void add() {
		
		String Emp_Add ="Willow Street ";// Local Variable( accessible to method only)
		System.out.println(Emp_Add);
		String concat =name.concat(Emp_Add);
		System.out.println(concat);
		
		StaticInstanceLocalVar obj1 = new  StaticInstanceLocalVar();
		int i =obj1.age;
		System.out.println(i);
		
		
	}
}
