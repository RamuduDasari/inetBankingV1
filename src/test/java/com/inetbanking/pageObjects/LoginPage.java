package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver ldriver;
    public LoginPage(WebDriver rdriver) {
		  
    	ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	  @FindBy(xpath="//tbody/tr[1]/td[2]/input[@name='uid']") public WebElement txtUserName;
	  @FindBy(xpath="//tbody/tr[2]/td[2]/input[@name='password']") public WebElement txtPassword;
	  @FindBy(xpath="//tbody/tr[3]/td[2]/input[@name='btnLogin']") public WebElement btnSubmit;
	  @FindBy(xpath="//a[contains(text(),'Log out')]") public WebElement btnLogout;
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
   }
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickSubmit() {
		btnSubmit.click();
	}
	
	public void clickLogout() {
		btnLogout.click();
	}

}
