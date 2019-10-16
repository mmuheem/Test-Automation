package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATWebelements1 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/MALIKMUHEEM/Desktop/Honda_new/Se_2019/html/webelements1.html");
		driver.manage().window().maximize();
		//find elements based on id. 
		WebElement fn = driver.findElement(By.id("fn"));
		fn.sendKeys("MM");
		Thread.sleep(2000);
		//multiple funtionality.
		//copy and paste values. 
		fn.sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(2000);
		WebElement ln = driver.findElement(By.id("ln"));
		ln.sendKeys(Keys.CONTROL+"v");
		
		
		
		

	}

}
