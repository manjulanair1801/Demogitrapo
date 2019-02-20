package com.parameters.edu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestClass {
	
	WebDriver driver;

	@Parameters({"url","emailId","password"})
	
	@Test
	public void yahoologintest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjula\\Desktop\\testing downloads\\chrome2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("url");
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("emailId");
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
		
	}
	}
