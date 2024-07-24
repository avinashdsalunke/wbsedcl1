package com.qa.opencart.base;

import java.util.Properties;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.HomePage;

public class BaseTest {

	DriverFactory df;
	WebDriver driver;
	protected Properties prop;
	protected HomePage homepage;
	protected SoftAssert softAssert;
	
	@BeforeTest
	public void setup()
	{
		df=new DriverFactory();
		prop=df.initProp();
		driver=df.initDriver(prop);
		homepage=new HomePage(driver);
		softAssert =new SoftAssert();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
