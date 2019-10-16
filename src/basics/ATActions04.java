package basics;
//**********Assignment*************************
//


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ATActions04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://home.redbrickhealth.com/");
		WebElement resEle = driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='Results']"));
		Actions act = new Actions(driver);
		act.moveToElement(resEle).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Research']")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
