package test.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjula\\Desktop\\testing downloads\\chrome2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//get()-getTitle,getPageSource,
		driver.get("https://www.amazon.com/");
		String gettitle = driver.getTitle();
		System.out.println(gettitle);
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);
		System.out.println(driver.getCurrentUrl());
		//driver.navigate().to("https://www.facebook.com/");
		//System.out.println(driver.getCurrentUrl());
		//driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);- wait for 3 secons
		
		
		
		 driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[1]")).click();
		 driver.findElement(By.id("ap_email")).sendKeys("manjulanair1801@gmail.com");
		 driver.findElement(By.id("ap_password")).sendKeys("supergirl40");
		 driver.findElement(By.className("a-button-input")).click();
		 
		//Handling Image
		 System.out.println(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div/a[1]/span[1]")).isDisplayed());
		 System.out.println(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div/a[1]/span[1]")).getAttribute("title"));
		 
		
		//Thread.sleep(2000);
		 Select select =new Select(driver.findElement(By.id("searchDropdownBox")));
		 select.selectByVisibleText("Clothing, Shoes & Jewelry");
		 select.selectByVisibleText("Appliances");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Instant Pot 6 qt");
		 driver.findElement(By.className("nav-input")).click();
		 
		//Handle radio button
		// driver.findElement(By.xpath("//*[@id=\"p_85/2470955011\"]")).isEnabled();
		 //driver.findElement(By.xpath("//*[@id=\\\"p_85/2470955011\"]")).isEnabled();
		 //driver.findElement(By.xpath("//*[@id=\\\"p_85/2470955011\"]")).click();
		 
		
	
	}		
		
}
