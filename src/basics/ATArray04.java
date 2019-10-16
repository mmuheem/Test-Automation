package basics;

// get all options present in select class and print in sorted order using Arraylist

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATArray04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/MALIKMUHEEM/Desktop/Honda_new/Se_2019/html/selectclass.html");
		WebElement hotel = driver.findElement(By.id("bhagini"));
		Select sel = new Select(hotel);
		
		//get the address of all options present in select class. 
		List<WebElement> allOptions = sel.getOptions();
		
		//empty array list is created. 
		ArrayList<String> al = new ArrayList<String>();
		
		//get Text of all the options for each loop. 	
		for (WebElement option : allOptions) 
		{
			String text = option.getText();
			al.add(text);
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Thread.sleep(2000);
		driver.close();

	}

}
