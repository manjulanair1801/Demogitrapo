package edu.qa.practice;

public class TestExceptionPropagation1{  
	
	public void m1(){  
	    int data=50/0;  
	  }  
	
	public void m2(){  
	    m1();  
	  }  
	
	public  void m3(){  
	   try{  
	    m2();  

	   }catch(Exception e){
		   
		   System.out.println("exception handled");}  
	  }  
	
	public static void main(String args[]){  
	   
		TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
		obj.m3();  
	   System.out.println("normal flow...");  
	  }  
	}

