package com.demo.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasicTestcases {
	
//	@BeforeSuite
//	public void beforeSuite() {
//		System.out.println("Before Suite");
//	}
	
//	@BeforeClass
//	public void beforeClass() {
//		System.out.println("Before Class");
//	}
	
//	@BeforeMethod
//	public void before() {
//		System.out.println("Before Method");
//	}
//	
//	@AfterMethod
//	public void after() {
//		System.out.println("After Method");
//	}
//	
//	@AfterClass
//	public void afterClass() {
//		System.out.println("After Class");
//	}
//	
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("After Suite");
//	}
//	
	
	@Test(priority=1, description="This testcase will verify login functionality")
	public void loginApplication(){
		System.out.println("Login");
	}
	
	@Test(priority=2, description="This testcase will verify checkout functionality")
	public void checkout() {
		System.out.println("Checkout");
	}
	
	@Test(priority=-3, description="This testcase will verify logout functionality")
	public void logout(){
		System.out.println("Logout");
		Assert.assertEquals(12, 10);
	}
	
	
	
}
