package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BrowserFactory 
{
	public static WebDriver launch(String browsername)
	{
		WebDriver driver = null;
		
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
			driver = new ChromeDriver();
			Reporter.log("Launching Chrome",true);
		}
		
		else if (browsername.equalsIgnoreCase("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
			driver = new FirefoxDriver();
			Reporter.log("Launching Firefox",true);
		}
		
		return driver;
	}
}
