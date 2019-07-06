package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class EditProjectInfoPage 
{
	@FindBy(css = "input[value='Delete This Project']")
	private @Getter WebElement deleteThisProjectBtn;
	
	@FindBy(css = "input[value='Delete Project']")
	private @Getter WebElement confirmDelBtn;
	
	public EditProjectInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
