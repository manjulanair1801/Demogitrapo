package actionsclass.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjula\\Desktop\\testing downloads\\chrome2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		WebElement ele =(driver.findElement(By.xpath("//*[@id=\"post-body-4229879368008023176\"]/div[1]/div[2]/button")));
		act.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"post-body-4229879368008023176\"]/div[1]/div[2]/div/a[1]"));
		//Right Click
		//act.contextClick(ele1).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
		act.moveToElement(ele1).contextClick().sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();

	}

}