package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pop;

	public ReadConfig() {

		File src = new File("./Configurations/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pop = new Properties();
			pop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getUsername() {
		String uname = pop.getProperty("username");
		return uname;
	}

	public String getPassword() {
		String passwd = pop.getProperty("password");
		return passwd;
	}

	public String getUrl() {
		String baseurl = pop.getProperty("url");
		return baseurl;
	}

}
