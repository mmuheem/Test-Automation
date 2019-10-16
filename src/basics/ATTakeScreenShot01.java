package basics;

//take screen shot functionality.

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATTakeScreenShot01 {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//upcasting - one object two different behaviour. 
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/Result1.png");
		FileUtils.copyFile(src, dest);
		driver.close();
	}

}
