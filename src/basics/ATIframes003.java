package basics;
//***************************************************************************************************
//1. iframes and Action class. 
//2. Verify draggable & droppable funtionality. 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ATIframes003 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Driver1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.click(draggable).moveToElement(droppable).perform();
		
		
		

	}

}
