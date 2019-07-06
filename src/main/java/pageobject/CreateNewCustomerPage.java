package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class CreateNewCustomerPage 
{
	@FindBy(name = "name")
	private @Getter WebElement customerNameTextbx;
	
	@FindBy(name = "createCustomerSubmit")
	private @Getter WebElement createCustomerBtn;
	
	public CreateNewCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createCust(String custname)
	{
		customerNameTextbx.sendKeys(custname);
		createCustomerBtn.click();
	}
}
