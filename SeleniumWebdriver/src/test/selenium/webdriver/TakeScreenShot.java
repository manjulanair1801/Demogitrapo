package test.selenium.webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShot {

	
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjula\\Desktop\\testing downloads\\chrome2\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("manjeri7876@gmail.com");
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("./screenshots/facebook.png"));
	}

}
