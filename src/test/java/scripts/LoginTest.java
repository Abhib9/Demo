package scripts;

import org.testng.annotations.Test;

import feature.LoginFeature;
import generic.Baselib;
import generic.ExcelUtilities;

public class LoginTest extends Baselib 
{
	@Test
	public void validLogin()
	{
		ExcelUtilities eu = new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.getData("Sheet1", 1, 1);
		String password = eu.getData("Sheet1", 1, 2);
		
		LoginFeature lf = new LoginFeature(driver);
		lf.validLogin(username, password);
		
	}
	
}
