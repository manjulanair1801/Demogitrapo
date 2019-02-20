package basics.concept;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String s[][]=new String[3][4];// declaration of an array
		System.out.println(s.length);// it showins the number of rows 
		System.out.println(s[0].length);// shows the number of columns
		
		//1st row
		s[0][0]="A";
		s[0][1]="b";
		s[0][2]="c";
		s[0][3]="d";
		
			
		//2nd row
		s[1][0]="A1";
		s[1][1]="b1";
		s[1][2]="c1";
		s[1][3]="d1";
		
		
		//3rd row
		s[2][0]="A2";
		s[2][1]="b2";
		s[2][2]="c2";
		s[2][3]="d2";
		
		
		
		System.out.println(s[0][0]);
		System.out.println(s[1][1]);
		System.out.println(s[0][2]);
		System.out.println(s[1][1]);
		
		System.out.println("*******************************");
		
		// print all the values of 2 d array
		for (int row =0;row<s.length;row++) {
			for(int col=0;col<s[0].length;col++) {
				System.out.println(s[row][col]);
				
	}
	
		}

		}
	}
