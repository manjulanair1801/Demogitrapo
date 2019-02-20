package com.testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	
	
	//@BeforeSuite- 1st preference
	//@BeforeTest - 2nd preference
	//@Beforeclass - 3rd preference
	
	/*@Beforemethod
	 * @test1
	 * @Aftermethod
	 * 
	 * @Beforemethod
	 * @test2
	 * @Aftermethod
	 * 
	 * @Beforemethod
	 * @test39
	 * @Aftermethod
	 * 
	 * 
	 * @AfterClass
	 * @AfterTest
	 */
	
		
	
	// Pre condition - precondition annotation starting with @before 

	@BeforeSuite
	public void setup() {
		System.out.println("Setup the property");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch the browser");
		
	}
	
	@BeforeClass
	public void Login() {
		System.out.println("Login to app.");
		
	}
	

	@BeforeMethod
	public void enterUrl() {
		System.out.println("Enter the URL");
		
	}
	
	
	//test cases - starting with @Test
	@Test
	public void googleTitleTest() {
		System.out.println("Google title test");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("Search test");
	}
	
	@Test
	public void GoogleLogptest() {
		System.out.println("Google logo test");
	}
	
	//test cases - starting with @After
	@AfterMethod 
	public void Logout() {
		System.out.println("logout from app");
	}
	
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Close browser");
	}
	
	@AfterTest
	public void DeleteAllCookies() {
		System.out.println("delete cookies ");
	}
}

