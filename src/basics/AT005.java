package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT005 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("file:///C:/Users/MALIKMUHEEM/Desktop/Se_2019/html/test2.html");
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//WebElement fp = driver.findElement(By.id("fp"));
		WebElement fp = driver.findElement(By.partialLinkText("Forgot"));
		//driver.find
		//System.out.println("address is "+fp);
		//fp.click();
	}

}
