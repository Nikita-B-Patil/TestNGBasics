package com.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifyPageTitle(String browserName) {
		String title;
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikita Patil\\Desktop\\Webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikita Patil\\Desktop\\Webdrivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}else
			if(browserName.equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Nikita Patil\\Desktop\\Webdrivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
			}
			
			System.out.println("opening browser........");
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			title = driver.getTitle();
			System.out.println(""+title);
			
			driver.quit();
		
	}
	
}
