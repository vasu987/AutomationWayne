package com.gis;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.servicedesk.com.MainServiceDesk;

public class CreateBaseMap extends MainServiceDesk{
	static String url="https://arcgisent.waynecounty.lan/portal/home/";
	protected static WebDriver driver;
@Test
	public static void CreateBaseMapTest()  throws Exception {

	 regularChrome(url);
	// argsSignIn();
	 CreateBaseMap();
	 tearDown();
}
}
