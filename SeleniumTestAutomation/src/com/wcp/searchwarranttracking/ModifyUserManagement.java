package com.wcp.searchwarranttracking;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.servicedesk.com.MainServiceDesk;

public class ModifyUserManagement extends MainServiceDesk{
	protected static WebDriver driver;
@Test
	public static void ModifyUserManagementScript()  throws Exception {
	
//	seleniumGrid(url);
	//verifyUrlfirefox1();
	 regularChrome(wcpourl);
	// clickForfeiture();
	 launchUserManagement();
	 modifyUserManagementTabs();
	 tearDown();
}
}
