package com.test;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class TestBase{

	static WebDriver driver=null;
	
	public  static void initializeBrowser(String browser) {
		
		if(browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS); is deprecated
		}
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS); is deprecated
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
