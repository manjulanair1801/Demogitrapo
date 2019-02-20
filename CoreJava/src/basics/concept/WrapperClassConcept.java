package basics.concept;

public class WrapperClassConcept {

	public static void main(String[] args) {
	 String s = "1500";
	 int i = 50;
	 System.out.println(s);
	 System.out.println(s+i);
	 
	 Integer j = Integer.parseInt(s);// we changed the String into integer using the wrapper class Integer 
	 System.out.println(j+i);
	 
	 System.out.println("****************");
	
	 String s1 = "20.12 ";
	 double d = 20.13;
	 
	 System.out.println(s1+d);
	 
	 Double e = Double.parseDouble(s1);// we changed the String into Double using the wrapper class Double 
	 System.out.println(e+d);
     System.out.println("**************");
     
     
     int k = 200;
     System.out.println(k+200);
     String str = String.valueOf(k);
     System.out.println(str+k);
	}

}
