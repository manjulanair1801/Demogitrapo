package com.testpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Assertiononcept {
	

	
		WebDriver driver;
		
		@BeforeMethod
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjula\\Desktop\\testing downloads\\chrome2\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		
		
		@Test(priority=1, groups="Title")
		public void googleTitleTest() {
			String title =driver.getTitle();
			System.out.println(title);
			//Assert.assertEquals(title,"Google");// Asserrt class
			Assert.assertEquals(title, "Google1", "Title is not matched");
		}
		
		
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		
	}
	}

