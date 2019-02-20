package parallel.execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelTestDemo {
	
	WebDriver driver=null;
	
	
	@Test
	public void test1() throws InterruptedException {
		System.out.println("Im in Test 1|"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjula\\Desktop\\testing downloads\\chrome2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.close();
	}

	
	@Test
	public void test2() throws InterruptedException {
		System.out.println("Im in Test 2|"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjula\\Desktop\\testing downloads\\chrome2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void test3() {
		System.out.println("Im in Test 3|" +Thread.currentThread().getId());
	}
}
