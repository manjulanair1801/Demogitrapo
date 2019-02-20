package com.testpackage;

import org.testng.annotations.Test;

public class TestNgFeatures {
	@Test()
	public void loginTest() {
		System.out.println("Login Test");
		int i =9/3;
		System.out.println(i);
	}
	
	@Test(dependsOnMethods = "login Test")
	public void HomePageTest() {
		System.out.println("Homepage Test");
	}
	@Test(dependsOnMethods = "Homepage Test")
	public void SearchPageTest() {
		System.out.println("Search Page Test");
	}


}
