package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page factory or Object repository
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath ="//*[@id=\"signInSubmit\"]")
	WebElement Signin;

	@FindBy(xpath ="//*[@id=\"a-page\"]/div[1]/div[1]/div/a/i")
	WebElement AmazonLogo;
	
	//intializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
}
	// Action1
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	// Action2
	public Boolean  ValidateLogo() {
		return AmazonLogo.isDisplayed();
	}
	
	public HomePage login(String em,String pwd) {
		email.sendKeys(em);
		password.sendKeys(pwd);
		Signin.click();
		return new HomePage();
	}
}
