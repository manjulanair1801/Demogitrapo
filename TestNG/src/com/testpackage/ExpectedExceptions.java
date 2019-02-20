package com.testpackage;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test() {
		String x="100 a";
		Integer.parseInt(x);
	}

}
