package basics;

import java.util.List;
import java.util.TreeSet;

//get all options present in select class and print using TreeSet collection. 
//Treeset will not allow duplicate values and store in sorted order. 

//*********Output *************************************************************************
//duplicate values should not present and store in sorted fashion. 


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATArray06 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/MALIKMUHEEM/Desktop/Honda_new/Se_2019/html/selectclass.html");
		WebElement hotel = driver.findElement(By.id("bhagini"));
		Select sel = new Select(hotel);
		
		//get list of all options present in select class. 
		//allOptions contain address of all options elements.
		List<WebElement> allOptions = sel.getOptions();
		
		//create empty Treeset collections.
		TreeSet<String> ts = new TreeSet<String>();
		
		for (WebElement option : allOptions) 
		{
			String text = option.getText();
			ts.add(text);
		}
		System.out.println(ts);
		driver.close();
	}
}