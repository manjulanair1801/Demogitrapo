package OOpsconcept1;

public class WrapperClass {

	public static void main(String[] args) {
		
		// data conversion from string to integer 
		// Wrapper classes - Integer, Boolean, Double,character
		//String to Integer
		String s= "100";
		System.out.println(s+20);// output -10020
		int i =Integer.parseInt(s);// parseInt method is converting the string into integer
		System.out.println(i +20);
		
		
		//String to double
		String y = "12.14";
		double d =Double.parseDouble(y);
		System.out.println(d+10);
		
		
		//String to boolean
		
		String s1 ="true";
		boolean b=Boolean.parseBoolean(s1);
		System.out.println(s1);
		
		
		//Integer to string
		
		int j = 200;
		System.out.println(j+20);
		String s3 = String.valueOf(j);
		System.out.println(s3+20);
		
		//String u = "100A";
		//Integer x = Integer.parseInt(u);// it will give you an exception
		// we should have pure 
		
		System.out.println();
		
		// Autoboxing - primitive dats type into into their repective wrapper classes 
		
		int a=50;  
        Integer a2=new Integer(a);
        Integer a3 = 5;
        System.out.println(a2+" "+a3);
        
        
        // Unboxing
        Integer i1=new Integer(50);  
        int l =i1;  
          
        System.out.println(l);  
        
        
  
		
		
		
		
		

	}

}
