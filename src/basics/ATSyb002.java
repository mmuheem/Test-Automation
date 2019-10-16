package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ATSyb002 {
	static
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String eTitle = driver.getTitle();
		//explict wait
		//WebDriver is class
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//try catch block included. 
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			System.out.println("Title is : "+eTitle);
			System.out.println("PASS");
		}
		catch (Exception e) {
			 System.out.println("FAIL");
			 System.out.println(e.getMessage());
		}
		driver.close();		

	}

}
