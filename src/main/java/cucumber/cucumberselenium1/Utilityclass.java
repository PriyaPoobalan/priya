package cucumber.cucumberselenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utilityclass {
	static WebDriver driver;
	public static WebDriver openBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Training_C2A.04.30\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
//		else if(browsername.equalsIgnoreCase("firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver", 
//					"C:\\SeleniumDrivers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
		else if(browsername.equalsIgnoreCase("Ie"))
		{
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Training_C2A.04.30\\Desktop\\Driverpath\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

}
