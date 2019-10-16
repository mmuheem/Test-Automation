package basics;

//*******************************************************************************
//1. This pgm includes contextClick funtionality. 
//2. Action class is used to handle contextClick() - Which is overloaded method. 
//3. contextClick is used to handle rightClick menu. 
//4. Robot class is used to handle after Rightclick. This is java class. 
//********************************************************************************
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ATActions03 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement linl = driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		
		//***********Action class is introduced to handle till rightclick option ***********
		Actions act = new Actions(driver);
		//*************perform() is mandatory to make contextClick() to work as expected ********
		act.contextClick(linl).perform();
		Thread.sleep(2000);
		
		//*************Robot class is java class, introduced to handle after rightclick menu. *************
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(5000);
		//************* close will close only parent browser. ********************
		//driver.close();
		//************* quit will close both parent and child browser.************** 
		driver.quit();	
	}
}

