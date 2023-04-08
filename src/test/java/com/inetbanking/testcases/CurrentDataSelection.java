package com.inetbanking.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class CurrentDataSelection extends BaseClass{
	
	@Test
	public void selectDate() throws Exception {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		AddCustomerPage acp = new AddCustomerPage(driver);
		acp.clickNewCustomer();
		acp.enterCustomer("venkat");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		Thread.sleep(4000);
	}

}
