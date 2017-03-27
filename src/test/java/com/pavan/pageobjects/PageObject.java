package com.pavan.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pavan.testbase.BaseClass;

public class PageObject {
	
	public PageObject(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
//	WebElement loginTxtField = driver.findElement(By.id("Email"));
//	WebElement NextBtn = driver.findElement(By.id("next"));
//	WebElement PasswordTxtField = driver.findElement(By.id("Passwd"));
//	WebElement SignInBtn = driver.findElement(By.id("signIn"));
	
	@FindBy(id = "Email")
	public WebElement loginTxtField;
	
	@FindBy(id = "next")
	public WebElement NextBtn;
	
	@FindBy(id = "Passwd")
	public WebElement PasswordTxtField;
	
	@FindBy(id = "signIn")
	public WebElement SignInBtn;
	
	
	
	public void login(){
		loginTxtField.sendKeys("pavangithub");
		System.out.println("Print element"+loginTxtField.toString());
		System.out.println("Printed");
		NextBtn.click();
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PasswordTxtField.sendKeys("githubuser");
		SignInBtn.click();
	}
	


}
