package com.wcp.forfeiture;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.servicedesk.com.MainServiceDesk;

public class CaseInfoLookUpByDistrictCourtCaseNo extends MainServiceDesk{

	protected static WebDriver driver;
@Test
	public static void LookUpByDistrictCourtCaseNo()  throws Exception {
	
//	seleniumGrid(url);
	//verifyUrlfirefox1();
	regularChrome(wcpourl);
	 clickForfeiture();
	 caseLookUpByDistrictCourtCaseNo();
	 tearDown();
}
}
