package basics;

// find multiple webelement by using findElements and check it. 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATMWebelements06 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
	}


	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/MALIKMUHEEM/Desktop/Honda_new/Se_2019/html/xpathbygroupindex.html");
		driver.manage().window().maximize();
		//applying findElements ().
		//returns list to elements. 
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = allcheckbox.size();
		System.out.println("No of checkboxs present is :"+count);
		for (int i = 0; i < count; i++) 
		{
			WebElement checkbox = allcheckbox.get(i);
			//Thread.sleep(2000);
			checkbox.click();
			Thread.sleep(2000);	
		}
		driver.close();
	}

}
