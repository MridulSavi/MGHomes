package com.missiongroup.qa.pages;

import static org.testng.Assert.assertTrue;

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


public class CommunicationPage extends TestBase {
		
	
	@FindBy(xpath = "//span[contains(@class, 'mat-option-text') and contains (.//span, 'Blue Sky')]")
	WebElement selectproperty;
	
	@FindBy(xpath = "//div[contains(@class, 'mat-form-field-infix') and contains (.//span, 'Select Property')]")
	WebElement propertyfield;
	
	@FindBy(xpath ="//div[contains(@class, 'mat-form-field-infix') and contains (.//span, 'Select Floor')]")
	WebElement floorfield;
	
	//@FindBy(xpath ="/html/body/app-root/ng-component/section[2]/div/ng-component/div/form/div[2]/div[2]/mat-form-field")
	@FindBy(xpath="//mat-option/span[contains(.,'1')]")
	WebElement floornumber1;
	
	@FindBy(xpath="//mat-option/span[contains(.,'2')]")
	WebElement floornumber2;
	
	@FindBy(xpath="//mat-option/span[contains(.,'3')]")
	WebElement floornumber3;
	
	@FindBy(xpath="//mat-option/span[contains(.,'4')]")
	WebElement floornumber4;
	
	@FindBy(xpath="//mat-option/span[contains(.,'5')]")
	WebElement floornumber5;
	
	@FindBy(xpath="//mat-option/span[contains(.,'6')]")
	WebElement floornumber6;
	
	@FindBy(xpath="//mat-option/span[contains(.,'7')]")
	WebElement floornumber7;
	
	@FindBy(xpath="/html/body/app-root/ng-component/section[2]/div/app-communication/div[2]/div/a/img")
	WebElement addicon;
	
	@FindBy(xpath="//div[contains(@class, 'mat-form-field-infix') and contains (.//span, 'Select Unit')]")
	private WebElement selectunitfield;
	
	@FindBy(xpath="//input[@name=\"Subject\"]")
	WebElement subjectfield;
		
	@FindBy(xpath="/html/body/app-root/ng-component/section[2]/div/app-add-communication/div[3]/div/div[2]/input")
	WebElement sendbutton;
	
	@FindBy(xpath="/html/body[@contenteditable=\"true\"]")
	WebElement contentfield;
	
	@FindBy(xpath="//input[@placeholder=\"Enter Public Mailinator Inbox\"]")
	WebElement mailinatoremailfield;
	
	@FindBy(xpath="//button[@id=\"go-to-public\"]")
	WebElement gobutton;
	
	//@FindBy(xpath="//td[contains(text(), 'Test Automation')]")
	@FindBy(xpath=" /html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr[1]/td[3]")
	WebElement mailinatorsubject;
	
	String sentsubject = "Test Automation";
	
	
	
	WebDriverWait wait = new WebDriverWait(driver, 120);
	
	// Initializing the Page Objects:
	public CommunicationPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickallfloor() throws Throwable {
		addicon.click();
		propertyfield.click();
		Thread.sleep(3000);
		propertyfield.click();
		selectproperty.click();
		new Actions(driver).moveToElement(floorfield).click().perform();
		floorfield.click();
		Thread.sleep(5000);
		List <WebElement> list= driver.findElements(By.xpath("//span[@class='mat-option-text']"));
		System.out.println(list.size());
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
		
			
		}
		
		list.get(1).click();
		
	}
	
	public void clickallunit() throws Throwable {
		
		new Actions(driver).moveToElement(selectunitfield).click().perform();
		Thread.sleep(2000);
		selectunitfield.click();
		List <WebElement> list= driver.findElements(By.xpath("//span[@class='mat-option-text']"));
		System.out.println(list.size());
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
	}
		list.get(1).click();
		
	}


	public void composemessage() throws InterruptedException {
		new Actions(driver).moveToElement(subjectfield).click().perform();
		subjectfield.sendKeys(sentsubject);
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("body")).sendKeys("This is to test automation");
		driver.switchTo().parentFrame();
		sendbutton.click();
		
	}
	
	public void verifyemail() {
		driver.get("https://www.mailinator.com/");
		mailinatoremailfield.sendKeys("mridulvashistha329@mailinator.com");
		gobutton.click();
		String subjecttext= mailinatorsubject.getText();
		System.out.println(subjecttext);
		assertTrue(subjecttext.contains(sentsubject));
		
	}
	
}
	
	

