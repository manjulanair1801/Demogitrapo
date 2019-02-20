package basics.concept;

public class ArrayConcept {

	public static void main(String[] args) {
		//array - it is used to store similar data types in an array variable 
		// integer array
		
		int i [] = new int[4];// address of first location is always 0 so it will 0-3	
		i[0]= 10;// lowest bound is 0
		i[1]=20;
		i[2]=30;
		i[3]=40;//highest bound is n-1(n is the size of array)
		
		//System.out.println(i[4]);// if you give the size which you have not declared 
		
		System.out.println(i.length);// i.length- size of array
		
		// print all the values of array
		
		for (int j =0; j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		
		// Double array 
		 double d []=new double[3];
		 d[0]= 12.33;
		 d[1]=14.44;
		 d[2]=45.55;
		 System.out.println(d.length);
		 System.out.println(d[2]);
		 
		 
		 // char array 
		 
		 boolean b[]=new boolean[2];
		 b[0]= true;
		 b[1]= false;
		 
		 //Char array
		 
		 char c []=new char[3];
		 c[0]= 'a';
		 c[1]= 'b';
		 c[2]= 'c';
		 
		 System.out.println(c.length);
		 System.out.println(c[2]);
		 
		 String s[]=new String[2];
		 s[0]="manju";
		 s[1]= "nair";
		 System.out.println(s.length);
		 System.out.println(s[1]);
		 
		 // Disadvantages of Array:- 1. size is fixed or it will give array out of bound exception
		 // to overcome this prpblem we use collections - arraylist ,hashtable- we use dynamic arrayconcept
		 // 2.Arrays stores only similar data types,so to over come this issue we have Object arrays 
		 
		 
		 // OBJECT ARRAY- object array is used to store different data types values 
		 
		 Object obj[]=new Object[6];
		 obj[0]="Tom";
		 obj[1]="25";
		 obj[2]=5.9;
		 obj[3]= "willow street";
		 obj[4]= "M";
		 obj[5]="12/1/1987";
				 
		System.out.println(obj[3]);
		System.out.println(obj.length); 
		
		// program to print the Object array 
		for (int k =0; k<obj.length;k++) {
			System.out.println(obj[k]);
		}
	}

}
