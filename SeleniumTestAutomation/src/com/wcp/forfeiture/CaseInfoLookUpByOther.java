package com.wcp.forfeiture;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.servicedesk.com.MainServiceDesk;

public class CaseInfoLookUpByOther extends MainServiceDesk{
	
	protected static WebDriver driver;
@Test
	public static void LookUpByOther()  throws Exception {
	
//	seleniumGrid(url);
//	regularFirefox(url);
	 regularChrome(wcpourl);
	 clickForfeiture();
	 caseLookUpByOther();
	 tearDown();
}
}
