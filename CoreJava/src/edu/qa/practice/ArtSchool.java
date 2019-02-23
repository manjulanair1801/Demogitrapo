package edu.qa.practice;

public class ArtSchool { 
	  String Student_name;
	  int Stu_id;
	 
	 public ArtSchool() { /// constructor with no parameter
	    System.out.println("Modern Art is the Main Subject");
	  }
	 
	 public ArtSchool(String name) { // Constructor with one parameter
	   this.Student_name =name;
	    System.out.println("Murals are the Electives");
	  }
	 
	 public ArtSchool( String name ,int id) {
		 this.Student_name = name;
		 this.Stu_id =id;
	 }
	 
	  public static void main(String[] args) {
	    ArtSchool Art1  = new ArtSchool();  //constructor is called when the instance of the object is created 
	    ArtSchool Art2 = new ArtSchool("Shanks");      
	    ArtSchool Art3 = new ArtSchool("Peter",234);
	   Art1.Student_name = "Tom";
	   
	  
	   System.out.println(Art1.Student_name);
	  System.out.println(Art2.Student_name);
	   System.out.println(Art3.Student_name);
	   System.out.println(Art3.Stu_id);
	  
	   
	  }
	 
	
}
	
