package com.gis;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.servicedesk.com.MainServiceDesk;

public class GISBasicValidation extends MainServiceDesk{
	static String url="https://arcgisent.waynecounty.lan/portal/home/";
	protected static WebDriver driver;
@Test
	public static void GISBasicValidationTest()  throws Exception {

	 regularChrome(url);
	// argsSignIn();
	 argsBasicLinkValidation();
	 tearDown();
}
}
