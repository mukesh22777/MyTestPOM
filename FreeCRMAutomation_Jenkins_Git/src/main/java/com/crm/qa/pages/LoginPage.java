package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:

	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")
	WebElement password;
	
	@FindBy(xpath="//*[@class=\"ui fluid large blue submit button\"]")
	WebElement loginBtn;
	
	//@FindBy(xpath="//*[@id=\"top-header-menu\"]/div[3]/span[2]/a")
	//WebElement crmLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	//public boolean validateCRMImage(){
	//	return crmLogo.isDisplayed();
	//}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		    //	JavascriptExecutor js = (JavascriptExecutor)driver;
		    //	js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	}
	
}
