package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AT001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// **** Chrome Browser  ********	//
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
			
	
	// **** IE Browser  ***** //
	//	System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
	//	InternetExplorerDriver driver = new InternetExplorerDriver();
	//	driver.get("https://www.facebook.com/");
	
	// **** This is for FF Browser  **** //
	
		/*System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();*/
		driver.get("https://hondanews.eu/");
		String title = driver.getTitle();
		System.out.println("Title is :"+title);
		String url = driver.getCurrentUrl();
		System.out.println("Url is : "+url);
		String src = driver.getPageSource();
		System.out.println("page src is :"+src);
		//System.out.println(driver.getPageSource());
		driver.close();
	}

}
