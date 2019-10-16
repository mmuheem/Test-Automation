package basics;
//mutiple dropdowns...

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATHandlyngMultipleDropDownMulti {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/MALIKMUHEEM/Desktop/Honda_new/Se_2019/html/selectclassmultiple.html");
		WebElement hotel = driver.findElement(By.id("bhagini"));
		Select sel = new Select(hotel);
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByValue("m");
		Thread.sleep(5000);
		sel.selectByVisibleText("Prowns");
		Thread.sleep(5000);
		sel.deselectAll();
		Thread.sleep(5000);
		driver.close();
		

	}

}
