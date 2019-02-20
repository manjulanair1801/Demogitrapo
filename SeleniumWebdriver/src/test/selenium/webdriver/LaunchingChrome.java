package test.selenium.webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjula\\Desktop\\testing downloads\\chrome2\\chromedriver.exe");
		//System is a class and setProperty is a method,with key and value pair 
		
		WebDriver driver =new ChromeDriver();
		//WebDriver is an Interface,driver is a reference variable  whose type is an interface. 
		//new Chromedriver is the object of that interface
		
		driver.get("https://www.walmart.com/account/signup");
		//driver is the predefined class and get is the method get(string)
		
		System.out.println(driver.getTitle());
		//gettitle will give you the title of the website .
		
		
		//Locators :-
		/*1. Xpath 
		 * 2.Id
		 * 3. Name
		 * 4.LinkText
		 * 5.CSS selector- #Id or right click on input field, copy css selector
		 * 6.Partial link text
		 * 7.Class name 
		 * 8.
		 */
		
		//1. Xpath
		driver.findElement(By.xpath("//*[@id=\"first-name-su\"]")).sendKeys("Manisha");//findElement is a class and By is also a class.xpath is the method and send keys is a method .
		//driver.findElement(By.xpath("//*[@id=\"last-name-su\"]")).sendKeys("Nair");
		
		
		//2. ID
		driver.findElement(By.id("email-su")).sendKeys("manisha123@gmail.com");
		//driver.findElement(By.id("password-su")).sendKeys("manishanu");
		
		//3. Name
		//driver.findElement(By.name("password")).sendKeys("manisha123");
		
		//6. CSS Selector
			driver.findElement(By.cssSelector("#password-su")).sendKeys("manishanu");
			driver.findElement(By.cssSelector("#last-name-su")).sendKeys("Nair");
				
		
		//4.linkText
		driver.findElement(By.linkText("Terms of Use")).click();
		
		//5 Partial link tesxt( only for links but not used much )
		driver.findElement(By.partialLinkText("Privacy")).click();
		
		
		//7. Classname - is not recommended as it can be duplicate for different elements 
		//driver.findElement(By.className("button ghost")).click();
	}
}
