package com.pavan.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pavan.testbase.BaseClass;
import com.pavan.testbase.BaseSuite;
import com.pavan.pageobjects.PageObject;

public class Test_Login extends BaseSuite{
	
	WebDriver driver = BaseClass.driver;

	
	@Test
	public void test1(){
		//driver.findElement(By.id("Email")).sendKeys("Test");
		PageObject po = new PageObject();
		System.out.println("In Test");
		po.login();
		System.out.println("After Login");		
	}
}