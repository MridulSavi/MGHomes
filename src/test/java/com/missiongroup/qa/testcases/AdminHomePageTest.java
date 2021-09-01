package com.missiongroup.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.missiongroup.qa.base.TestBase;
import com.missiongroup.qa.pages.ContactsPage;
import com.missiongroup.qa.pages.AdminHomePage;
import com.missiongroup.qa.pages.LoginPage;
import com.missiongroup.qa.pages.RegisterProperyManagerPage;
import com.missiongroup.qa.util.TestUtil;

public class AdminHomePageTest extends TestBase {
	LoginPage loginPage;
	AdminHomePage adminhomePage;
	TestUtil testUtil;
	RegisterProperyManagerPage registerpropertymanagerpage;

	public AdminHomePageTest() {
		super();
	}

	// test cases should be separated -- independent with each other
	// before each test case -- launch the browser and login
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		adminhomePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		registerpropertymanagerpage = new RegisterProperyManagerPage();
	}

	/*
	 * @Test(priority=1) public void verifyHomePageTitleTest(){ String homePageTitle
	 * = adminhomePage.verifyAdminHomePageTitle();
	 * Assert.assertEquals(homePageTitle, "Mission Group Homes");
	 * 
	 * }
	 */

//	@Test(priority = 1)
//	public void registerPropertyManager() throws Throwable {
//		adminhomePage.clickOnPropertyManagerLink();
//
//	}

	@Test(priority = 1)
	public void registerpropertymamager () throws Throwable {
		adminhomePage.clickOnPropertyManagerLink();
		registerpropertymanagerpage.registerpropertymanager();
	}


	/*
	 * @Test(priority=3) public void verifyContactsLinkTest(){
	 * testUtil.switchToFrame(); contactsPage = adminhomePage.clickOnContactsLink();
	 * }
	 */

	/*
	 * @AfterMethod public void tearDown(){ driver.quit(); }
	 */

}
