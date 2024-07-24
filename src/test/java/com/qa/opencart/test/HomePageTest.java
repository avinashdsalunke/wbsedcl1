package com.qa.opencart.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("EPIC - 100: design login for open cart app")
@Story("US-Login: 101: design login page features for open cart")
public class HomePageTest extends BaseTest {
	
	@Severity(SeverityLevel.TRIVIAL)
	@Description("....checking the title of the page.... tester: avinash")
	@Test(priority=1)
	public void homepageTitletest() {
		String actual_title=homepage.gethomepageTitle();
		Assert.assertEquals(actual_title,"WBSEDCL");
	}
	
	
	@Severity(SeverityLevel.NORMAL)
	@Description("....checking the url of the page.... tester: avinash")
	@Test(priority=2)
	public void homePageUrlTest()
	{
		System.out.println("url");
		String URL=homepage.GetHomePageUrl();
		System.out.println(URL);
	Assert.assertTrue(URL.contains("4202"));	
	}
	

}