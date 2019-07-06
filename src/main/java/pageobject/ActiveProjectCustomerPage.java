package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class ActiveProjectCustomerPage 
{
	@FindBy(css = "input[value='Create New Customer']")
	private @Getter WebElement createNewCustomerBtn;
	
	@FindBy(xpath = "//span[@class='successmsg']")
	private @Getter WebElement successMsg;
	
	@FindBy(name = "selectedCustomer")
	private @Getter WebElement customerDropdown;
	
	@FindBy(css = "input[value*='Show']")
	private @Getter WebElement showBtn;
	
	@FindBy(xpath = "//td[contains(@id,'customerNameCell')]//a[contains(@href, 'customerId')]")
	private @Getter WebElement customerNameLink;
	
	@FindBy(css = "input[value='Create New Project']")
	private @Getter WebElement createNewProjectBtn;
	
	@FindBy(name = "showProjects")
	private @Getter WebElement checkbx;
	
	@FindBy(xpath = "//td[contains(@id, 'projectNameCell')]//a[contains(@href, 'project')]")
	private @Getter WebElement projectList;
	
	public ActiveProjectCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
