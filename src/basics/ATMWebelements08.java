package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATMWebelements08 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		Thread.sleep(2000);
		List<WebElement> autosuggs = driver.findElements(By.xpath("//span[contains(.,'qspiders')]"));
		int count = autosuggs.size();
		System.out.println("Number of autosuggestion present is  "+count);
		for (int i = 0; i < count; i++) 
		{
			WebElement sugg = autosuggs.get(i);
			String text = sugg.getText();
			if (text.equals("qspiders rajajinagar"))
			{
				System.out.println("Welcome to  "+text);
				sugg.click();
				break;
			}
		}
		//System.out.println("Welcome to  "+"text");
		Thread.sleep(2000);
		driver.close();
	}
}
