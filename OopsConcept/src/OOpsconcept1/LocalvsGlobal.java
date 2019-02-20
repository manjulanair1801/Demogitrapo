package OOpsconcept1;

public class LocalvsGlobal {
	// global variables or class variables / the scope is avaible  in the whole program 
		String name = "Tom";
		int age = 29;
	 

	public static void main(String[] args) {
		
		int i =10;// local variable// they can be called directly.
		System.out.println(i);
		LocalvsGlobal obj = new LocalvsGlobal(); // to use the global variable
												//we have to create an object 
		
		obj.sum();
		int p= obj.sum();
		System.out.println(p);
		System.out.println(obj.name);
		System.out.println(obj.age);
			
	}
	
	public int sum() {
		int i =10;// local variables 
		int j=20;
		int k = i+j; 
		return k;
		
		
	}

}
