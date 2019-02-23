package edu.qa.practice;

import java.io.IOException;

public class ThrowExcConcept {

	 public static void validate(int age) {  
	     
		 if(age<18)  
	     throw new ArithmeticException("not valid");  // we are explicitly creating new exception here called "not valid" 
	     else  
	     System.out.println("welcome to vote");  
	   }  
	   
	 public static void main(String args[]) {  
	      try{
	    	  validate(13);  
	      
	 }catch(Exception e) {
		 System.out.println("rest of the code...");  
		 System.out.println("Exceotion handled");
	 }
	}
}
