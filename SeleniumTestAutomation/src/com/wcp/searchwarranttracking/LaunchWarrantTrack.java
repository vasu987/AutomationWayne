package com.wcp.searchwarranttracking;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.servicedesk.com.MainServiceDesk;

public class LaunchWarrantTrack extends MainServiceDesk{
	static String url="http://dev-intapp-win1/wcpoApps/";
	protected static WebDriver driver;
@Test
	public static void LookUpByCaseInfo()  throws Exception {
	
//	seleniumGrid(url);
	//verifyUrlfirefox1();
	 regularChrome(url);
	// clickForfeiture();
	 launchSearchWarrantTracking();
	 validateWarrantTrackingScreen();
	 tearDown();
}
}
