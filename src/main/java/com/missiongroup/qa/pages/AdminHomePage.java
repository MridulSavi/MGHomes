package com.missiongroup.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.missiongroup.qa.base.TestBase;

public class AdminHomePage extends TestBase {

	@FindBy(xpath = "/html/body/app-root/ng-component/section[1]/aside/sidebar-nav/div/div[1]/ul/li[1]/a/span")
	@CacheLookup
	WebElement homeLink;

	@FindBy(xpath = "/html/body/app-root/ng-component/section[1]/aside/sidebar-nav/div/div[1]/ul/li[2]/a/span")
	WebElement registerPropertyManagerLink;
	
	@FindBy(xpath = "/html/body/app-root/ng-component/section[2]/div/ng-component/div/div[2]/div[1]/a")
	WebElement registerPropertyManagerDashboardLink;
	
	@FindBy(xpath = "/html/body/app-root/ng-component/section[1]/aside/sidebar-nav/div/div[1]/ul/li[3]/a/span")
	WebElement viewDetailsLink;
	
	@FindBy(xpath = "/html/body/app-root/ng-component/section[2]/div/ng-component/div/div[2]/div[2]/a")
	WebElement viewDetailsDashboardLink;
	
	@FindBy(xpath = "/html/body/app-root/ng-component/section[1]/aside/sidebar-nav/div/div[1]/ul/li[4]/a/span")
	WebElement uploadFileLink;

	@FindBy(xpath = "/html/body/app-root/ng-component/section[1]/aside/sidebar-nav/div/div[1]/ul/li[5]/a/span")
	WebElement tenantManagmentlink;
	
	@FindBy(xpath = "/html/body/app-root/ng-component/section[1]/aside/sidebar-nav/div/div[1]/ul/li[7]/a/span")
	WebElement schlageAccountlink;
	
	@FindBy(xpath = "/html/body/app-root/ng-component/section[1]/aside/sidebar-nav/div/div[2]/ul/li/a/span")
	WebElement logoutlink;

	// Initializing the Page Objects:
	public AdminHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyAdminHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public AdminHomePage clickOnHomeLink(){
		homeLink.click();
		return new AdminHomePage();
	}
	
	public RegisterProperyManagerPage clickOnPropertyManagerLink() throws Throwable{
		Thread.sleep(4000);
		registerPropertyManagerLink.click();
		return new RegisterProperyManagerPage();
	}
	
	/*
	 * public TasksPage clickOnTasksLink(){ tasksLink.click(); return new
	 * TasksPage(); }
	 * 
	 * public void clickOnNewContactLink(){ Actions action = new Actions(driver);
	 * action.moveToElement(contactsLink).build().perform(); newContactLink.click();
	 * 
	 * }
	 */
	
}
	
	
	
	
	
	


