package basics;
//***************************************************************************
//1. This pgm includes doubleclick funtionality. 
//2. Action class is used to handle doubleclick() - Which is overloaded method. 
//****************************************************************************
//Issue1 : Testing is pending due to html code is not poping message

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATActions02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MALIKMUHEEM\\eclipse-workspace\\Test Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://home.redbrickhealth.com/");

	}

}
