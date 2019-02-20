package test.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjula\\Desktop\\testing downloads\\chrome2\\chromedriver.exe");
		//System is a class and setProperty is a method,with key and value pair 
		
		WebDriver driver =new ChromeDriver();
		//WebDriver is an Interface,driver is a reference variable  whose type is an interface. 
		//new Chromedriver is the object of that interface
		
		driver.get("https://www.amazon.com/");
		//driver is the predefined class and get is the method get(string)
		
		System.out.println(driver.getTitle());
		//gettitle will give you the title of the website .
		
		//Handle a drop box 
		Select select =new Select(driver.findElement(By.id("searchDropdownBox")));
		select.selectByVisibleText("Books");
		

}
}
