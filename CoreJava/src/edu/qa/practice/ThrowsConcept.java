package edu.qa.practice;

import java.io.IOException;

public class ThrowsConcept {

			public void m1() throws IOException {  
			    throw new IOException("Device Error");// Explicitly throw an IO exception- device error 
			  }  
			
			public void m2() throws IOException{  
			    m1();  
			  }  
			
			public  void m3(){  
			   try{  
			   m2();  

			  }catch(Exception e){
				   
				   System.out.println("exception handled");}  // We are going to handle it here by the try catch block.
			 }  
			
			public static void main(String args[]){  
			   
				ThrowsConcept obj=new ThrowsConcept();  
				obj.m3();  
			   System.out.println("normal flow...");  
			  }  
			




	}


