package test.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjula\\Desktop\\testing downloads\\chrome2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();
		driver.findElement(By.linkText("Tops")).click();
		driver.findElement(By.linkText("T-SHIRTS")).click();
		
		Select select = new Select(driver.findElement(By.id("selectProductSort")));
		select.selectByVisibleText("In stock");
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[2]/span"))).build().perform();
		Thread.sleep(3000);
		
}
}
