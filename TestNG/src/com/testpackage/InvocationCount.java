package com.testpackage;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount=10)
	public void sum() {
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println("The sum is " + c);
	}

}
