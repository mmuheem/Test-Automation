package basics;
//**************************************************************************
// 1. This pgm includes mouse and keyboard actions. 
// 2. Action class is used to moveToElement() - This is overloaded (). 
//*****************************************************************************
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ATActions01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://home.redbrickhealth.com/");
		
		//identify nearest static element and find common parent then identify actual web element. 
		WebElement solEle = driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']"));
		//object of Action class is created to handle moveToElement funtionality.
		Actions act = new Actions(driver);
		//perform is mandatory when we use moveToElement()
		act.moveToElement(solEle).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Problems We Solve']")).click();
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
