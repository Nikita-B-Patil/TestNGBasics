package com.demo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependentMethods {

	@Test
	public void setup()
	{
		System.out.println("Setup");
		Assert.assertEquals(12, 10);
	}
	
	@Test(dependsOnMethods = "setup")
	public void login() 
	{
		System.out.println("Login");
	}
	
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		System.out.println("Logout");
	}
	
}
