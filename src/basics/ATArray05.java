package basics;

//get all options present in select class and print using hashset collection. 
//hashset will not allow duplicate values. 

//*********Output *************************************************************************
//duplicate values should not present and store in hashset fashion ( not in sorted order )

import java.util.HashSet;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATArray05 {

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
		
		//empty hashset is created. 
		HashSet<String> hs = new HashSet<String>();
		
		for (WebElement option : allOptions) 
		{
			String text = option.getText();
			hs.add(text);	
		}
		System.out.println(hs);
        driver.close();
	}

}
