package basics;
//*************************************************
//1. Verify traversing through iframes.
//2. Three ways to switch to frames.
//		a. by Index.
//		b. by name or Id. 
//		c. by webelement. 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATIframes001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Driver1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/MALIKMUHEEM/Desktop/Honda_new/Se_2019/html/page1.html");
		//**********************Identifying element in main parent frame *****************
		driver.findElement(By.id("m")).sendKeys("Name");
		//********************** Different ways of Switching to iframes ****************************************
		//driver.findElement(By.id("gf1")).sendKeys("Name2");
		//1. **Switching to first frame by index value******************
		//driver.switchTo().frame(0);
		Thread.sleep(2000);
		//2.  **Switching to first frame by name or Id *****************
		//driver.switchTo().frame("frame");
		//3. **Switching to first frame by webelement *************************
		WebElement frm = driver.findElement(By.xpath("//iframe[@name='frame']"));
		driver.switchTo().frame(frm);
		driver.findElement(By.id("gf1")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("s")).sendKeys("BCD");
		Thread.sleep(2000);
		//4.***************** Switching back to main parent frame *************************** 
		driver.switchTo().defaultContent();
		driver.findElement(By.id("gf2")).sendKeys("XYZ");
		Thread.sleep(2000);
		driver.close();
	}

}
