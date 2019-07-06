package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class EditCustomerInfoPage 
{
	@FindBy(css = "input[value='Delete This Customer']")
	private @Getter WebElement deleteThisCust;
	
	@FindBy(css = "input[value='Delete Customer']")
	private @Getter WebElement confirmDeleteBtn;
	
	public EditCustomerInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void performDelete()
	{
		deleteThisCust.click();
		confirmDeleteBtn.click();	
	}

}
