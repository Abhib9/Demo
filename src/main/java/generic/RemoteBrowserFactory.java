package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteBrowserFactory 
{
	public static WebDriver remoteLaunch(String browser, String headLess)
	{
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("Chrome")) 
		{
			ChromeOptions option = new ChromeOptions();
			option.setCapability("BROWSER", "CHROME");
			option.setCapability("PLATFORM", "WINDOWS 8.1");
			option.setCapability("APPLICATION", "ACTITIME");
			option.setHeadless(Boolean.parseBoolean(headLess));
			driver = new RemoteWebDriver(option);
		} 
		else if(browser.equalsIgnoreCase("Firefox")) 
		{
			FirefoxOptions option = new FirefoxOptions();
			option.setCapability("BROWSER", "FIREFOX");
			option.setCapability("PLATFORM", "WINDOWS 8.1");
			option.setCapability("APPLICATION", "ACTITIME");
			option.setHeadless(Boolean.parseBoolean(headLess));
			driver = new RemoteWebDriver(option);
		}
		
		return driver;
	}
}
