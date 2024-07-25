package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class AccountsPage1 {
	private WebDriver driver;
	private ElementUtil eleUtil;

	public AccountsPage1(WebDriver driver)
	{
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
	

}
