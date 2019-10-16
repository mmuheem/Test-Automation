package basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATJS003 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		String scrolldown = "window.scrollBy(0,2500)";
		String scrollup = "window.scrollBy(0,-2500)";
		for (int i = 0; i<4; i++) 
		{
			js.executeScript(scrolldown);
			Thread.sleep(2000);
		}
		for (int i = 0; i < 4; i++) 
		{
			js.executeScript(scrollup);
			Thread.sleep(2000);	
		}
		driver.close();
	}
}
