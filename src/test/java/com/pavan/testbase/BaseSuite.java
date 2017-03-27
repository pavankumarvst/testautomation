package com.pavan.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pavan.testbase.BaseClass;

public class BaseSuite {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Running base suite");
		BaseClass bc = new BaseClass();
		bc.startBrowser();
		
	}
	
	@AfterMethod
	public void tearDown(){
		System.out.println(" Quitting the Driver");
		BaseClass.driver.close();
	}

}
