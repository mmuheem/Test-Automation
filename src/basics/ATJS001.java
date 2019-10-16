package basics;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATJS001 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MALIKMUHEEM/Desktop/Honda_new/Se_2019/html/disabled.html");
		//converting subclass object to super class object 
		//create subclass object and there only convert it - UPCASTING.
		//sub-class object, parent class referrance variable.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String stmt = "document.getElementById('un').value='MM'";
		js.executeScript(stmt);
		Thread.sleep(2000);
		String stmt1 = "document.getElementById('un').value=' '";
		js.executeScript(stmt1);
		
	}

}
