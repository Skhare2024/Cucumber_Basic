package com.test;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	WebDriver driver;
		
	@Before
	public void setup() {
		TestBase.initializeBrowser("Edge");
		//TestBase.initializeBrowser("Chrome");
		driver=TestBase.getDriver();
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}

}
