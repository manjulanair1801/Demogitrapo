package actionsclass.selenium.webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjula\\Desktop\\testing downloads\\chrome2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com");
		driver.manage().window().maximize();
		
		//Scroll down using JavascriptExecuter
		
		 Thread.sleep(5000);
		 
		 // ((JavascriptExecutor)driver).executeScript("scroll(0,-400)");
		  JavascriptExecutor je = (JavascriptExecutor)driver;
		  je.executeScript("scroll(0,400)");
		  
		     

	}

}
