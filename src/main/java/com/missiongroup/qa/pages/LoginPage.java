package com.missiongroup.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.missiongroup.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(name="userNameOrEmailAddress")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	@FindBy(xpath="/html/body/app-root/ng-component/div/ng-component/div/div/div[2]/div/input")
	WebElement propertymanagerloginbutton;
	
	@FindBy(name="loginfmt")
	WebElement propertymanageremailfield;
	
	@FindBy(name="passwd")
	WebElement propertymanagerpasswordfield;
	
	@FindBy(id="idSIButton9")
	WebElement nextbutton; 
	
	@FindBy(xpath="/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input")
	WebElement signinbutton;
	
	@FindBy(xpath="/html/body/div/form/div/div/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div[2]/input")
	WebElement yesbutton;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	//public boolean validateCRMImage(){
		//return crmLogo.isDisplayed();
	//}
	
	public AdminHomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();	
		
		return new AdminHomePage();
	}
	
	public PropertyManagerHomePage pmlogin(String pmun, String pmpwd) throws InterruptedException{
		propertymanagerloginbutton.click();
		propertymanageremailfield.sendKeys(pmun);
		nextbutton.click();
		propertymanagerpasswordfield.sendKeys(pmpwd);
		Thread.sleep(2000);
		signinbutton.click();
		yesbutton.click();
		
		return new PropertyManagerHomePage();
	}
	
}
