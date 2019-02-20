package polymorphism;

public class Mainoverloading {

	public static void main(String[] args) {// one argument 
        System.out.println("I'm the main method :-) ");
    }

    public static void main(String arg1) {//  one argument with different parameter
        System.out.println("main(String arg1)");
    }

    public static void main(String arg1, String arg2) {//Two arguments 
        System.out.println("main(String arg1, String arg2)");
    }
}