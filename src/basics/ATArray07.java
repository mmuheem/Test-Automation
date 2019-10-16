package basics;
//get all options present in select class and print using Arraylist collection. 
//Arraylist will allow duplicate values. 
//**********************************************************************************
//Objective - to verify wheather give values present in Arraylist or not.

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ATArray07 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/MALIKMUHEEM/Desktop/Honda_new/Se_2019/html/selectclass.html");
		WebElement hotel = driver.findElement(By.id("bhagini"));
		Select sel = new Select(hotel);
		
		//get list of all options present in select class. 
	    //allOptions contain address of all options elements.. 
		List<WebElement> allOptions = sel.getOptions();

		//creating empty array list
		ArrayList<String> al = new ArrayList<String>();
		
		for (WebElement option : allOptions) 
		{
			String text = option.getText();
			al.add(text);	
		}
		if (al.contains("Chicken"))
		{
			System.out.println("Chicken item is present in the ArrayList");
		}
		else
		{
			System.out.println("Chicken item is not present in the ArrayList");
		}
		driver.close();
	}

}
