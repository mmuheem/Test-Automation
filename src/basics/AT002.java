package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AT002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver", "./Driver1/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://hondanews.eu/");
	String title = driver.getTitle();
	System.out.println("Title is :"+title);
	String url = driver.getCurrentUrl();
	System.out.println("Url is : "+url);
	//String src = driver.getPageSource();
	//System.out.println("page src is :"+src);
	String src = driver.getPageSource();
	System.out.println("page src is :"+src);
	driver.close();
	

}}
