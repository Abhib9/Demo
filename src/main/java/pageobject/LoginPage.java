package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class LoginPage 
{
	@FindBy(name = "username")
	private @Getter WebElement unTextbx;
	
	@FindBy(name = "pwd")
	private @Getter WebElement pwdTextbx;
	
	@FindBy(id = "loginButton")
	private @Getter WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username, String password)
	{
		unTextbx.sendKeys(username);
		pwdTextbx.sendKeys(password);
		loginBtn.click();
	}
}
