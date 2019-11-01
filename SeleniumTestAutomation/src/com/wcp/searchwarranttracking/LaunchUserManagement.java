package com.wcp.searchwarranttracking;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.servicedesk.com.MainServiceDesk;

public class LaunchUserManagement extends MainServiceDesk{
	protected static WebDriver driver;
@Test
	public static void LookUpUserManagement()  throws Exception {
	
//	seleniumGrid(url);
	//verifyUrlfirefox1();
	 regularChrome(wcpourl);
	// clickForfeiture();
	 launchUserManagement();
	 validateUserManagementTabs();
	 tearDown();
}
}
