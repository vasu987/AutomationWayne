
package com.wcblast;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.servicedesk.com.MainServiceDesk;

public class WCBlastListManagerAddNewEmail extends MainServiceDesk {
	protected static WebDriver driver;
@Test
	public static void BlastBasicFlow() throws Exception {
	
//	seleniumGrid(url);
//
	regularChrome(blasturl);
	validatingDepartmentCenter();
	clickListManager();
	validateListManagerCount();
	addNewMailingList();
	BlastAddEmail();
//	BlastEmailUpdateDirect();
    tearDown();
    
}
}



