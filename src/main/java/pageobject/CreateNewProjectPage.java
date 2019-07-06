package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class CreateNewProjectPage 
{
	@FindBy(name = "customerId")
	private @Getter WebElement custDropdown;
	
	@FindBy(name = "name")
	private @Getter WebElement projectTextbx;
	
	@FindBy(name = "createProjectSubmit")
	private @Getter WebElement createProjectBtn;
	
	public CreateNewProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
