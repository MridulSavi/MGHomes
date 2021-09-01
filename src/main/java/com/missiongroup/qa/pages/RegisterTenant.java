package com.missiongroup.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.missiongroup.qa.base.TestBase;
import com.missiongroup.qa.util.TestUtil;


public class RegisterTenant extends TestBase {
		
	
	@FindBy(xpath = "/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div/input")
	WebElement firstnamefield;
	
	@FindBy(xpath = "/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div/input")
	WebElement lastnamefield;
	
	@FindBy(xpath ="/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[2]/div[1]/mat-form-field/div/div[1]/div/input")
	WebElement emailfield;
	
	//@FindBy(xpath ="/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[2]/div[2]/mat-form-field")
	@FindBy(xpath="//input[@placeholder='Phone Number']")
	WebElement phonenumberfield;
	
	@FindBy(xpath="/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[3]/div[1]/mat-form-field/div/div[1]/div/input")
	WebElement selectpropertyfield;
	
	@FindBy(xpath="/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[3]/div[2]/mat-form-field/div/div[1]/div/input")
	WebElement selectunitfield;
	
	@FindBy(xpath="/html/body/div/div/div/div/mat-option[1]/span")
	WebElement firstunit;
		
	@FindBy(xpath="/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[4]/div[2]/mat-form-field/div/div[1]/div/input")
	WebElement smartlockpinfield;
	
	@FindBy(xpath="/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[5]/button/span")
	WebElement savebutton;
	
	@FindBy(xpath="//mat-option/span[contains(text(),' Blue Sky ')]")
	WebElement propertyname;
	
	WebDriverWait wait = new WebDriverWait(driver, 120);
	
	// Initializing the Page Objects:
	public RegisterTenant() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void filltenantdetails(String fn, String ln, String ef, String ph, String lp) throws InterruptedException{
		 firstnamefield.sendKeys(fn);;
		 lastnamefield.sendKeys(ln);;
		 emailfield.sendKeys(ef);
		 phonenumberfield.sendKeys(ph);
		 //emailfield.sendKeys(Keys.TAB);
		 //wait.until(ExpectedConditions.elementToBeClickable(phonenumberfield));        
		 //phonenumberfield.click();
		 //JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		 //jsExecutor.executeScript("document.getElementById('mat-form-field-label-7').value='8446745111'"); 
		 //jsExecutor.executeScript("arguments[0].value='8446745111'", phonenumberfield);
		 //jsExecutor.executeScript("arguments[0].value=arguments[1]",phonenumberfield,"8446745111");
		 //phonenumberfield.sendKeys(Keys.NUMPAD8);
		 //phonenumberfield.click();
		 selectpropertyfield.click();
		 propertyname.click();
		 selectunitfield.click();
		 firstunit.click();
		 smartlockpinfield.sendKeys(lp);
		 //emailfield.sendKeys(Keys.TAB);
		 //wait.until(ExpectedConditions.elementToBeClickable(phonenumberfield));        
		 //phonenumberfield.click();
		 //JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		 //phonenumberfield.sendKeys("45678901");
		 //jsExecutor.executeScript("document.getElementById('mat-form-field-label-7').value='8446745111'"); 
		 //jsExecutor.executeScript("arguments[0].value='8446745111'", phonenumberfield);
		// new Actions(driver).moveToElement(savebutton).click().perform();
		 savebutton.click();
		
	}
		
	}
	
	

