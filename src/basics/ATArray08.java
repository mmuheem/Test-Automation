package basics;
//**********************************************************************************
//Objective - to verify duplicate item present in Arraylist or not.

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATArray08 {
	
	//Declear one static variable. 
	static int count = 0;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/MALIKMUHEEM/Desktop/Honda_new/Se_2019/html/selectclass.html");
		WebElement hotel = driver.findElement(By.id("bhagini"));
		Select sel = new Select(hotel);
		
		List<WebElement> allOptions = sel.getOptions();
		
		ArrayList<String> al = new ArrayList<String>();
		
		for (WebElement option : allOptions) 
		{
			String text = option.getText();
			if (text.equals("Prowns   "))
			{
				count++;
			}	
		}
		if (count > 1)
		{
			System.out.println("Prowns are duplicate");
		}
		driver.close();
	}
}
