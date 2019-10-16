package basics;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT004 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. open web-browser and get details.
		// 2. execute web-driver methods. 
		
		
	//*************************************************************************	
	//*****************************1 *******************************************
	// calling static method using class name (system) - This is java statements. 
	// creating a object using class name ChromeDriver ()  - This is selenium. 
		/* System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.seleniumhq.org/");
	    String title =driver.getTitle();
	    System.out.println("Title is :"+title);
	    String url = driver.getCurrentUrl();
	    System.out.println("Current Url is : "+url);
	    String src = driver.getPageSource();
	    System.out.println("Page soruce code is : "+src);
	    driver.close(); */
	 //****************************************************************************
	 //******************************* 2 ******************************************
	 //1. object is created.
	 //2. constructor is called with initial values. 
	 //3. web-drivers methods (13) are called and executed. 
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver(); 
	     Dimension d = new Dimension(500, 500);
	    //Point p = new Point(100,100);
	    driver.manage().window().setSize(d);
	    //driver.manage().window().setSize(d);
	    //driver.manage().window().setPosition(p);
	    driver.get("https://www.seleniumhq.org/");
	    //driver.manage().window().maximize();
	    //driver.get("https://www.seleniumhq.org/");
	    Thread.sleep(2000);
	    //driver.navigate().to("https://www.airtel.in/");
	    //Thread.sleep(2000);
	    //driver.navigate().back();
	    //Thread.sleep(2000);
	    //driver.navigate().forward();
	    //Thread.sleep(2000);
	    //driver.navigate().refresh();
	    //driver.close(); 
	    //************************************************************
	    //***********************************************************
	    //************************ 3 *********************************
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	   // ChromeDriver driver = new ChromeDriver(); 
	    //Thread.sleep(2000);
	    //driver.quit();
	    
	    
	    
	    
	    
	}

}
