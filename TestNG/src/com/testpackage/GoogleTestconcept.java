package com.testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTestconcept {

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
	}
	
	@Test(priority=2, groups="Logo")
	public void GoogleLogoTest() {
		Boolean B =driver.findElement(By.xpath("/html/body/div[1]/div[8]/span/center/div[1]/div/canvas")).isDisplayed();
		System.out.println(B);
	}
	
	@Test(priority=3, groups="Mail")
	public void MailLinkTest() {
		Boolean B= driver.findElement(By.linkText("Mail")).isDisplayed();
		System.out.println(B);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	
}
}