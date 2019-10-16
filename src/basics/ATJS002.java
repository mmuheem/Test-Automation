package basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATJS002 {
	
	//{
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
	//}

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		String scrolldown = "window.scrollBy(0,5000)";
		js.executeScript(scrolldown);
		Thread.sleep(2000);
		String scrollup = "window.scrollBy(0,-5000)";
		js.executeScript(scrollup);
		Thread.sleep(2000);
	}

}
