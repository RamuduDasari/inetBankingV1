package com.inetbanking.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomer_003 extends BaseClass {

	@Test
	public void addNewCustomer() throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();

		Thread.sleep(3000);

		AddCustomerPage acp = new AddCustomerPage(driver);
		acp.clickNewCustomer();
		logger.info("clicked on new customer");
		acp.enterCustomer("venkat");
		logger.info("Entered username");

		acp.enterDob("10", "15", "1985");
		logger.info("Entered Date");
		Thread.sleep(5000);

		acp.enterAddress("kurnool");
		logger.info("Entered address");
		acp.enterCity("nandyal");
		logger.info("Enterd city");
		acp.enterState("Andhra");
		logger.info("Entered State");
		acp.enterPin("518510");
		logger.info("Entered pin ");
		acp.enterphoneNum("1234567890");
		logger.info("Entered phone ");

		String email = randomString() + "@gmail.com";
		acp.enteremail(email);
		logger.info("Entered email ");
		acp.custSubmit();
		logger.info("clicked on submit ");

	}

	public String randomString() {
		String generatedText = RandomStringUtils.randomAlphabetic(8);

		return generatedText;
	}

}
