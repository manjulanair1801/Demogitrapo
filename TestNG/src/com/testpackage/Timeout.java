package com.testpackage;

import org.testng.annotations.Test;

public class Timeout {

	@Test(timeOut = 5000)
	public void infiniteLoop() throws InterruptedException {
		int i=1;
		while(i==1) {
			System.out.println(i);
			Thread.sleep(3000);
		}
	}
}
