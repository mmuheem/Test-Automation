package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATWebelements3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/MALIKMUHEEM/Desktop/Honda_new/Se_2019/html/webelements1.html");
		driver.manage().window().maximize();
		//xpath by text. 
		WebElement fblink = driver.findElement(By.xpath("//a[.='facebook']"));
		fblink.click();

	}

}
