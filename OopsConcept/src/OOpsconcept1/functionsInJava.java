package OOpsconcept1;

public class functionsInJava {

	public static void main(String[] args) {// starting point of execution is main method 
	// non static methods 
	// to call the methods we need objects 
		// main method is void because it never returs a value 
		functionsInJava obj =new functionsInJava();// one object will be created and obj is the reference variable 
		
		obj.add();
		
		int l = obj.sum();
		System.out.println(l);
		
		String s1= obj.add();
		System.out.println(s1);
		
		int k =obj.div(30, 10);// here one to one mapping happens 
		System.out.println(k);
		
		
		
	}
	
	public void test() {// void - doesnot return any value // return type - void 
		System.out.println("Test Method");
	}
	
	public int  sum() {// it dosent have void so its returning integer// return state ment = integer
		// no input some output
		int a= 10;
		int b= 20;
		int c = a+b;
		return c;
		
	}
	public String add() {// no input some output// return type - String
		System.out.println("this is a string method ");
		String s = "selenium";
		return s;
		
	
	}

 public int div (int x, int y) {// return type - Integer 
	 int d = x/y;
	 return d;
 }
}

