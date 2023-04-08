package com.inetbanking.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public String url = readconfig.getUrl();
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	@Parameters("browser")
	public void setUP(String browser) {

		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("log4j.properties");

		if (browser.equalsIgnoreCase("GC")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("FF")) {
			driver = new FirefoxDriver();
		}
		 else if (browser.equalsIgnoreCase("IE")) {
				driver = new InternetExplorerDriver();
			}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get(url);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver , String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") +"/ScreenShot/" + tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	

}
