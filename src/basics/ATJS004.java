package basics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATJS004 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		WebElement java = driver.findElement(By.xpath("//td[.='Java']"));
		int y = java.getLocation().getY();
		System.out.println(y);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String ele = "window.scrollBy(0,'"+y+"')";
		js.executeScript(ele);
		Thread.sleep(2000);
		String scrollup = "window.scrollBy(0,-100)";
		js.executeScript(scrollup);
	}
}
