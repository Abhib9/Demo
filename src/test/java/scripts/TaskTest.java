package scripts;

import org.testng.annotations.Test;

import feature.TaskFeature;
import generic.Baselib;
import generic.ExcelUtilities;

public class TaskTest extends Baselib 
{
	@Test
	public void createCustomer() 
	{
		ExcelUtilities eu = new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.getData("Sheet1",3,1);
		String password = eu.getData("Sheet1",3,2);
		String custname = eu.getData("Sheet1",3,3);
		
		TaskFeature tf = new TaskFeature(driver);
		tf.createCustomer(username, password, custname);
	}
	
	@Test(dependsOnMethods = "deleteProject")
	public void deleteCustomer()
	{
		ExcelUtilities eu = new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.getData("Sheet1",3,1);
		String password = eu.getData("Sheet1",3,2);
		String custname = eu.getData("Sheet1",3,3);
		
		TaskFeature tf = new TaskFeature(driver);
		tf.deleteCustomer(username, password, custname);
	}
	
	@Test(dependsOnMethods = "createCustomer")
	public void createProject()
	{	
		ExcelUtilities eu = new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.getData("Sheet1",5,1);
		String password = eu.getData("Sheet1",5,2);
		String custname = eu.getData("Sheet1",5,3);
		String projname = eu.getData("Sheet1",5,4);
		
		TaskFeature tf = new TaskFeature(driver);
		tf.createProject(username, password, custname, projname);
	}
	
	@Test(dependsOnMethods = "createProject")
	public void deleteProject()
	{
		ExcelUtilities eu = new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.getData("Sheet1",5,1);
		String password = eu.getData("Sheet1",5,2);
		String custname = eu.getData("Sheet1",5,3);
		String projname = eu.getData("Sheet1",5,4);
		
		TaskFeature tf = new TaskFeature(driver);
		tf.deleteProject(username, password, custname, projname);
	}
}
