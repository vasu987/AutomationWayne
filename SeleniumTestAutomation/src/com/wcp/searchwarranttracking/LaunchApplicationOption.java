package com.wcp.searchwarranttracking;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.servicedesk.com.MainServiceDesk;

public class LaunchApplicationOption extends MainServiceDesk{
	protected static WebDriver driver;
@Test
	public static void LookUpByApplicationOption()  throws Exception {
	
//	seleniumGrid(url);
	//verifyUrlfirefox1();
	 regularChrome(wcpourl);
	 launchApplicationOptions();
	 tearDown();
}
}
