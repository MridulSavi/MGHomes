package com.missiongroup.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.missiongroup.qa.base.TestBase;

public class PropertyManagerHomePage extends TestBase{
	
	//@FindBy(xpath = "/html/body/app-root/ng-component/section[1]/aside/sidebar-nav/div/div[1]/ul/li[2]/a/span")
	@FindBy(xpath ="//a[contains(text(),'Register Tenant')]")
	WebElement registertenantlink;
	
	@FindBy(xpath ="//span[contains (text(),'Communication')]")
	WebElement communicationlink;
	
	
	
	
	
	
	// Initializing the Page Objects:
		public PropertyManagerHomePage() {
			PageFactory.initElements(driver, this);
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
		
		public RegisterTenant clickOnRegisterTenantLink(){
			wait.until(ExpectedConditions.elementToBeClickable(registertenantlink));
			registertenantlink.click();
			return new RegisterTenant();
		}
		
		public CommunicationPage clickOncommunicationLink() throws InterruptedException{
			Thread.sleep(10000);
			//wait.until(ExpectedConditions.elementToBeClickable(communicationlink));
			communicationlink.click();
			return new CommunicationPage();
		}
		
}
