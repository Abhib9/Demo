package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class EnterTimeTrackPage extends BasePage
{
	@FindBy(xpath = "(//td[@class='pagetitle'])[2]")
	private @Getter WebElement pageTitle;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

}
