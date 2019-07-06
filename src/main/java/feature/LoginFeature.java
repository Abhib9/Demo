package feature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import pageobject.EnterTimeTrackPage;
import pageobject.LoginPage;

public class LoginFeature 
{
	WebDriver driver;
	LoginPage lp;
	EnterTimeTrackPage ettp;
	
	public LoginFeature(WebDriver driver)
	{
		this.driver = driver;
		lp = new LoginPage(driver);
		ettp = new EnterTimeTrackPage(driver);
	}
	
	public void validLogin(String username, String password)
	{
		lp.login(username, password);
		String actualTitle = ettp.getPageTitle().getText();
		String expectedTitle = "Enter Time-Track";
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("Page title is verified", true);
	}
}
