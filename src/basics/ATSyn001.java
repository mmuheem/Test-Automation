package basics;

import java.util.concurrent.TimeUnit;
 	
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATSyn001 {
	static 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new  FirefoxDriver();
		driver.manage().window().maximize();
		// added syncronization code below.
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Login")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("logoutLink")).sendKeys(Keys.ENTER);
		JavascriptExecutor  js = (JavascriptExecutor) driver;
		String stmt = "document.getElementById('logoutLink').click()";
		js.executeScript(stmt);
		//driver.findElement(By.id("logoutLink")).click();
	}
}
