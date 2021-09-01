package com.missiongroup.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.missiongroup.qa.base.TestBase;

public class RegisterProperyManagerPage extends TestBase {

	@FindBy(xpath = "//div[@id=\"mat-autocomplete-0\"]//mat-option")
	public List<WebElement> azureUserList;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath = "/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div/input")
	WebElement emailField;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/mat-option[1]/span")
	WebElement azuremail;
	
	@FindBy(xpath = "/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div/input")
	WebElement phonenumberfield;
	
	@FindBy(xpath ="/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[3]/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	WebElement propertyfield;
	
	@FindBy(xpath ="/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span")
	WebElement propertyname;
	
	@FindBy(xpath="/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[4]/button/span")
	WebElement savebutton;
	
	
	// Initializing the Page Objects:
	public RegisterProperyManagerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyRegisterProperyManagerPageTitle(){
		return driver.getTitle();
	}
	
	public void registerpropertymanager(){
		emailField.click();
		azuremail.click();
		phonenumberfield.sendKeys("8446745111");
		propertyfield.click();
		propertyname.click();
		new Actions(driver).moveToElement(savebutton).click().perform();
		savebutton.click();
		
	}
	
	
}
