package com.missiongroup.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.missiongroup.qa.base.TestBase;
import com.missiongroup.qa.pages.AdminHomePage;
import com.missiongroup.qa.pages.CommunicationPage;
import com.missiongroup.qa.pages.LoginPage;
import com.missiongroup.qa.pages.PropertyManagerHomePage;
import com.missiongroup.qa.pages.RegisterProperyManagerPage;
import com.missiongroup.qa.pages.RegisterTenant;
import com.missiongroup.qa.util.TestUtil;

public class PropertyManagerHomePageTest extends TestBase {
	
	LoginPage loginPage;
	TestUtil testUtil;
	RegisterProperyManagerPage registerpropertymanagerpage;
	PropertyManagerHomePage propertymanagerhomepage;
	RegisterTenant  registertenant;
	CommunicationPage communicationspage;
	String sheetName = "contacts";
	
	public PropertyManagerHomePageTest() {
		super();
	}
	
	// test cases should be separated -- independent with each other
		// before each test case -- launch the browser and login
		// @test -- execute test case
		// after each test case -- close the browser

	@Test(priority=1)
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		registertenant = new RegisterTenant();
		propertymanagerhomepage= loginPage.pmlogin(prop.getProperty("propertymanagerusername"), prop.getProperty("propertymanagerpassword"));
		communicationspage = new CommunicationPage();
	}
	
//	@Test(priority = 1)
//	public void registerTenant() throws Throwable{
//		propertymanagerhomepage.clickOnRegisterTenantLink();
//		
//		
//	}
	
//	@DataProvider
//	public Object[][] getMGTestData(){
//		Object data[][] = TestUtil.getTestData(sheetName);
//		return data;
//	}
	
	
//	@Test(priority=2, dataProvider="getMGTestData")
//	public void CreateNewTenant(String firstname, String lastname, String email, String number, String smartpin) throws Throwable{
//	propertymanagerhomepage.clickOnRegisterTenantLink();
//	registertenant.filltenantdetails(firstname, lastname, email, number, smartpin);
//		
//	}
	
	@Test(priority=2)
	public void SendCommunication() throws Throwable{
	propertymanagerhomepage.clickOncommunicationLink();
	communicationspage.clickallfloor();
	communicationspage.clickallunit();
	communicationspage.composemessage();
	communicationspage.verifyemail();
	}
	
//	@AfterMethod
//	public void tearDown(){
//	driver.quit();
//	}
	
		

}
