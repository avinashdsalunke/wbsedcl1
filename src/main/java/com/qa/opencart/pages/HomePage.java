package com.qa.opencart.pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	import com.qa.opencart.constants.Constant;
	import com.qa.opencart.utils.ElementUtil;

	import io.qameta.allure.Step;

	public class HomePage {

		private WebDriver driver;
		private ElementUtil eleUtil;
		
		private By keyword=By.linkText(" Fast, Efficient and Productive ");
		private By homepagelogo=By.xpath("//img[@alt=\"Logo\"]");
		private By slogan=By.cssSelector("WBSEDCL is innovating and embarking upon an IT-enabled system across the organisation ");
		private By signin=By.linkText("Sign In");
		private By registerlink=By.linkText("Click Here");
		private By footermenu=By.xpath("//a[@target=\"_blank\"]");
		
		public HomePage(WebDriver driver) {
			this.driver=driver;
			eleUtil=new ElementUtil(driver);
		}
		
		@Step(".....getting the homepage title........")
	public String gethomepageTitle() {
			String title=eleUtil.waitForTitleIsAndFetch(Constant.DEFAULT_SHORT_TIME_OUT, Constant.LOGIN_PAGE_TITLE_VALUE);
		return title;
			
		}
		
		@Step("......getting the HOMEPAGE URL.........")
		public String GetHomePageUrl() {
			String url=eleUtil.waitForURLContainsAndFetch(Constant.DEFAULT_MEDIUM_TIME_OUT, Constant.LOGIN_PAGE_URL_FRACTION_VALUE);
			
			return url;
			
		}
	}


