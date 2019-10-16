package basics;

//finding multiple webelements on a webpage.

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATWebelements05 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
	}


	public static void main(String[] args) throws InterruptedException{

		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/MALIKMUHEEM/Desktop/Honda_new/Se_2019/html/handlingmultipleelements.html");
		driver.manage().window().maximize(); 
		//applying findElements ().
		//returns list to elements. 
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		// call size () of collections. 
		int count = allLinks.size();
		System.out.println("No of links : "+count);
		for (int i = 0; i < count; i++) 
		{
			//call get() of collections by passing index value. 
			WebElement link = allLinks.get(i);
			//call getText() of Webelements. 
			String text = link.getText();
			System.out.println(text);	
			Thread.sleep(2000);
		}
		driver.close();
	}

}
