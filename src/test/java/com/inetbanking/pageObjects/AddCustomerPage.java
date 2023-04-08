package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.testcases.BaseClass;

public class AddCustomerPage extends BaseClass {

	public WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'New Customer')]")
	public WebElement newCustomerlink;
	@FindBy(xpath = "//input[@name='name']")
	public WebElement txtCustomerName;

	@FindBy(xpath="//input[@id='dob' and @name='dob']") public WebElement txtDob;
//	@FindBy(how = How.XPATH, using = "//input[@id='dob' and @name='dob']")
//	@CacheLookup
//	public WebElement txtDob;

	@FindBy(xpath = "//textarea[@name='addr']")
	public WebElement txtAddress;
	@FindBy(xpath = "//input[@name='city']")
	public WebElement txtCity;
	@FindBy(xpath = "//input[@name='state']")
	public WebElement txtState;
	@FindBy(xpath = "//input[@name='pinno']")
	public WebElement txtPin;
	@FindBy(xpath = "//input[@name='telephoneno']")
	public WebElement txtPhoneNUm;
	@FindBy(xpath = "//input[@name='emailid']")
	public WebElement txtEamil;
	@FindBy(xpath = "//tbody/tr[13]/td[2]/input[@name='sub']")
	public WebElement submitLink;

	public void clickNewCustomer() {
		newCustomerlink.click();
	}

	public void enterCustomer(String custname) {
		txtCustomerName.sendKeys(custname);
	}

	public void enterDob(String mm, String dd, String year) {
		txtDob.click();
		txtDob.sendKeys(mm);
		txtDob.sendKeys(dd);
		txtDob.sendKeys(year);

	}

	public void enterAddress(String add) {
		txtAddress.sendKeys(add);
	}

	public void enterCity(String city) {
		txtCity.sendKeys(city);
	}

	public void enterState(String state) {
		txtState.sendKeys(state);
	}

	public void enterPin(String pin) {
		txtPin.sendKeys(pin);
	}

	public void enterphoneNum(String phone) {
		txtPhoneNUm.sendKeys(phone);
	}

	public void enteremail(String email) {
		txtEamil.sendKeys(email);
	}

	public void custSubmit() {
		submitLink.click();
	}

}
