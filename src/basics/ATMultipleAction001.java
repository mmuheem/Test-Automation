package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ATMultipleAction001 {
	
	//{
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Driver1\\geckodriver.exe");
	//}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Driver1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement linl = driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		//multiple actions funtionality.
		//act.sendKeys(Keys.CONTROL).click(linl).perform();
		act.sendKeys(Keys.SHIFT).click(linl).perform();
		Thread.sleep(5000);
		//driver.close();
		driver.quit();

	}

}
