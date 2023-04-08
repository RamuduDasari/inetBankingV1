package com.inetbanking.testcases;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage;
public class TC_login_001 extends BaseClass{
	
	@Test
	public void loginTest() {
		
		logger.info("Base url launched");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setUserName(username);
		logger.info("Entered username");
		loginpage.setPassword(password);
		logger.info("Entered password");
		loginpage.clickSubmit();
		logger.info("clicked on submit");
		//if(assertEquals(driver.getTitle(), "GTPL Bank Manager HomePage")) {
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			 assertTrue(true);
			 logger.info("login passsed");
		}else {
			assertTrue(false);
			logger.info("login failed");
			
		}
	}
	
			

}
