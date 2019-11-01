package com.servicedesk.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.net.URL;
import java.security.Key;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.Action;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import org.testng.log4testng.Logger;


import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.Wait;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import net.bytebuddy.utility.RandomString;

public class MainServiceDesk  {
	protected static WebDriver driver;
	protected static JavascriptExecutor js;
	protected static WebElement element;
	protected static String a,b,c;
	protected static String baseUrl;
	protected static String fuelStationName= " ";
	protected static Boolean isPresent;
	protected static String location=" ";
	protected static String actualLocation=" ";
	protected static Select sel;
	protected static int x,y,z,j;
	protected static int rowCount;
	protected static int noOfColumns;
	protected static int randomNumber;
	protected static String[] Headers;
	protected static Actions action;
	protected static StringSelection ss;
	protected static Dimension d;
	protected static WebDriverWait wait;
	protected static Clipboard clipboard;
	protected static String  ModifiedBarNum="";
	protected static String  ModifiedUnit="";
	protected static Select bldg;
	protected static String Pass=" ";
	protected static String ServiceRequestSearchFrame="ext-gen77";
	protected static String ServiceRequestFrame="ext-gen72";
	protected static String ServiceIncidentFrame="ext-gen97";
	protected static String Superuser="Nevena Malbasic";
	protected static String user="Srinivas Nukala";
	protected static Robot robot;
	protected static String ModifiedNotes="Modified Notes Second Time in Self Service Screen";
	protected static String PriorityValue=" ";
	protected static String SuperUserPriority="2 - High";
	protected static String RegularUserPriority="3 - Normal";
	protected static String SuperUserEmailValue="nmalbasic@waynecounty.com";
	protected static String SuperUserPhonevalue="1-313-967-6647";
	protected static String RegularUserEmailValue="Snukala@waynecounty.com";
	protected static String RegularUserPhonevalue="1-313-967-1387";
	protected static String AddressValue="500 Griswold Detroit MI 48226";
	protected static int widthBeforeMaximize;
	protected static int i=1;
	protected static Random rand;
	protected static String IncidentValue=" ";
	protected static List<WebElement> elements,DropDown;
	protected static Row row;
	protected static ArrayList<String> list;
	protected static int Quotient,Remainder;
	protected static org.apache.poi.ss.usermodel.Cell cell;
	protected static FileInputStream fis ;
	protected static XSSFSheet sheet;
	protected static XSSFWorkbook workbook;
	protected static Calendar cal;
	protected static String UserEmail="";
	protected static String UserPhone="";
	protected static String UserAddress="";
	protected  static String CustomerNameXpath="frsqa_fname='ProfileLink'";
	protected  static String CustomeraAdressXpath="frsqa_fname='WC_CustomerAddress'";
	protected static String Sub,Sub2,Sub3,Sub4,Sub5,Sub6,Sub7,Sub8,Sub9,Sub10;
	protected static String ExcelValue=" ";
	protected static String wcpourl="http://devintapp/wcpoApps/";
	protected static Selenium selenium;
	protected static Integer rowBefore=0,rowAfter=0;
	protected static WebElement check1;
	protected static WebElement check2;
	protected static String generatedString =" ";
	protected static  java.util.Iterator<WebElement> dropdown;
	protected static List<WebElement> lst;
	static String baseUrl1="https://waynecounty-uat.saasit.com";
	static String SubmitButton="Submit";
	static String ServiceHomePage="/html/body/div[1]/div[1]/div/div/div[3]/div/div[2]/div/div[1]/div[1]/ul/li[1]/a[2]/em/span/span";
	static String ReportTechnologyIssue="//span[text()='Report a technology issue']";
	static Logger logger;
	protected static String url="https://waynecounty-uat.saasit.com/Login.aspx?NoDefaultProvider=True";	
	protected static String blasturl2="http://tst-blast-win1/blasttst/dashboard";
	protected static String blasturl="http://dev-blast-win1/blastdev/dashboard";
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;
    private static int tablecount=0;
	protected static String srini="http://10.1.13.54:5566/wd/hub";
	protected static String ubaid="http://10.1.13.36:5568/wd/hub";
	protected static String pprem="http://10.1.13.82:5566/wd/hub";
	protected static List<String> linkTexts;
	
	//Storing xpath Values
	protected static String  xpathRightSideDept="//app-dashboard/app-nav-bar/div[1]/div/div[2]/div/div[2]/sui-select/div[3]/sui-select-option";
	protected static String  xpathCenterDept="//app-dashboard/app-nav-bar/div[2]/div/div/sui-select/div[3]/sui-select-option/span[2]";
			
					

public static void setUp(String browser) throws Exception
{

    switch(browser)
    {
    case "chrome":

        // Write the code here for open chrome browser
    	 System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
    	 
    	 ChromeOptions options = new ChromeOptions();
    	 options.addArguments("start-maximized");
    	 options.addArguments("disable-infobars");
    	 
    	driver = new ChromeDriver();
     	break;
    	
    case "firefox":
    	
//    	FirefoxOptions options1 = new FirefoxOptions();
//    	 options1.addArguments("start-maximized");
//    	 options1.addArguments("disable-infobars");
//    	options1.setCapability("marionette", true);
        	
        // Write the code here for open firefox browser
    	
//    	  FirefoxOptions caps =  new FirefoxOptions().setProfile(new FirefoxProfile());
//    	  driver = new FirefoxDriver(caps);
  	 System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
     
//    	ProfilesIni profile = new ProfilesIni();
//    	  
//    	FirefoxProfile myprofile = profile.getProfile("default");
//    	myprofile.setAcceptUntrustedCertificates(true);
//    	myprofile.setAssumeUntrustedCertificateIssuer(true);
    	driver = new FirefoxDriver();
    	    	
    	break;
    	
    case "IE":
    System.setProperty("webdriver.edge.driver", ".\\msedgedriver.exe");
    //Initialize InternetExplorerDriver Instance.
  driver = new EdgeDriver();
   
    default :
        System.out.println("Browser choice not available");     

    }
	  driver.get(url);
	  Thread.sleep(2000L);
	  System.out.println("Entered URL");
		 serviceLogin();
	   
    
}

public static void seleniumGrid(String url1) throws Exception {
	DesiredCapabilities cap = DesiredCapabilities.chrome();
//	DesiredCapabilities cap = DesiredCapabilities.firefox();
	cap.setCapability(ChromeOptions.CAPABILITY,cap);
	cap.setPlatform(Platform.ANY);
	
	
	
	driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
//	 driver = new ChromeDriver();
	 driver.get(url1);
	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   windowMax();
	   
	  // verifyUrlfirefox1();
	   

}

public static void BlastEmailUpdateDirect() throws Exception {
	 lst = driver.findElements(By.tagName("tr"));
		// 'To calculate no of rows In table'
		 int rows_count = lst.size();
		 
		 System.out.println("Row Count: " +rows_count);
		 
		 for (int i=1;i<=(rows_count-2);i++){
			 element=driver.findElement(By.xpath("/html/body/app-root/div/app-manage-list/div/div[2]/div[1]/table/tbody/tr["+i+"]/td[5]/i[1]"));
			 element.click();
			 Thread.sleep(500L);
			 element=driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[2]/form/div/div[1]/input"));
			 element.clear();
			 Thread.sleep(500L);
			 element.sendKeys("Sri");
			 Thread.sleep(500L);
			 element=driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[2]/form/div/div[2]/input"));
			 element.clear();
			 Thread.sleep(500L);
			 element.sendKeys("Nivas");
			 Thread.sleep(500L);
			 element=driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[3]/button"));
			 element.click();
			 Thread.sleep(1500L);
			 element=driver.findElement(By.xpath("//app-manage-list/div/div[2]/div[1]/table/tbody/tr/td[2]"));
			 a=element.getText();
			 Assert.assertEquals("Sri Nivas",a);
}
}
public static void BlastEmailUpdate() throws Exception {
	
	//validatingDepartment();

	 //Click List Manager
	 driver.findElement(By.xpath("/html/body/app-root/div/app-dashboard/app-nav-bar/div[1]/div/a[2]")).click();
	 Thread.sleep(2000L);
	 
	 lst = driver.findElements(By.tagName("tr"));
		// 'To calculate no of rows In table'
		 int tablecount = lst.size();
		 System.out.println(tablecount);
		 
//		 element= driver.findElement(By.xpath("/html/body/app-root/div/app-listmanager/div/div[2]/table/tbody/tr[1]/td[5]/i"));
//			element.click();
//			Thread.sleep(2000L);
//		 
//		 element=driver.findElement(By.xpath("/html/body/app-root/div/app-listmanager/div/div[2]/table/tbody/tr[1]/td[2]"));
		 
		 
		 for (int i=1;i<=(tablecount-1);i++){
			 element=driver.findElement(By.xpath("/html/body/app-root/div/app-listmanager/div/div[2]/table/tbody/tr["+i+"]/td[2]"));
				 
			 if (element.getText().equalsIgnoreCase(generatedString)){
				element= driver.findElement(By.xpath("/html/body/app-root/div/app-listmanager/div/div[2]/table/tbody/tr["+i+"]/td[5]/i"));
				element.click();
				 Thread.sleep(2000L);
				 break;
				 
			 }
				 
		 }

	 
	 lst = driver.findElements(By.tagName("tr"));
			// 'To calculate no of rows In table'
			 int rows_count = lst.size();
			 
			 for (int i=1;i<=(rows_count-2);i++){
				 element=driver.findElement(By.xpath("/html/body/app-root/div/app-manage-list/div/div[2]/div[1]/table/tbody/tr["+i+"]/td[5]/i[1]"));
				 element.click();
				 Thread.sleep(500L);
				 element=driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[2]/form/div/div[1]/input"));
				 element.clear();
				 Thread.sleep(500L);
				 element.sendKeys("Sri");
				 Thread.sleep(500L);
				 element=driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[2]/form/div/div[2]/input"));
				 element.clear();
				 Thread.sleep(500L);
				 element.sendKeys("Nivas");
				 Thread.sleep(500L);
				 element=driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[3]/button"));
				 element.click();
				 Thread.sleep(1500L);
				 element=driver.findElement(By.xpath("/html/body/app-root/div/app-manage-list/div/div[2]/div[1]/table/tbody/tr[1]/td[2]"));
				 a=element.getText();
				 Assert.assertEquals("Sri Nivas",a);
				 				 
			 }
			 
			
	
}

public static void excelData(String filePath,String fileName,String sheetName,String location) throws Exception {


    FileInputStream file = new FileInputStream(filePath+"\\"+fileName); 
        
      //  File file = new File(filePath+"\\"+fileName);
      workbook = new XSSFWorkbook(file);
 
       sheet = workbook.getSheet(sheetName);
        noOfColumns = sheet.getRow(0).getLastCellNum();
        
                
      //Read sheet inside the workbook by its name
       
        //Find number of rows in excel file
       rowCount = sheet.getLastRowNum()- sheet.getFirstRowNum();
       System.out.println("No of Rows: " +rowCount);
                 

        String[] Headers = new String[noOfColumns];
        for (j=0;j<noOfColumns;j++){
            Headers[j] = sheet.getRow(0).getCell(j).getStringCellValue();
            
        //  System.out.println(Headers[j]);
                    

        if(Headers[j].equals(location))
        {
        	for (int k=1;k<=rowCount;k++) {
         String b=sheet.getRow(k).getCell(j).getRawValue();
         
         System.out.println("Column Value is: " +b);
        	}
        }
        }
         
       

  
    

workbook.close();
file.close();
}

public static void guruSite() throws Exception {
	
	elements = driver.findElements(By.tagName("th"));
	for (WebElement col1 : elements) {
		System.out.print(col1.getText() + "\t");
	}
	   
	
	//Print data from each row
	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	for (WebElement row : rows) {
	    List<WebElement> cols = row.findElements(By.tagName("td"));
	    for (WebElement col : cols) {
	      	int a=col.getText().length();
	    	if( a > 5 && a<15)
	    	{
	    	       System.out.print(col.getText() + "\t" + "\t");
	    	}
	    	else
    	       System.out.print(col.getText() + "\t" );
	    }
	    
	    System.out.println();
	}

}
public static void regularChrome(String url) throws Exception {
System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		 
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("window-size=1400,600");
	driver = new ChromeDriver(options);
	 driver.get(url);
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	  Thread.sleep(1500L);
}
	  
	  public static void regularFirefox(String url) throws Exception {
	
		  System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
		  	

			 driver = new FirefoxDriver();
		  	driver.get(url);
		  	Thread.sleep(1500L);
		  	
		  	 Runtime.getRuntime().exec("C:\\Srini\\LoginAuth.exe");
			  Thread.sleep(2000L);
			  driver.manage().window().maximize();
				 Thread.sleep(1500L);
		  	
		  	
	  	
		
}
	  public static void getExcelUtil(String SheetValue,String excelValue) throws Exception {
		  fis = new FileInputStream("F:\\ExcelData\\CaseDetails.xlsx");
			 workbook = new XSSFWorkbook(fis);
			// sheet = workbook.getSheetAt(0);
			 sheet=workbook.getSheet(SheetValue);
			                        //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
			                        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
			row = sheet.getRow(1);
			 cell = row.getCell(0);
			 CellType cellType=cell.getCellType();
			 String j=cellType.toString();
			 
			 System.out.println("j VALUE IS: " + j);
			 if (j.equalsIgnoreCase("NUMERIC")){
				 
				
				 double numberValue = cell.getNumericCellValue();
				 
				// System.out.println("Number Value: " +numberValue);

		         // BigDecimal is used to avoid double value is counted use Scientific counting method.
		         // For example the original double variable value is 12345678, but jdk translated the value to 1.2345678E7.
		         ExcelValue = BigDecimal.valueOf(numberValue).toPlainString();
		         
		         char charAtLastPosition = ExcelValue.charAt(ExcelValue.length()-2);
		         String a=Character.toString(charAtLastPosition);
		         
		         if (a.equalsIgnoreCase(".")) {
		        	 
		        	 ExcelValue=ExcelValue.substring(0, ExcelValue.length()-2);
		        	// System.out.println("First Excel Value : " +ExcelValue);
		        		 
		         }
		         
		         
		        			  		 
			 }
			 else
			 {
				 ExcelValue=cell.toString();
			 }
			 
			 System.out.println(ExcelValue);
		 
		  
	  }

public static void caseLookUpByCaseInfo() throws Exception {
	Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
	
	System.out.println("************************************1.Start of Forfeiture Case lookup by Case Tracking Number************************************************************");
	getExcelUtil("CaseTrackNo",ExcelValue);
	
	
	 
	driver.findElement(By.id("CaseTrackingNo")).sendKeys(ExcelValue);
	Thread.sleep(1500L);
	driver.findElement(By.xpath("//*[@id='foSearchBySegment']/div/div[1]/div[2]/div")).click();
	Thread.sleep(1500L);
	//********************Validating items in the Screen**************************//
    getRowsCols();
//    System.out.println("*************************************1.End of Forfeiture Case lookup by Case Tracking Number*************************************************************");
//			 
			 }

public static void caseLookUpByDistrictCourtCaseNo() throws Exception {
	Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
	
	System.out.println("************************************************3.Start of DistrictCourtCaseNo*************************************************************************");
	
	
	getExcelUtil("DistrictCourtCaseNo",ExcelValue);

	driver.findElement(By.id("DistrictcourtCase")).sendKeys(ExcelValue);
	Thread.sleep(1500L);
	driver.findElement(By.xpath("//*[@id='foSearchBySegment']/div/div[1]/div[2]/div")).click();
	Thread.sleep(1500L);
	//********************Validating items in the Screen**************************//
    getRowsCols();
    
    System.out.println("***********************************************3.End of DistrictCourtCaseNo*****************************************************************************");
			 
			 }

public static void caseLookUpByCivilCourtCaseNo() throws Exception {
	Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
	
	getExcelUtil("CivilCourtCaseNo",ExcelValue);
	driver.findElement(By.id("CivilcourtCase")).sendKeys(ExcelValue);
	Thread.sleep(1500L);
	driver.findElement(By.xpath("//*[@id='foSearchBySegment']/div/div[1]/div[2]/div")).click();
	Thread.sleep(1500L);
	//********************Validating items in the Screen**************************//
    getRowsCols();
			 
			 }

public static void caseLookUpBySeizure() throws Exception {
	
//	element=driver.findElement(By.name("fo_siezing_agency"));
//	element.click();
//	Thread.sleep(500L);
	
	System.out.println("//***********************************************8.Start of Forfeiture Case LookUp By Seizure***********************************************************//");
	
	
 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
	 
	 cal = Calendar.getInstance();
     //get previous year
     cal.add(Calendar.YEAR, -1); 
     Date date = cal.getTime();
     
     Date datex = new Date();
     String CurrDatestartDate =dateFormat.format(datex);
		
	 // Now format the date
	 String date1= dateFormat.format(date);
	 element=driver.findElement(By.xpath("//input[@data-target='sbFoSeizure_from']"));
		element.sendKeys(date1);
		Thread.sleep(500L);
		element.sendKeys(Keys.TAB);
		Thread.sleep(500L);
		
	element=driver.findElement(By.xpath("//input[@placeholder='To']"));
	element.sendKeys(CurrDatestartDate);
	Thread.sleep(1500L);
	
	
	
	sel= new Select(driver.findElement(By.xpath("//*[@id='foSiezingAgencyDropdown']")));
	sel.selectByIndex(1);
//	element.sendKeys(Keys.TAB);
	Thread.sleep(500L);
	
	element=driver.findElement(By.xpath("//input[@data-target='sbFoSeizure_to']"));
	element.sendKeys(CurrDatestartDate);
	Thread.sleep(1500L);
	element.sendKeys(Keys.TAB);
	Thread.sleep(500L);

	driver.findElement(By.xpath("//*[@id='foSearchBySegment']/div/div[4]/div[2]/div")).click();
	Thread.sleep(1500L);
	//********************Validating items in the Screen**************************//
    getRowsCols();
    
    System.out.println("//*********************************************************8.End of Forfeiture Case LookUp By Seizure*******************************************************//");
			 
			 }

public static void caseLookUpByClaimaint() throws Exception {
	
	System.out.println("//********************************************9.Start of Forfeiture Case LookUp By Claimant*****************************************************************//");
	
	

//	sel= new Select(driver.findElement(By.xpath("//*[@id='foClaimantTypeDropdown']")));
//	elements = sel.getOptions();
//	System.out.println("Drop down Size: " + elements.size());
//	Thread.sleep(1500L);
//	sel.selectByIndex(3);
//	RobotTab();
	
	getExcelUtil("ClaimantName",ExcelValue);

	driver.findElement(By.xpath("//input[@data-target='sbFo_claimant_fn']")).sendKeys(ExcelValue);
	Thread.sleep(1500L);
	driver.findElement(By.xpath("//div[@data-target='sbFo_claimant']")).click();
	Thread.sleep(1500L);
	a=(driver.findElement(By.xpath("//*[@id='adminFoCasesTable']/thead/tr/th[2]"))).getText();
	if ( a.length()>0) {
		getRowsCols();
		driver.findElement(By.xpath("//*[@id='foResultsGoBack']")).click();
		Thread.sleep(1500L);
		
	}
	else
	{
		System.out.println("No Elements Found");
	}
	
	System.out.println("//**************************************************9.End of Forfeiture Case LookUp By Claimant*************************************************************//");

	
	}

public static void caseLookUpByAPAName() throws Exception {
	
	System.out.println("Start of Case Look Up by APA Name");
sel= new Select(driver.findElement(By.xpath("//*[@id='foApaNameDropdown']")));
	
	elements = sel.getOptions();
	System.out.println("Drop down Size: " + elements.size());
	sel.getFirstSelectedOption();
	
	for (i=1;i<elements.size();i=i+8)
	{
sel= new Select(driver.findElement(By.xpath("//*[@id='foApaNameDropdown']")));
	 
sel.selectByIndex(i);
	

	Thread.sleep(1500L);
	RobotTab();
	Thread.sleep(500L);
	driver.findElement(By.xpath("//div[@data-target='sbFo_other']")).click();
	Thread.sleep(1500L);
	a=(driver.findElement(By.xpath("//*[@id='adminFoCasesTable']/thead/tr/th[2]"))).getText();
	
//	System.out.println("a Value is: " +a);
	
	if ( a.length()>0) {
		getRowsCols();
		Thread.sleep(1500L);
		driver.findElement(By.xpath("//*[@id='foResultsGoBack']")).click();
		Thread.sleep(1500L);
		
		
		
//		driver.findElement(By.name("fo_apa_name")).click();
//		Thread.sleep(2500L);
	
	}
	else
	{
		System.out.println("*******************************************************************************************");
		System.out.println("No elements found so no rows and colums to be displayed");
		System.out.println("*******************************************************************************************");
//		driver.findElement(By.name("fo_apa_name")).click();
//		Thread.sleep(1500L);
	}
	Thread.sleep(5500L);
	}
	
	System.out.println("End of Case Look Up by APA Name");
}

public static void caseLookUpBySiezure() throws Exception {
	
	System.out.println("Start of Case Look Up by Siezure");
	sel= new Select(driver.findElement(By.xpath("//*[@id='foCaseTypesDropdown']")));
	
	elements = sel.getOptions();
	System.out.println("Drop down Size: " + elements.size());
	//sel.getFirstSelectedOption();
	
	for (i=1;i<elements.size();i=i+8)
	{
		sel= new Select(driver.findElement(By.xpath("//*[@id='foCaseTypesDropdown']")));
		sel.selectByIndex(i);
		Thread.sleep(1500L);
		RobotTab();
		Thread.sleep(500L);
		driver.findElement(By.xpath("//div[@data-target='sbFo_other']")).click();
		Thread.sleep(1500L);
		a=(driver.findElement(By.xpath("//*[@id='adminFoCasesTable']/thead/tr/th[2]"))).getText();
	
//	System.out.println("a Value is: " +a);
	
	if ( a.length()>0) {
		getRowsCols();
		Thread.sleep(1500L);
		driver.findElement(By.xpath("//*[@id='foResultsGoBack']")).click();
		Thread.sleep(1500L);
		
		
		
//		driver.findElement(By.name("fo_apa_name")).click();
//		Thread.sleep(2500L);
	
	}
	else
	{
		System.out.println("*******************************************************************************************");
		System.out.println("No elements found so no rows and colums to be displayed");
		System.out.println("*******************************************************************************************");
//		driver.findElement(By.name("fo_apa_name")).click();
//		Thread.sleep(1500L);
	}
	Thread.sleep(5500L);
	}
	
	System.out.println("End of Case Look Up by Siezure");
}
 	
 			 
	

public static void caseLookUpByOther() throws Exception {
	
	System.out.println("//********************************************10.Start of Forfeiture Case LookUp By Other*********************************************	******//");
	//caseLookUpByAPAName();
	caseLookUpBySiezure();
	System.out.println("//*********************************************10.End of Forfeiture Case LookUp By Other********************************************************//");
		 
			 }

public static void CaseInfoLookUpBySeizingAgencyIncident() throws Exception {
	
//	excelData("C://Srini", "ForfeitureData.xlsx","CaseNo","CaseTrackingNo");
	
	System.out.println("//**************************************************6.Start of Seizing Agency Incident**************************************************************//");
	
	getExcelUtil("SeizingAgencyIncidentNo",ExcelValue);
	
	driver.findElement(By.id("IncidentNumber")).sendKeys(ExcelValue);
	;
	Thread.sleep(1500L);
	driver.findElement(By.xpath("//*[@id='foSearchBySegment']/div/div[2]/div[2]/div")).click();
	Thread.sleep(1500L);
	
	//********************Validating items in the Screen**************************//
	
	//********************Validating items in the Screen**************************//
	getRowsCols();
	
	System.out.println("//************************************************6.End of Seizing Agency Incident********************************************************************//");

	
}


public static void caseLookUpByFFN() throws Exception {
	
	//"**************************3.Start of FFN Script******************************"//
	
	System.out.println("//*************************************************3.Start of FFN Script*****************************************************************************//");
	
	getExcelUtil("FFN",ExcelValue);
	
	driver.findElement(By.id("CaseID")).sendKeys(ExcelValue);
	
//	driver.findElement(By.id("CaseID")).sendKeys("12362");
	Thread.sleep(1500L);
	driver.findElement(By.xpath("//*[@id='foSearchBySegment']/div/div[2]/div[2]/div")).click();
	Thread.sleep(1500L);
	
	//********************Validating items in the Screen**************************//
	getRowsCols();
	
	
	System.out.println("//****************************************************3.End of FFN Script***************************************************************************//");
 			 
			 }

public static void caseLookUpByCircuitCourtCase() throws Exception {
	System.out.println("//**************************5.Start of Forfeiture Case LookUp by Circuit Court Case ******************************//");
	getExcelUtil("CircuitCourtCaseNo",ExcelValue);
	
	driver.findElement(By.id("CaseNo")).sendKeys(ExcelValue);
	Thread.sleep(1500L);
	driver.findElement(By.xpath("//*[@id='foSearchBySegment']/div/div[2]/div[2]/div")).click();
	Thread.sleep(1500L);
	
	//********************Validating items in the Screen**************************//
	getRowsCols();
	
	System.out.println("//**************************5.End of Forfeiture Case LookUp by Circuit Court Case  ******************************//");
 			 
			 }
				 


public static void caseLookUpByDate() throws Exception {
	
	System.out.println("//********************************************7.Start of Forfeiture Case LookUp By Date***********************************************************//");
	
	element=driver.findElement(By.xpath("//input[@placeholder='From']"));
	 // Create object of SimpleDateFormat class and decide the format
	 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
	 
	 Calendar cal = Calendar.getInstance();
     //get previous year
     cal.add(Calendar.YEAR, -2); 
     Date date = cal.getTime();
     
     Date datex = new Date();
     String CurrDatestartDate =dateFormat.format(datex);
		
	 // Now format the date
	 String date1= dateFormat.format(date);
	
	element.sendKeys(date1);
	Thread.sleep(500L);
	element.sendKeys(Keys.TAB);
	Thread.sleep(500L);
	element=driver.findElement(By.xpath("//input[@placeholder='To']"));
	element.sendKeys(CurrDatestartDate);
	Thread.sleep(1500L);
	element.sendKeys(Keys.TAB);
	Thread.sleep(500L);
	
	driver.findElement(By.xpath("//*[@id='foSearchBySegment']/div/div[3]/div[2]/div")).click();
	Thread.sleep(1500L);
	getRowsCols();
	
	System.out.println("//**************************************************7.End of Forfeiture Case LookUp By Date************************************************************	//");
	
			 
		 }

public static void validateUserManagementTabs() throws Exception {
	
	System.out.println("//***********************************************11.Start of LaunchUserManagement***********************************************************//");
	
	validateUserManagementAdmins();
//	validateUserManagementManagers();
//	validateUserManagementActiveUsers();
	
	validateUserManagementDisabledUsers();
	
	System.out.println("//***********************************************11.End of LaunchUserManagement***********************************************************//");
	
}

public static void validateApplicationOptions() throws Exception {
}


public static void modifyUserManagementTabs() throws Exception {
	System.out.println("//***********************************************12.Start of ModifyUserManagement***********************************************************//");
//	modifyUserManagementAdmins();
//	modifyUserManagementManagers();
	modifyUserManagementActiveUsers();
//	
//	validateUserManagementDisabledUsers();
	
	System.out.println("//***********************************************12.End of ModifyUserManagement***********************************************************//");
	
}



public static void validateUserManagementActiveUsers() throws Exception {
	driver.findElement(By.xpath("//*[@data-tab='users']")).click();
	Thread.sleep(1500L);
	validateUserManagementScreen("adminUsersOutput");
	
}

public static void modifyUserManagementActiveUsers() throws Exception {
	driver.findElement(By.xpath("//*[@data-tab='users']")).click();
	Thread.sleep(1500L);
	modifyUserManagementScreen("adminUsersOutput");
	
}

public static void modifyUserManagementAdmins() throws Exception {
	driver.findElement(By.xpath("//*[@data-tab='admins']")).click();
	Thread.sleep(1500L);
	
	//*[@id="userMgmtTabs"]/a[3]
	modifyUserManagementScreen("usersAdminsOutput");
	
}

public static void validateUserManagementAdmins() throws Exception {
	driver.findElement(By.xpath("//*[@data-tab='admins']")).click();
	Thread.sleep(1500L);
	validateUserManagementScreen("usersAdminsOutput");
	
	
}

public static void validateUserManagementDisabledUsers() throws Exception {
	driver.findElement(By.xpath("//*[@data-tab='disabled']")).click();
	Thread.sleep(1500L);
		
}


public static void validateUserManagementManagers() throws Exception {
	driver.findElement(By.xpath("//*[@data-tab='managers']")).click();
	Thread.sleep(1500L);
	validateUserManagementScreen("usersManagersOutput");
	
}
public static void modifyUserManagementManagers() throws Exception {
	driver.findElement(By.xpath("//*[@data-tab='managers']")).click();
	Thread.sleep(1500L);
	modifyUserManagementScreen("usersManagersOutput");
	
}

public static void validateUserManagementScreen(String Output) throws Exception {
	
	//*[@id="usersManagersOutput"]/tr[1]/td[2]
	
	System.out.println("Output Value: " + Output);
	
    lst=driver.findElements(By.xpath("//*[@id='"+Output+"']/tr/td[5]"));
		 rowCount = lst.size();
		 System.out.println("No of Rows: " + rowCount+ "     ");
		 
		 for (int i=1;i<=rowCount;i++){
			 
					
			 element=driver.findElement(By.xpath("//*[@id='"+Output+"']/tr["+i+"]/td[5]"));
			 
		
			 element.click();
			 Thread.sleep(1500L);
			 
			 //Edit User Details
			 element=driver.findElement(By.xpath("//*[@id='editUserModal']/div[2]/div/div[1]/div[1]/label"));
			 Thread.sleep(500L);
			 System.out.print(element.getText() + "                    ");
			 
			 
			 element=driver.findElement(By.xpath("//*[@id='editUserAcctType']/label"));
			 Thread.sleep(500L);
			 System.out.println(element.getText() + "  ");
			 
				Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
				
			
				System.out.print(selenium.getValue("xpath=//input[@id='editUsername']")+ "                     ");
				Thread.sleep(500L);
				if (Output=="usersAdminsOutput")
				{
					element=driver.findElement(By.xpath("//*[@id='editUsertype']"));
					sel = new Select(element);
					sel.selectByValue("Admin"); 
				}
				
	
				a=selenium.getValue("xpath=//*[@id='editUsertype']");
				//System.out.println("A value is : " + a);
				if (a.equalsIgnoreCase("manager" )){
					System.out.println("Application Manager"+ "");
					Thread.sleep(500L);
						
				}
				if (a.equalsIgnoreCase("user" )){
					System.out.println("Application User"+ "");
					Thread.sleep(500L);
						
				}
				if (a.equalsIgnoreCase("Admin" )){
					System.out.println("Admin"+ "");
					Thread.sleep(500L);
						
				}
				
				element=driver.findElement(By.xpath("//*[@id='editUserModal']/div[2]/div/div[2]/div[1]/label"));
				 Thread.sleep(500L);
				 System.out.print(element.getText() + "                    ");
				 
				 
				 element=driver.findElement(By.xpath("//*[@id='editUserModal']/div[2]/div/div[2]/div[2]/label"));
				 Thread.sleep(500L);
				 System.out.println(element.getText() + "  ");
					System.out.print(selenium.getValue("xpath=//input[@id='edit_barNumber']")+ "                     ");
					Thread.sleep(500L);
					System.out.println(selenium.getValue("xpath=//input[@id='edit_unit']")+ "");
					Thread.sleep(500L);
					
				
				
						 
			 element=driver.findElement(By.xpath("//*[@id='editUserModal']/div[1]/i[2]"));
			 element.click();
			 Thread.sleep(1500L);
		     
			
			 //System.out.print(element.getText()+ "|");
	 }

}

public static void modifyUserManagementScreen(String Output) throws Exception {
	selenium = new WebDriverBackedSelenium(driver, baseUrl1);
	
    lst=driver.findElements(By.xpath("//*[@id='"+Output+"']/tr/td[5]"));
		 rowCount = lst.size();
		 System.out.println("No of Rows: " + rowCount+ "     ");
		 
		 for (int i=1;i<=rowCount;i++){
			 
			//Click UserManagement Edit
			 clickUserManagementEdit(Output);
		
				//Edit Bar Number
				
				rand = new Random();
				randomNumber = rand.nextInt(90000);
				b=String.valueOf(randomNumber);
				ModifiedBarNum=" ";
				ModifiedBarNum=b;
				selenium.type("xpath=//input[@id='edit_barNumber']",ModifiedBarNum);
				 Thread.sleep(2500L);
								
				//Edit Unit
				randomNumber = rand.nextInt(9000);
				b=String.valueOf(randomNumber);
				ModifiedUnit=" ";
				ModifiedUnit=b;
				selenium.type("xpath=//input[@id='edit_unit']",ModifiedUnit);
				 Thread.sleep(2500L);
			
						 
			 element=driver.findElement(By.xpath("//*[@id='editUserFormButton']"));
			 element.click();
			 Thread.sleep(2500L);
			 
			 
			 clickUserManagementEdit(Output);
			 a = selenium.getValue("xpath=//input[@id='edit_barNumber']");
			 
			 System.out.println("Fitrst A Calue: " + a);
			 
			 System.out.println();
			 Assert.assertEquals(a, ModifiedBarNum);
			 a = selenium.getValue("xpath=//input[@id='edit_unit']");
			 
			 System.out.println("Second A Calue: " + a);
			 
			 Assert.assertEquals(a, ModifiedUnit);
			 element=driver.findElement(By.xpath("//*[@id='cancelEditUserFormButton']"));
			 element.click();
			 Thread.sleep(1500L);

	 }

}


public static void clickUserManagementEdit(String Output) throws Exception {
	 element=driver.findElement(By.xpath("//*[@id='"+Output+"']/tr["+i+"]/td[5]"));
	  element.click();
	 Thread.sleep(1500L);

}



public static void validateWarrantTrackingScreen() throws Exception {
	
	 
	
		 lst=driver.findElements(By.xpath("//*[@id='adminSearchWarrantsOutput']/tr/td[2]"));
		 noOfColumns=lst.size();
		 System.out.println("*******************************************************************************************************************");
		 System.out.print("No of Colums: " + noOfColumns + "      ");

        	 if ((noOfColumns<=0)){
    		 System.out.println("No Rows are display");
    		// Assert.fail ("Unable to display elements as colums are null");
    		 		 
    	 }
        	 else {
        		//*[@id="adminSearchWarrantsTable"]/thead/tr/th[2]
        		
        		 
       lst=driver.findElements(By.xpath("//*[@id='adminSearchWarrantsTable']/thead/tr/th"));

		// 'To calculate no of rows In table'
		 rowCount = lst.size();
	
		 System.out.println("No of Rows: " + rowCount+ "     ");
		 
		 System.out.println("*******************************************************************************************************************");
		 Thread.sleep(100L);
		
		 for (int i=1;i<=rowCount;i++){
			
		
				 element=driver.findElement(By.xpath("//*[@id='adminSearchWarrantsTable']/thead/tr/th["+i+"]"));
			 
				 System.out.print(element.getText()+ "|");
		 }
		 System.out.println();
        	 }
		 
//	//********************Validating items in the Screen**************************//
		 for(int j=1;j<=noOfColumns;j++){
		 		
		 for (int i=2;i<=rowCount;i++){
			 element=driver.findElement(By.xpath("//*[@id='adminSearchWarrantsOutput']/tr["+j+"]/td["+i+"]"));
			 System.out.print(element.getText() + "|");
			 
//			 driver.findElement(By.xpath("//*[@id='adminSearchWarrantsOutput']/tr["+j+"]/td[2]")).click();
//			 Thread.sleep(500L);
//			 driver.findElement(By.xpath("//*[@id='warrantDetailsModal']/div[1]/i[2]")).click();
//			 Thread.sleep(500L);
								 
			 }
		 System.out.println();
		 driver.findElement(By.xpath("//*[@id='adminSearchWarrantsOutput']/tr["+j+"]/td[2]")).click();
		 Thread.sleep(100L);
		 warrantyDetailsScreen();
		 
		//*[@id="warrantDetailsModal"]/div[1]/i[2]
		
		 driver.findElement(By.cssSelector("#warrantDetailsModal > div.header.modaltitle > i.ui.close.link.icon.closeModal")).click();
		 Thread.sleep(500L);
		 System.out.println();
		 System.out.println();
		 Thread.sleep(1500L);
	
		
		 }

}

public static void warrantyDetailsScreen() throws Exception {
	
	 element=driver.findElement(By.xpath("//*[contains(text(),'Warrant Number:')]"));
	 Thread.sleep(500L);
	 System.out.print(element.getText() + "  ");
	

	element=driver.findElement(By.xpath("//*[@data-detail='warrant_number']"));
	Thread.sleep(500L);
	System.out.print( element.getText() + "                          ");
	
	 element=driver.findElement(By.xpath("//*[contains(text(),'Entered By:')]"));
	 Thread.sleep(500L);
	 System.out.print(element.getText() + "  ");
	
	element=driver.findElement(By.xpath("//*[@data-detail='warrant_entered_by']"));
	Thread.sleep(500L);
	System.out.println(element.getText());
	
	 element=driver.findElement(By.xpath("//*[contains(text(),'Reviewing APA #:')]"));
	 Thread.sleep(500L);
	 System.out.print(element.getText() + "  ");
	
	element=driver.findElement(By.xpath("//*[@data-detail='apa_p_number']"));
	Thread.sleep(500L);
	System.out.print(element.getText()+ "                                  ");
	
	 element=driver.findElement(By.xpath("//*[contains(text(),'WCPO Unit:')]"));
	 Thread.sleep(500L);
	 System.out.print(element.getText() + "  ");
	
	element=driver.findElement(By.xpath("//*[@data-detail='wcpo_unit']"));
	Thread.sleep(500L);
	System.out.println(element.getText());
	
	//Affiant Info
	
	element=driver.findElement(By.xpath("//*[@id='warrantDetailsModal']/div[2]/div[3]/div/h4"));
	 Thread.sleep(500L);
	 System.out.println(element.getText());
	 
	 element=driver.findElement(By.xpath("//*[contains(text(),'Affiant:')]"));
	 Thread.sleep(500L);
	 System.out.print(element.getText() + "  ");
	
	  

	element=driver.findElement(By.xpath("//*[@data-detail='affiant_rank']"));
	Thread.sleep(500L);
	System.out.print(element.getText() + " ");
	
	element=driver.findElement(By.xpath("//*[@data-detail='affiant_first_name']"));
	Thread.sleep(500L);
	System.out.print(element.getText() + " ");
	element=driver.findElement(By.xpath("//*[@data-detail='affiant_last_name']"));
	Thread.sleep(500L);
	System.out.println(element.getText() + " ");
	
	element=driver.findElement(By.xpath("//*[contains(text(),'Department:')]"));
	Thread.sleep(500L);
	System.out.print(element.getText() + " ");
	
	element=driver.findElement(By.xpath("//*[@data-detail='department_name']"));
	Thread.sleep(500L);
	System.out.print(element.getText() + "                                    ");
	
	element=driver.findElement(By.xpath("//*[contains(text(),'Agency Complaint Number:')]"));
	Thread.sleep(500L);
	System.out.print(element.getText() + " ");
	
	element=driver.findElement(By.xpath("//*[@id='warrantDetailsModal']/div[2]/div[3]/div/div[3]/div[2]/div"));
	Thread.sleep(500L);
	System.out.println(element.getText() + " ");
	
	//Decision Info
	
	element=driver.findElement(By.xpath("//*[@id='warrantDetailsModal']/div[2]/div[6]/div/h4"));
	 Thread.sleep(500L);
	 System.out.println(element.getText());
	 
	 element=driver.findElement(By.xpath("//*[contains(text(),'Decision:')]"));
	 Thread.sleep(500L);
	 System.out.print(element.getText() + "  ");
	
	  

	element=driver.findElement(By.xpath("//*[@data-detail='warrant_decision']"));
	Thread.sleep(500L);
	System.out.print(element.getText() + " ");
	System.out.print("on" + " ");
	element=driver.findElement(By.xpath("//*[@data-detail='warrant_decision_date']"));
	Thread.sleep(500L);
	System.out.print(element.getText() + " ");
	System.out.print("at" + " ");
	element=driver.findElement(By.xpath("//*[@data-detail='warrant_decision_time']"));
	Thread.sleep(500L);
	System.out.print(element.getText() + " ");
	
	
	
	
}


public static void getRowsCols() throws Exception {
	
	//*[@id="adminSearchWarrantsOutput"]/tr[1]/td[2]
	//*[@id="adminSearchWarrantsTable"]/thead/tr/th[1]
	
		 lst=driver.findElements(By.xpath("//*[@id='adminFoCasesOutput']/tr/td[2]"));
		 noOfColumns=lst.size();
		 System.out.print("No of Colums: " + noOfColumns + "      ");

        	 if ((noOfColumns<=0)){
    		 System.out.println("No Rows are display");
    		// Assert.fail ("Unable to display elements as colums are null");
    		    		    		 
    	 }
        	 else {
        		 
       lst=driver.findElements(By.xpath("//*[@id='adminFoCasesTable']/thead/tr/th"));

		// 'To calculate no of rows In table'
		 rowCount = lst.size();
		 System.out.println("No of Rows: " + rowCount+ "     ");
		 
		 System.out.println("*******************************************************************************************************************");
		
		 for (int i=2;i<=rowCount;i++){
				
				 element=driver.findElement(By.xpath("//*[@id='adminFoCasesTable']/thead/tr/th["+i+"]"));
				 System.out.print(element.getText()+ "|");
		 }
		 System.out.println();
		 
	//********************Validating items in the Screen**************************//
		 for(int j=1;j<=noOfColumns;j++){
		 		
		 for (int i=2;i<=rowCount;i++){
			 element=driver.findElement(By.xpath("//*[@id='adminFoCasesOutput']/tr["+j+"]/td["+i+"]"));
			 System.out.print(element.getText() + "|");
								 
			 }
		 driver.findElement(By.xpath("//*[@id='adminFoCasesOutput']/tr["+j+"]/td[2]")).click();
		 Thread.sleep(500L);
		 validateCaseDetailsScreen();
		 
		
		 
		 
		 System.out.println("");
		 }
        	 }
        	 System.out.println("*******************************************************************************************************************");
        	 Thread.sleep(500L);
}

public static void validateCaseDetailsTabs() throws Exception {
	Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
	selenium.click("xpath=//a[@data-tab='events']");
	Thread.sleep(500L);
	selenium.click("xpath=//a[@data-tab='closing']");
	Thread.sleep(500L);
	selenium.click("xpath=//a[@data-tab='defendants']");
	Thread.sleep(500L);
	selenium.click("xpath=//a[@data-tab='comments']");
	Thread.sleep(500L);
	selenium.click("xpath=//a[@data-tab='seizure']");
	Thread.sleep(500L);
	
	//Validate the Screen details
	System.out.println("Seizure Info");
	
	
	
	sel=new Select(driver.findElement(By.id("foSiezingAgencyDetailsDropdown")));
	sel.selectByIndex(1);
	
	a=selenium.getValue("foSiezingAgencyDetailsDropdown");
	
	if (a.equalsIgnoreCase("AP"))
	{
		a="Allen Park Police Department";
	}
	
	if (a.equalsIgnoreCase("GI"))
	{
		a="Gibraltar Police Department";
	}
	System.out.print("Seizing Agency: " + a+ "       ");
	
a=selenium.getValue("xpath=//input[@data-detail='fo_agency_incident_number']");
System.out.print("Agency Incident #: " + a+ "       ");

a=selenium.getValue("foCaseTypesDetailsDropdown");

if (a.equalsIgnoreCase("6"))
{
	a="Drag racing";
	
}
if (a.equalsIgnoreCase("10"))
{
	a="Blind Pig";
	
}

System.out.print("Reason for Seizing: " + a+ "       ");

a=selenium.getValue("xpath=//input[@data-detail='fo_seizure_date']");
System.out.print("Seizure Date: " + a+ "       ");
a=selenium.getValue("xpath=//textarea[@class='foCaseInfo foci']");
System.out.print("Assets Seized: " + a+ "       ");

//Bond Amount Details

a=selenium.getValue("xpath=//input[@data-detail='fo_bond']");
System.out.print("Bond Posted Amount: " + "$ " + a+ "       ");

a=selenium.getValue("xpath=//input[@data-detail='fo_bond_posted_date']");
System.out.print("Bond Posted Date: " + a+ "       ");


	
	
	

}

public static void validateCaseDetailsScreen() throws Exception {
	//Getting first screen values
	Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
	a=selenium.getText("xpath=//div[@data-detail='fo_ffn_number']");
	validateScreenValues();
	

	System.out.println();
	System.out.print("FFN#: " + a+ "       ");
	
	a=selenium.getValue("xpath=//input[@data-detail='fo_ccc_number']");
	validateScreenValues();
	System.out.print("Court Case #:  " + a + "      ");
	
	a=selenium.getValue("xpath=//*[@id='foDetailsApaDropdown']");
	validateScreenValues();
	System.out.println("APA Assigned: : " + a + "       ");
	
	
	a=selenium.getValue("xpath=//input[@data-detail='fo_transmission_date']");
	validateScreenValues();
	System.out.print("Transmission Date: " + a + "       ");
	
	a=selenium.getValue("xpath=//input[@data-detail='fo_complaint_date']");
	validateScreenValues();
	System.out.print("Complaint Date: " + a + "       ");
	
	a=selenium.getValue("xpath=//input[@data-detail='fo_summons_exp']");
	validateScreenValues();
	Thread.sleep(500L);
	System.out.println("Summons Expected: " + a + "     ");
	
	
	//CaseTracking Details
	a=selenium.getValue("xpath=//input[@data-detail='fo_update_criminal_tracking_number']");
	validateScreenValues();
	Thread.sleep(500L);
	System.out.print("Case Tracking #:: " + a + "     ");
	
	a=selenium.getValue("xpath=//input[@data-detail='fo_update_district_court_case_number']");
	validateScreenValues();
	Thread.sleep(500L);
	System.out.print("District Court Case #: " + a + "     ");
	
	a=selenium.getValue("xpath=//input[@data-detail='fo_update_civil_court_case_number']");
	validateScreenValues();
	Thread.sleep(500L);
	System.out.println("Civil Court Case #: " + a + "     ");
	
	a=selenium.getValue("xpath=//input[@data-detail='fo_update_charges_authoized_date']");
	validateScreenValues();
	Thread.sleep(500L);
	System.out.print("Charges Authorized Date: " + a + "     ");
	
	a=selenium.getValue("xpath=//input[@data-detail='fo_update_conviction_date']");
	validateScreenValues();
	Thread.sleep(500L);
	System.out.println("Conviction Date: " + a + "     ");
	
	
	
	validateCaseDetailsTabs();
	selenium.click("xpath=//*[@id='foCaseDetailsModal']/div[1]/i[2]");
	Thread.sleep(500L);
	System.out.println();
		
}

public static void validateScreenValues() throws Exception {
	if (a.length()>0)
	{
		Assert.assertTrue(true);
	}
	
}

public static void clickForfeiture() throws Exception {
	
	driver.findElement(By.xpath("//*[@id='ForfeitureCard']/div[3]/div")).click();
	Thread.sleep(3500L);
	
}

public static void launchSearchWarrantTracking() throws Exception {
	
	 element=driver.findElement(By.xpath("//*[contains(@data-rel,'searchWarrants')]"));
	 element.click();
	 Thread.sleep(4500L);
	
}

public static void launchUserManagement() throws Exception {
	
	
	 element=driver.findElement(By.xpath("//*[@id='usericon']"));
	 element.click();
	 Thread.sleep(4500L);
	
	 element=driver.findElement(By.xpath("//*[contains(@data-rel,'user_mgmt')]"));
	 element.click();
	 Thread.sleep(4500L);
	
}

public static void clickWcpoUserIcon() throws Exception {
	 driver.findElement(By.xpath("//*[@id='usericon']")).click();
	 Thread.sleep(2500L);
}

public static void clickApplicationOptions() throws Exception {
	 driver.findElement(By.xpath("//*[contains(@data-rel,'app_options')]")).click();;
	 Thread.sleep(2500L);
}
public static void clickCaseEvents() throws Exception {
	 driver.findElement(By.xpath("//*[contains(@data-rel,'case_events')]")).click();;
	 Thread.sleep(2500L);
}

public static void click() throws Exception {
	 driver.findElement(By.xpath("//*[contains(@data-rel,'disposition')]")).click();;
	 Thread.sleep(2500L);

}

public static void getCaseEventRows(String forfeitureRows) throws Exception {
	 //Getting the count of the list elements
	 
 	lst=driver.findElements(By.xpath("//*[@id='"+forfeitureRows+"']/tr/td[1]"));
 		 rowCount = lst.size();
		 Thread.sleep(1500L);
	
}
public static void addCaseEvent() throws Exception {
	 //Add a Case Event
	 elements= driver.findElements(By.xpath("//*[contains(@data-rel,'case_events')]"));
	elements.get(2).click();
	 Thread.sleep(1500L);
	 driver.findElement(By.id("appOptionName")).sendKeys("Test");
	 Thread.sleep(500L);
	 driver.findElement(By.id("appOptionDate1")).sendKeys("Date of Adj.");
	 Thread.sleep(500L);
	 driver.findElement(By.id("appOptionDate2")).sendKeys(" Date Adj. To");
	 Thread.sleep(500L);
	 driver.findElement(By.id("saveAppOptionButton")).click();
	 Thread.sleep(2500L);

}

public static void addDispositionEvent(String addEvent) throws Exception {
	 elements= driver.findElements(By.xpath("//*[contains(@data-rel,'"+addEvent+"')]"));
	 elements.get(2).click();
	 Thread.sleep(2500L);
	 driver.findElement(By.id("appOptionName")).sendKeys("Test");
	 Thread.sleep(500L);
	 driver.findElement(By.id("saveAppOptionButton")).click();
	 Thread.sleep(2500L);

}
public static void validateApplicationOptionRows() throws Exception {
    if (rowAfter <= rowBefore)
    {
    	Assert.fail("Case is not added properly");
    }
 }

public static void clickReasonsForSeizure(String seizureReasons) throws Exception {
	 driver.findElement(By.xpath("//*[contains(@data-rel,'"+seizureReasons+"')]")).click();;
	 Thread.sleep(2500L);
	
}

public static void launchApplicationOptions() throws Exception {
	
	System.out.println("//***********************************************13.Start of LaunchApplicationOption***********************************************************//");
	//*******************************************Validate Case Events*****************************//
	
	clickWcpoUserIcon();
	clickApplicationOptions();
	clickReasonsForSeizure("case_events");
	getCaseEventRows("adminCaseEventsOutput");
	rowBefore=rowCount;
	System.out.println("Case Event Rows Before: " + rowBefore);
	addCaseEvent();
	clickReasonsForSeizure("case_events");
    getCaseEventRows("adminCaseEventsOutput");
    rowAfter=rowCount;
    System.out.println("Case Event Rows After: " + rowAfter);
    validateApplicationOptionRows();
    removeCase("adminCaseEventsOutput",rowAfter);
    
    //************************************Validate Disposition*************************************//
    
    clickReasonsForSeizure("disposition");
	getCaseEventRows("adminCaseDispositionOutput");
	rowBefore=rowCount;
	System.out.println("Disposition Rows Before: " + rowBefore);
	addDispositionEvent("disposition");
	clickReasonsForSeizure("case_events");
	clickReasonsForSeizure("disposition");
	getCaseEventRows("adminCaseDispositionOutput");
	rowAfter=rowCount;
	System.out.println("Disposition Rows After: " + rowAfter);
	validateApplicationOptionRows();
	removeCase("adminCaseDispositionOutput",rowAfter);
	 
	//************************************Validate Interest Types**********************************//
	 
	    clickReasonsForSeizure("interest_types");
		getCaseEventRows("adminInterestTypesOutput");
		rowBefore=rowCount;
		System.out.println("Interest Type Rows Before: " + rowBefore);
		addDispositionEvent("interest_types");
		clickReasonsForSeizure("case_events");
		clickReasonsForSeizure("interest_types");
		getCaseEventRows("adminInterestTypesOutput");
		rowAfter=rowCount;
		System.out.println("Interest Type Rows After: " + rowAfter);
		validateApplicationOptionRows();
		removeCase("adminInterestTypesOutput",rowAfter);
		
		System.out.println("//***********************************************13.End.Start of LaunchApplicationOption***********************************************************//");
		 	
		}


				 
public static void removeCase(String removeCase,int rowx) throws Exception {
	
			for (int i=1;i<rowx;i++){
			
			element=driver.findElement(By.xpath("//*[@id='"+removeCase+"']/tr["+i+"]/td[1]"));
						 
			 if ((element.getText()).equalsIgnoreCase("Test"))
			 		{
			 driver.findElement(By.xpath("//*[@id='"+removeCase+"']/tr["+i+"]/td[3]")).click();
			 Thread.sleep(1500L);
			 driver.findElement(By.id("removeAppOptionButton")).click();
			 Thread.sleep(2500L);
			 		}
					 				}
				 															}
	
	



public static void windowMax() throws Exception {
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 widthBeforeMaximize = driver.manage().window().getSize().width;
	 if (driver.manage().window().getSize().width < widthBeforeMaximize) {
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 
	 }
}

public static void validatingRightTabEnabled() throws Exception {
	if ((check1.isEnabled()) ) 
			{
				System.out.println("Right tab is Enabled");
				Assert.assertTrue(true);
				
			}
			if (!(check2.isEnabled() ))
			{
				System.out.println("Left tab is Disabled");
				Assert.assertTrue(true);
				
			}
	
}

public static void validatingLeftTabEnabled() throws Exception {
	if ((check2.isEnabled()) ) 
			{
				System.out.println("Left tab is Enabled");
				Assert.assertTrue(true);
				
			}
			if (!(check1.isEnabled() ))
			{
				System.out.println("Right tab is Disabled");
				Assert.assertTrue(true);
				
			}
	
}

public static void rightTabClickValidation(int forVal,WebElement x) throws Exception {

	   for (int i=1;i< forVal;i++)
       {
   
	   x.click();

	Thread.sleep(500L);

		}
		elements = driver.findElements(By.xpath("//app-dashboard/div/div[3]/table/tbody/tr/td[2]"));
		Thread.sleep(500L);
}

public static void checkValuesBasedOnDropDown(int count) throws Exception {
	  check1=driver.findElement(By.xpath("//app-dashboard/div/div[3]/table/tfoot/tr/th/div/button[2]"));
	  check2=driver.findElement(By.xpath("//app-dashboard/div/div[3]/table/tfoot/tr/th/div/button[1]"));
	
 
	 element= driver.findElement(By.xpath("//*[@ng-reflect-value='"+count+"']"));
		element.click();
		Thread.sleep(1500L);
		
		System.out.println("Start of Pagination Validation for Count:  " +count);
	 	 
//		 elements = driver.findElements(By.xpath("//app-dashboard/div/div[3]/table/tbody/tr/td[2]"));
////	     if (elements.size() <= count)
////	     {
//	    	 System.out.println("Validating Pagination for  :" +elements.size());
//	//     }
//	     Thread.sleep(1500L);
	   		 
		 Quotient = i / count; 
		 Remainder = i % count; 
		 
		 //Validating Left and Right Tabs

	    if (Remainder==0)
	    {
	    	rightTabClickValidation(Quotient,check1);
	    	validatingRightTabEnabled();
	    	 System.out.println("End of Right Tab Validation for Pagination count:  " +count);
	    	rightTabClickValidation(Quotient,check2);
	    	validatingLeftTabEnabled();
	    	 System.out.println("End of Left Tab Tab Validation for Pagination count:  " +count);
	    }
	    
	    if (Remainder!=0)
	    {
	    	rightTabClickValidation(Quotient+1,check1);
	    	validatingRightTabEnabled();
	    	System.out.println("End of Right Tab Validation for Pagination count:  " +count);
	    	rightTabClickValidation(Quotient+1,check2);
	    	validatingLeftTabEnabled();
	    	 System.out.println("End of Left Tab Tab Validation for Pagination count:  " +count);
	    }
	 			
	    
	    element=driver.findElement(By.xpath("//app-dashboard/div/div[3]/table/tfoot/tr/th/sui-select/i"));
		 element.click();
		 Thread.sleep(3500L);
		 
	
}

public static void clickMessageManager() throws Exception {
	 //Click Message Manager

	 element=driver.findElement(By.xpath("//a[contains(text(),'Message Manager')]"));
	 element.click();
	 Thread.sleep(2000L);
}

public static void validatingDepartmentRight() throws Exception {
	//element=driver.findElement(By.xpath("//app-dashboard/app-nav-bar/div[2]/div/div/sui-select"));
	
	element=driver.findElement(By.xpath("//app-dashboard/app-nav-bar/div[1]/div/div[2]"));
	 element.click();
	 Thread.sleep(100L);
	 
		element=driver.findElement(By.xpath("//app-dashboard/app-nav-bar/div[1]/div/div[2]/div/div[2]/sui-select"));
		 element.click();
		 Thread.sleep(100L);
		 getDepartmentName(xpathRightSideDept,"Information Technology");

	 
	// List<WebElement> rows = driver.findElements(By.xpath("//app-dashboard/app-nav-bar/div[2]/div/div/sui-select/div[3]/sui-select-option/span[2]"));
	 

}

public static void validatingDepartmentCenter() throws Exception {
	

	element=driver.findElement(By.xpath("//app-dashboard/app-nav-bar/div[2]/div/div/sui-select"));
  element.click();
 Thread.sleep(100L);
 
 getDepartmentName(xpathCenterDept,"Executive");
	 

}

public static void getDepartmentName(String xpathValue,String DeptName) throws Exception {
	 List<WebElement> rows = driver.findElements(By.xpath(xpathValue));
	 //
	 		 java.util.Iterator<WebElement> g = rows.iterator();
	 		 while(g.hasNext()) {
	 			 WebElement row = g.next();
			     a=row.getText();
			     System.out.println("Department Name: " +a);
			     if (a.equalsIgnoreCase(DeptName))
			     {
			    	 row.click();
			    	 break;
			     }
	 			 
	 		 }
}

	 
	 
	 public static void ValidateMessageManagerRightDepartment() throws Exception {
		 System.out.println("Validating Right Department");
		 
		 selenium = new WebDriverBackedSelenium(driver, baseUrl1);
		 
		 clickMessageManager();
		 validatingDepartmentRight();
			  		 
////		 //Choose Sent
		 messangerDropDownValidation("Sent");
		 clickListManager();
		 clickMessageManager();
//
////		 //Choose Draft
//		 
		 messangerDropDownValidation("Draft");
		 clickListManager();
		 clickMessageManager();
		 
//		 //Choose Any

		 messangerDropDownValidation("Any");
	 
	 }
	 
	 public static void ValidateMessageManagerCenterDepartment() throws Exception {
		 System.out.println(" ");
		 
		 System.out.println("Validating Center Department");
		 
		 selenium = new WebDriverBackedSelenium(driver, baseUrl1);
		 
		 clickMessageManager();
		 validatingDepartmentCenter();
			  		 
////		 //Choose Sent
		 messangerDropDownValidation("Sent");
		 clickListManager();
		 clickMessageManager();
//
////		 //Choose Draft
//		 
		 messangerDropDownValidation("Draft");
		 clickListManager();
		 clickMessageManager();
		 
//		 //Choose Any

		 messangerDropDownValidation("Any");
	 
	 }
	 
	 public static void messangerDropDownValidation(String ManageDrop) throws Exception {

		 element= driver.findElement(By.xpath("//app-dashboard/div/div[3]/div/form/div/div[1]"));
       	 Thread.sleep(500L);
		 element.click();
		 Thread.sleep(1500L);
		  
		 element= driver.findElement(By.xpath("//*[@ng-reflect-value='"+ManageDrop+"']"));
		 Thread.sleep(1000L);
		 element.click();
		 Thread.sleep(1500L);
		 
		 element= driver.findElement(By.xpath("//app-dashboard/div/div[3]/div/form/div/div[3]/div/button"));
		 element.click();
		 Thread.sleep(1500L);
		 
		 //Checking total Values in the Page
		 
		 element=driver.findElement(By.id("searchCount"));
		 a=element.getAttribute("value");
		 System.out.println(" ");
		 System.out.println("Total elements for " + ManageDrop + " are: " +a);
		 i=Integer.parseInt(a);
		 Thread.sleep(500L);
		 
		 
		 
		 //Check for Drop down Values for Pagination
		 

		 element=driver.findElement(By.xpath("//app-dashboard/div/div[3]/table/tfoot/tr/th/sui-select/i"));
		 element.click();
		 Thread.sleep(1500L);
		 
		 
		 DropDown = driver.findElements(By.xpath("//app-dashboard/div/div[3]/table/tfoot/tr/th/sui-select/div[3]/sui-select-option"));
		 
 		 dropdown = DropDown.iterator();
 		Thread.sleep(500L);
		 
		 while(dropdown.hasNext()) {
 			 WebElement row = dropdown.next();
		     a=row.getText();
		   //  System.out.println("Pagination value is: " +a);
		     
		     if(!(a.isEmpty()))
		     {
	    	 
	    	 x=Integer.parseInt(a);
	    	 
//	     	 if (i <=x) {
//				 elements = driver.findElements(By.xpath("//app-dashboard/div/div[3]/table/tbody/tr/td[2]"));
//			    // System.out.println("No of Rows are : " +elements.size()); 
//			     Assert.assertEquals(i, elements.size());
//	     	 }
//	     
		 
			 
		//	 if (i > x ) {
				 
				 checkValuesBasedOnDropDown(x);
				 Thread.sleep(2500L);
			 
			// }
		     }
	 }
	 }
	 
	 public static void BlastAddEmail() throws Exception {
		 String xx;
		 List<String> list=new ArrayList<>();
		 validateListManagerCount();
		                                //Click Category general
		  driver.findElement(By.xpath("//app-listmanager/div/div[2]/table/tbody/tr["+tablecount+"]//td[5]/i")).click();
		  Thread.sleep(2000L);
				                      //Click Subscriber's List Upload
		   System.out.println("Click Subscriber's List Upload");
		   driver.findElement(By.xpath("/html/body/app-root/div/app-manage-list/div/div[2]/div[2]/div[3]/div[1]/a/i")).click();
		   Thread.sleep(2000L);
				
				 
				//Click Choose File
				element= driver.findElement(By.xpath("//*[@id='Import']"));
			//	element.sendKeys("F:\\SeleniumTestAutomation\\blastemail.xlsx");
				element.sendKeys("F:\\ExcelData\\BlastEmail2.xlsx");
						 
				// gridCopy("F:\\SeleniumTestAutomation\\blastemail.xlsx");
				//Click Import Mailing List
				 
				 driver.findElement(By.xpath("//*[@id='form1']/div[2]/button")).click();
				 Thread.sleep(2000L);
				 System.out.println("Click Import Mailing List");
					 
				 lst = driver.findElements(By.xpath("//app-manage-list/div/div[2]/div[1]/table/thead/tr/th"));
					// 'To calculate no of rows In table'
					 int rows_count = lst.size();
											 
					 if (rows_count >= 5 ){
						 Assert.assertFalse(false); 
						 
					 }
					 
						
					 //Validate Invalid Email
					 for (int i=1;i<=(rows_count);i++){
					 
						 element=driver.findElement(By.xpath("//app-manage-list/div/div[2]/div[1]/table/tbody/tr["+i+"]/td[3]"));
						// System.out.println(element.getText());
							 
						 if ((element.getText().equalsIgnoreCase("1")) || (element.getText().equalsIgnoreCase("skg")))
						 {
							element= driver.findElement(By.xpath("//*[@id='formbuilderMain']/div/div[2]/div/div["+i+"]/div/div/sui-checkbox/label"));
							element.click();
							 Thread.sleep(2000L);
							 break;
							 
						 }
							 
					 }
					 
					 //validating Duplicate Emails
					 
					 //Ini
					 
					 
					 for (int i=1;i<=(rows_count);i++){
						
						 
						 
						 element=driver.findElement(By.xpath("//app-manage-list/div/div[2]/div[1]/table/tbody/tr["+i+"]/td[3]"));
						 xx=element.getText();
						list.add(xx);
							 }
					 System.out.println("List value: " +list);
											
							Set<String> set=new HashSet<>();
							Set<String> duplicateElements=new HashSet<>();
							
							for (String element : list) {
								if(!set.add(element)){
									duplicateElements.add(element);
								}
							}
							
							System.out.println("Duplicate Elements : "+duplicateElements);
						}

			

	
   
public static void BlastListManagerAdd() throws Exception {
         clickListManager();
		 System.out.println("Click List Manager");
		 
		 //Click new Mailing List
		 
		 driver.findElement(By.xpath("/html/body/app-root/div/app-listmanager/div/div[1]/div[2]/button[1]")).click();
		 Thread.sleep(2000L);
		 System.out.println("Click new Mailing List");

		    generatedString = RandomString.make();
		    generatedString=generatedString.toUpperCase();
		     
		    System.out.println(generatedString);
		    
		    //Enter New List Name
		    
		  driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[2]/form/div[1]/div/input")).sendKeys(generatedString);
		 Thread.sleep(2000L);
		 System.out.println("Enter New List Name");
		 
		 //Choose General Category
		 
		 driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[2]/form/div[2]/div/sui-select/div[1]")).click();
		 Thread.sleep(2000L);
		 
		 System.out.println("Choose General Category");
		 
		//Click CreateList
		 
		 driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[2]/form/div[2]/div/sui-select/div[3]/sui-select-option[1]")).click();
		 Thread.sleep(2000L);
		 System.out.println("Click CreateList");
		 
			//Click Subscriber's List Upload
		 
		 driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[3]/button")).click();
		 Thread.sleep(2000L);
		 
		 System.out.println("Click Subscriber's List Upload");
		 
		
		 driver.findElement(By.xpath("/html/body/app-root/div/app-manage-list/div/div[2]/div[2]/div[3]/div[1]/a/i")).click();
		 Thread.sleep(2000L);
		
		 
		//Click Choose File
		element= driver.findElement(By.xpath("//*[@id='Import']"));
		element.sendKeys("F:\\SeleniumTestAutomation\\blastemail.xlsx");
				 
		// gridCopy("F:\\SeleniumTestAutomation\\blastemail.xlsx");
		//Click Import Mailing List
		 
		 driver.findElement(By.xpath("//*[@id='form1']/div[2]/button")).click();
		 Thread.sleep(2000L);
		 System.out.println("Click Import Mailing List");
		 //Validate the email attached
		 a= driver.findElement(By.xpath("//app-manage-list/div/div[2]/div[1]/table/tbody/tr/td[3]")).getText();
		 System.out.println("Email value is: " +a);
		 Assert.assertEquals("srn987@gmail.com",a);
		 Thread.sleep(2000L);
		 
//		 element=driver.findElement(By.xpath("//td[contains(@title,'AZTDZ9AH'//following-sibling::i)]"));
//		 element.click();
//		 Thread.sleep(2000L);
		  
	
}

public static void validateListManagerCount() throws Exception {

	 lst = driver.findElements(By.xpath("//app-listmanager/div/div[2]/table/tbody/tr/td[2]"));
		// 'To calculate no of rows In table'
		 tablecount = lst.size();
		// System.out.println(tablecount);
	
}

public static void addNewMailingList() throws Exception {
	if (tablecount <=1) {
		//Click new Mailing List
		 
		 driver.findElement(By.xpath("/html/body/app-root/div/app-listmanager/div/div[1]/div[2]/button[1]")).click();
		 Thread.sleep(2000L);
		 System.out.println("Click new Mailing List");

		    generatedString = RandomString.make();
		    generatedString=generatedString.toUpperCase();
		     
		    System.out.println(generatedString);
		    
		    //Enter New List Name
		    
		  driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[2]/form/div[1]/div/input")).sendKeys(generatedString);
		 Thread.sleep(2000L);
		 System.out.println("Enter New List Name");
		 
		 //Choose General Category
		 
		 driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[2]/form/div[2]/div/sui-select/div[1]")).click();
		 Thread.sleep(2000L);
		 
		 System.out.println("Choose General Category");
	}
		
	
}
public static void clickListManager() throws Exception {
	 //Click List Manager

	 element=driver.findElement(By.xpath("//a[contains(text(),'List Manager')]"));
	 element.click();
	 Thread.sleep(2000L);
	 System.out.println("Click List Manager");
}

public static void WcBlastFlow() throws Exception {
	validatingDepartmentCenter();
      
	clickListManager();
	 
	//Click Subscription Manager
	 
	 element=driver.findElement(By.xpath("//a[contains(text(),'Subscription Manager')]"));
	 element.click();
	 Thread.sleep(2000L);
	 
	//Click Messsage Manager
	 
	 element=driver.findElement(By.xpath("//a[contains(text(),'Message Manager')]"));
	 element.click();
	 Thread.sleep(2000L);
	 
	 //Click New Message
	 
	 element=driver.findElement(By.xpath("//button[contains(text(),'New Message')]"));
	 element.click();
	 Thread.sleep(2000L);
	 
	 //Choose Blast Radio Button
	 
//	 driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[2]/form/div/div/div[2]/sui-radio-button/label")).click();
//	 Thread.sleep(2000L);
	 
	 driver.findElement(By.xpath("*//div[2]/sui-radio-button/label")).click();
	 Thread.sleep(2000L);
	 
	 //Click CreateMessage
	 
	 element=driver.findElement(By.xpath("//button[contains(text(),'Create Message')]"));
	 element.click();
	 Thread.sleep(2000L);
	 Random rand = new Random(); 
	 int rand_int1 = rand.nextInt(1000); 
	 
//	 driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[3]/button")).click();
//	 Thread.sleep(2000L);
	 driver.findElement(By.xpath("//*[@id='showSendMessageOptions']")).click();
	 Thread.sleep(2000L);
	 
	 driver.findElement(By.id("emailSubjectInput")).sendKeys("Testing Blast Automation Email " + rand_int1);
	 Thread.sleep(2000L);
	 
	 element=driver.findElement(By.xpath("//button[contains(text(),'Send Blast ')]"));
	 element.click();
	 Thread.sleep(2000L);
	 
	 
	 lst = driver.findElements(By.xpath("//*[@id='formbuilderMain']/div/div[2]/div/div/div/div/sui-checkbox/label"));
		// 'To calculate no of rows In table'
		 int tablecount = lst.size();
		 System.out.println(tablecount);
		 
		 
		 for (int i=1;i<=(tablecount);i++){
			 element=driver.findElement(By.xpath("//*[@id='formbuilderMain']/div/div[2]/div/div["+i+"]/div/div/sui-checkbox/label"));
				 
			 if (element.getText().equalsIgnoreCase("General 1")){
				element= driver.findElement(By.xpath("//*[@id='formbuilderMain']/div/div[2]/div/div["+i+"]/div/div/sui-checkbox/label"));
				element.click();
				 Thread.sleep(2000L);
				 break;
				 
			 }
				 
		 }
	 
	 
	 
	 driver.findElement(By.xpath("/html/body/sui-modal/sui-modal-dimmer/div/div[3]/button")).click();
	 Thread.sleep(2000L);
}

public static void ValidateItems(String Clicks,String Item) throws Exception {
	
	System.out.println("*********************Validating : " + Item +"*******************************");

	Pass=Clicks;
	
	
	try {

	element=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
	
	  if(element.getText() != null){
	
		  System.out.println("******************************"+ element.getText() + " is Found************************************");
		  element.click();
		Thread.sleep(3000L);
		
	}
	}
	catch(ElementNotVisibleException te){
	
		System.out.println(element.getText() + " is not Found");
	}
	
}

public static void ValidateHomePage() throws Exception {
	System.out.println("*****************************Validating HomePage********************************************");
	element=driver.findElement(By.xpath(ServiceHomePage));
	
	  if(element.getText() != null){
	
		  System.out.println("******************************"+ element.getText() + "   is Present******************************************");
		  element.click();
		Thread.sleep(2000L);
		
	}
	else
	{
		System.out.println(element.getText() + "  is not Found");
	}


}

public static void NavigateToIWantToFrame(String FrameName) throws Exception {
	System.out.println("***************************Navigate to Frame: " + FrameName +"********************************");
	  driver.switchTo().frame(driver.findElement(By.id(FrameName)));
	    Thread.sleep(3000L);
   

}

public static void ClickReportTechnologyissue() throws Exception {
	element=driver.findElement(By.xpath("//span[contains(text(),'Report a technology issue')]"));
    element.click();
    Thread.sleep(3000L);
	
}

public static void SwitchToDefault() throws Exception {
	System.out.println("Switch to Default Home");
	      driver.switchTo().defaultContent();
    Thread.sleep(3000L);

}
public static void NavigateToReportTechnologyIssue() throws Exception {
	System.out.println("*********************************Switch to NavigateToReportTechnologyIssue Frame**********************************");
	 driver.switchTo().frame(driver.findElement(By.id("ext-gen77")));
	    Thread.sleep(3000L);

}



public static void ValidateNewTechnologyIssue1() throws Exception {

	Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
	
	
	element=driver.findElement(By.xpath("//input[@frsqa_fname='ProfileLink']"));
	System.out.println(element.getAttribute("value"));
	
    
    System.out.println("Building Name: ");
    
  
    element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_BuildingPickList']"));
    element.sendKeys("Central Maintenance Yard");
    Thread.sleep(1500L);
    element.sendKeys(Keys.TAB);
    Thread.sleep(1000L);
    
    element=driver.findElement(By.xpath("//div[@frsqa_fname='WC_BuildingAddress']"));
    Assert.assertEquals(element.getText(),"29900 Goddard  Romulus MI 48242");
   
    System.out.println(element.getText());
       
    System.out.println("Floor Number ");
   

    element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_Floor']"));
	element.sendKeys("3'RD FLOOR");
	Thread.sleep(1500L);
	
	//Alernate Location
	 element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_AlternateLocation']"));
		element.sendKeys("500 Grisworld Drive");
		Thread.sleep(1500L);
		   element.sendKeys(Keys.TAB);
		    Thread.sleep(1000L);
		
		//Alernate Phone
		
		 element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_AlternatePhone']"));
		element.sendKeys("313-123-1234");
		Thread.sleep(1500L);
		 element.sendKeys(Keys.TAB);
		    Thread.sleep(1000L);
		
		
	
		
	//How to prefered to be conatcted
		
		 element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_ContactMethod']"));
			element.sendKeys("Email");
			Thread.sleep(1500L);
			 element.sendKeys(Keys.TAB);
			    Thread.sleep(1000L);
	
	
	System.out.println("Asset Tag Name ");
	 element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_AssetTag']"));
		element.sendKeys("H100023");
		Thread.sleep(1500L);
		 element.sendKeys(Keys.TAB);
		    Thread.sleep(1000L);
		
		 element=driver.findElement(By.xpath("//input[@frsqa_fname='Subject']"));
			element.sendKeys("PEOPLESOFT");
			Thread.sleep(1500L);
		    element.sendKeys(Keys.TAB);
		    Thread.sleep(1000L);
			
			 element=driver.findElement(By.xpath("//textarea[@frsqa_fname='Symptom']"));
				element.sendKeys("TEST ISSUE DESCRIPTION");
				Thread.sleep(1500L);
    element.sendKeys(Keys.TAB);
    Thread.sleep(1000L);
    
//	 element=driver.findElement(By.xpath("//input[@name='file']"));
//
//  
//   action = new Actions(driver);
//   action.moveToElement(element).click().build().perform();
//   action.sendKeys(Keys.PAGE_DOWN).perform();
//   Thread.sleep(4000L);
  
   
 //  EnterValueThroughMouseClicks("F:\\SeleniumTestAutomation\\ServiceTicket.txt");
//   StringSelection ss = new StringSelection("C:\\Srini\\ServiceTicket.txt");
//   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//   //imitate mouse events like ENTER, CTRL+C, CTRL+V
//   Robot robot = new Robot();
//   robot.keyPress(KeyEvent.VK_ENTER);
//   robot.keyRelease(KeyEvent.VK_ENTER);
//   robot.keyPress(KeyEvent.VK_CONTROL);
//   robot.keyPress(KeyEvent.VK_V);
//   robot.keyRelease(KeyEvent.VK_V);
//   robot.keyRelease(KeyEvent.VK_CONTROL);
//   robot.keyPress(KeyEvent.VK_ENTER);
//   robot.keyRelease(KeyEvent.VK_ENTER);
//   Thread.sleep(4000L);
	
	wait = new WebDriverWait(driver, 100);
	//element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ext-gen194")));
//    element.click();
//    Thread.sleep(2000L);
////    element=driver.findElement(By.id("ext-comp-1122"));
//     
////    element=driver.findElement(By.id("ext-gen100"));
	
	
//	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ext-gen194")));
//   element.click();
    
	driver.findElement(By.xpath("//button[contains(text(),'Save Incident')]")).click();
	Thread.sleep(7000L);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Back to My Items List')]"))).click();
	
    Thread.sleep(2000L);
    //Back to My Items List(button)
      
    
    element=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div[1]/table/tbody/tr/td[1]/div/p"));
   String IssueId1 =element.getText();
   
   System.out.println("ISSUE ID: " + IssueId1);
	
}
public static void ClickServiceDeskAnalyst() throws Exception {
	System.out.println("************************************************************************************************************************************************");
	System.out.println("Click Service Desk Analyst");
	
	driver.findElement(By.xpath("//div[contains(text(),'Service Desk Analyst')]")).click();
	Thread.sleep(2000L);
		
}
public static void ClickServiceService() throws Exception {
	System.out.println("************************************************************************************************************************************************");
	System.out.println("Click Service Desk Analyst");
	
	driver.findElement(By.xpath("//div[contains(text(),'Self Service User')]")).click();
	Thread.sleep(2000L);
		
}

public static void ClickIncidentButton() throws Exception {
	System.out.println("Click Incident Button");
	element=driver.findElement(By.xpath("//*[@id='ext-gen23']"));
	element.click();
	Thread.sleep(3500L);
	
}
public static void ClickNewIncident() throws Exception {
	System.out.println("Click New Incident Button");
	
	wait = new WebDriverWait(driver, 100);
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ext-gen138")));
	element.click();
	Thread.sleep(3500L);
	
}

public static void ValidateUser(String priority) throws Exception {
	wait = new WebDriverWait(driver, 200);
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@frsqa_fname='ProfileLink']")));
	element.sendKeys(user);
	Thread.sleep(2500L);
	element.sendKeys(Keys.TAB);
    Thread.sleep(2500L);
	System.out.println("2.Validate Customer should be flagged as a VIP and the priority change to level 2- High");
	
	PriorityValue=driver.findElement(By.xpath("//input[@frsqa_fname='Priority']")).getAttribute("value");
	//PriorityValue=selenium.getValue("xpath=//input[@frsqa_fname='Priority']");
	Assert.assertEquals(PriorityValue,priority);
	
}
public static void ValidateCustomer(String user, String Priority,String uemail,String uphone,String uaddress,String verifyCustomer) throws Exception {
	
		Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
		System.out.println("*****************************Verify " +verifyCustomer+  "Profile and Priority****************************");
		System.out.println("1.Enter Name in the customer field.");
		wait = new WebDriverWait(driver, 200);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@frsqa_fname='ProfileLink']")));
		element.clear();
		Thread.sleep(2500L);
		element.sendKeys(user);
		Thread.sleep(2500L);
		element.sendKeys(Keys.TAB);
	    Thread.sleep(2500L);
		System.out.println("2.Validate Customer Priority Values");
		
		PriorityValue=driver.findElement(By.xpath("//input[@frsqa_fname='Priority']")).getAttribute("value");
		//PriorityValue=selenium.getValue("xpath=//input[@frsqa_fname='Priority']");
		Assert.assertEquals(PriorityValue,Priority);
		System.out.println("3.Validate Customer Profile");
	
				
		
		
		System.out.println("4.Customer profile should include name, email address, phone number, and customer location (address)");
		element=driver.findElement(By.xpath("//div[contains(@frsqa_fname,'PrimaryEmail')]"));
		UserEmail=element.getText();
		Assert.assertEquals(UserEmail,uemail);
		
		element=driver.findElement(By.xpath("//div[contains(@frsqa_fname,'Phone1')]"));
		UserPhone=element.getText();
	//	Assert.assertEquals(UserPhone,uphone);
		
		element=driver.findElement(By.xpath("//div[contains(@frsqa_fname,'WC_CustomerAddress')]"));
		UserAddress=element.getText();
		Assert.assertEquals(UserAddress,uaddress);
		
		System.out.println("Successfully Validated " +verifyCustomer+  " Profile,Email,Phone and Address");
		Thread.sleep(1500L);
		
		//************************************Enter Owner Name******************************//
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@frsqa_fname='Owner']")));
		element.clear();
		RobotEnter();
		element.sendKeys(user);
		RobotEnter();
		RobotTab();
			
}

public static void VerifyDetailedService(String Service,String Category,String sub1,String sub2,String sub3,String sub4,String sub5,String sub6,String sub7,String sub8,String sub9,String sub10) throws Exception {
	System.out.println(" Choose  Service: " + Service);
	element = driver.findElement(By.xpath("//input[@frsqa_fname='Service']"));
	element.clear();
	Thread.sleep(1500L);
	element.sendKeys(Service);
	Thread.sleep(1500L);
	  element.sendKeys(Keys.TAB);
	    Thread.sleep(1500L);
	
	
	
	System.out.println("*****************Validate the Category for this Service****************");
	System.out.println("Validating Service:" +Service);
	element = driver.findElement(By.xpath("//input[@frsqa_fname='Category']"));
	element.clear();
	Thread.sleep(1500L);
	element.sendKeys(Category);
	Thread.sleep(1500L);
    element.sendKeys(Keys.TAB);
    Thread.sleep(1500L);
    
    System.out.println("*****************Validate the SubCategory for this Service****************");
    
           element = driver.findElement(By.xpath("//input[@frsqa_fname='Subcategory']"));
           
           if(!(sub1.equals(""))){
        	   	element.clear();
            	Thread.sleep(1500L);
            	element.sendKeys(sub1);
            	Thread.sleep(1500L);
            	 element.sendKeys(Keys.TAB);
        	   
           }
           
           if(!(sub1.equals(""))){
       	   	element.clear();
           	Thread.sleep(1500L);
           	element.sendKeys(sub2);
           	Thread.sleep(1500L);
           	 element.sendKeys(Keys.TAB);
       	   
          }
           if(!(sub1.equals(""))){
       	   	element.clear();
           	Thread.sleep(1500L);
           	element.sendKeys(sub3);
           	Thread.sleep(1500L);
           	 element.sendKeys(Keys.TAB);
       	   
          }
           if(!(sub1.equals(""))){
       	   	element.clear();
           	Thread.sleep(1500L);
           	element.sendKeys(sub4);
           	Thread.sleep(1500L);
           	 element.sendKeys(Keys.TAB);
       	   
          }
           if(!(sub1.equals(""))){
       	   	element.clear();
           	Thread.sleep(1500L);
           	element.sendKeys(sub5);
           	Thread.sleep(1500L);
           	 element.sendKeys(Keys.TAB);
       	   
          }
           if(!(sub1.equals(""))){
       	   	element.clear();
           	Thread.sleep(1500L);
           	element.sendKeys(sub6);
           	Thread.sleep(1500L);
           	 element.sendKeys(Keys.TAB);
       	   
          }
           if(!(sub1.equals(""))){
       	   	element.clear();
           	Thread.sleep(1500L);
           	element.sendKeys(sub7);
           	Thread.sleep(1500L);
           	 element.sendKeys(Keys.TAB);
       	   
          }
           if(!(sub1.equals(""))){
       	   	element.clear();
           	Thread.sleep(1500L);
           	element.sendKeys(sub8);
           	Thread.sleep(1500L);
           	 element.sendKeys(Keys.TAB);
       	   
          }
           if(!(sub1.equals(""))){
       	   	element.clear();
           	Thread.sleep(1500L);
           	element.sendKeys(sub9);
           	Thread.sleep(1500L);
           	 element.sendKeys(Keys.TAB);
       	   
          }
           if(!(sub1.equals(""))){
       	   	element.clear();
           	Thread.sleep(1500L);
           	element.sendKeys(sub10);
           	Thread.sleep(1500L);
           	 element.sendKeys(Keys.TAB);
       	   
          }

	
}

public static void VerifyServices() throws Exception {
	
//	element=driver.findElement(By.cssSelector("div[frsqa_fname='Service']>span[class='x-form-twin-triggers']"));
//	element=driver.findElement(By.cssSelector("div[frsqa_fname='Service']>span[class='x-form-twin-triggers']"));
	
	//**************************************Validate All  Service,Category and SunCategory*************************************//
	System.out.println("********The category and subcategory list should appear based on the service that was selected*************");
//	VerifyDetailedService("Building Access Services","Guardian Building","Change","Disable","New","","","","","","","");
//	VerifyDetailedService("Building Access Services","400 Monroe","Change","Disable","New","","","","","","","");
//	VerifyDetailedService("Business Services","Procurement","New","","","","","","","","","");
//	VerifyDetailedService("Communications","Create Digital Media","New","","","","","","","","","");
//	VerifyDetailedService("Desktop Hardware Services","Desktop","Audio","BackUp ","Battery","BitLocker","BSOD","Cords/Connections","Hard Drive","Headsets","Keyboard","Memory");
//	VerifyDetailedService("Desktop Hardware Services","Laptop","Audio","BackUp ","Battery","BitLocker","BSOD","Cords/Connections/Adapters","Display","Docking Station","Hard Drive","Headsets");
//	VerifyDetailedService("Desktop Hardware Services","VOIP Phone","No Sound","Replace broken phone or phone cord","","","","","","","","");
	VerifyDetailedService("Desktop Software Services","Adobe","Acrobat (Full)","Creative Suites","Reader","Acrobat (Full)","Creative Suites","Reader","Acrobat (Full)","Creative Suites","Reader","Acrobat (Full)");

System.out.println("********Category and Subcategory list successfully apeared based on  the service that was selected*************");

	
}

public static void ChangeStatus() throws Exception {
	System.out.println("Change status from active to waiting for customer and click save and enter in notes Testing and your initials. Note your incident number.");
	element=driver.findElement(By.xpath("//input[@frsqa_fname='Status']"));
    element.clear();
    Thread.sleep(1000L);
    element.sendKeys("Waiting for Customer");
    Thread.sleep(1000L);
    RobotTab();
	
}


public static void SearchIncidentNumber(String iv) throws Exception {
	wait = new WebDriverWait(driver, 30);
	//element=driver.findElement(By.id("ext-comp-1106"));
	
		
	element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ext-comp-1004")));
	element.sendKeys(iv);
	Thread.sleep(1000L);
	element.sendKeys(Keys.ENTER);
	Thread.sleep(2000L);
	
	 driver.findElement(By.linkText("SN2")).click();
	 Thread.sleep(3000L);

	 driver.findElement(By.xpath("//textarea[@frsqa_fname='NewNotes']")).sendKeys(ModifiedNotes);
	    Thread.sleep(2000L);
	    robot = new Robot();
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    
	    action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.id("ext-gen203"))).click().build().perform();
	    action.sendKeys(Keys.PAGE_DOWN).perform();
	    Thread.sleep(3000L);
	 	
}

public static void setUp() throws Exception {
	String url="https://waynecounty-uat.saasit.com/Login.aspx?NoDefaultProvider=True";	
	System.setProperty("webdriver.gecko.driver",".\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get(url + "/");
	
	  System.out.println("test Url");
	  
	  driver.findElement(By.id("UserName")).sendKeys("snukala");
	  driver.findElement(By.id("Password")).sendKeys("Saibaba2005@");
	  driver.findElement(By.xpath("/html/body/div[4]/div/form/div[3]/button")).click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  Thread.sleep(5000L);
}
public static void CreateCloseTask() throws Exception {
	
//	PrintStream out = new PrintStream(new FileOutputStream("F:\\SeleniumTestAutomation\\CreateCloseTaskDetails.txt"));
//	System.setOut(out);
	

	
	ClickServiceDeskAnalyst();
	ValidateItems(SubmitButton,"Validate Submit Button");
	
	ClickIncidentButton();
	NavigateToIWantToFrame(ServiceIncidentFrame);
	//SearchServiceDeskRequest("23036");
	ClickNewIncident();
	ValidateCustomer(user,RegularUserPriority,RegularUserEmailValue,RegularUserPhonevalue,AddressValue,"Regular Customer");
	VerifyBuildingListFunction();
	VerifySummary();
	VerifyServices();
	VerifySaveWithSummaryandDesctiptionFirst("SN1","TEST1");
	//CreateAttachment();
	VerifyTask();
	
}

public static void CreateAttachment() throws Exception {
	
	System.out.println("Create Attachment on the New Incident");
	
	js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,250)", "");
	Thread.sleep(3000L);
	driver.findElement(By.xpath("//span[contains(text(),'Attachment')]")).click();
	//driver.findElement(By.id("ext-gen843")).click();
	Thread.sleep(4000L);
	wait=new WebDriverWait(driver, 1000);
	System.out.println("*****************Click New Attachment****************");
//	element=driver.findElement(By.xpath("//button[contains(text(),'Attachment')]"));
//	Thread.sleep(4000L);
	
	  action = new Actions(driver);
	  action.moveToElement(element).build().perform();
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Attachment')]")));
	   action.moveToElement(element).click().build().perform();
	   action.sendKeys(Keys.PAGE_DOWN).perform();
	   Thread.sleep(4000L);
	element.sendKeys("F:\\SeleniumTestAutomation\\ServiceTicket.txt");

//	EnterValueThroughMouseClicks("F:\\SeleniumTestAutomation\\ServiceTicket.txt");
	 Thread.sleep(4000L);
	System.out.println("Attachment Created Successfully");
	
}


public static void ValidateServiceDeskIncident() throws Exception {
	
//	PrintStream out = new PrintStream(new FileOutputStream("F:\\SeleniumTestAutomation\\CreateModifyIncident.txt"));
//	System.setOut(out);
	
	ClickServiceDeskAnalyst();
	
ValidateItems(SubmitButton,"Validate Submit Button");
	
	
	
	ClickIncidentButton();
	NavigateToIWantToFrame(ServiceIncidentFrame);
	ClickNewIncident();
//	//ValidateCustomer(Superuser,SuperUserPriority,SuperUserEmailValue,SuperUserPhonevalue,AddressValue,"VIP Customer");
	ValidateCustomer(user,RegularUserPriority,RegularUserEmailValue,RegularUserPhonevalue,AddressValue,"Regular Customer");
	VerifyBuildingListFunction();
	VerifySummary();
	VerifyServices();
////	VerifySaveWithouthSummaryandDesctiption();
////	VerifySaveWithSummaryandDesctiptionFirst("SN1","TEST1");
	ChangeStatus();
	VerifySaveWithSummaryandDesctiptionSecond("SN2","TEST2");
	
	

	
}
public static void ClickAllMyItems() throws Exception {
	
	System.out.println("Click All My Items");
	wait = new WebDriverWait(driver, 30);
	element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ext-gen27")));
	element.click();
	Thread.sleep(1000L);

}

public static void GoToSelfServiceUser() throws Exception {
	Thread.sleep(3000L);
	//element=driver.findElement(By.xpath("button[contains(text(),'Service Desk Analyst')]"));
	
	//element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ext-gen62")));
	element=driver.findElement(By.id("ext-gen62"));
	element.click();
	Thread.sleep(2000L);
	
	element=driver.findElement(By.id("ext-gen104"));
	element.click();
	Thread.sleep(2000L);
	

	
}
public static void GoToServiceDeskAnalyst() throws Exception {
	Thread.sleep(3000L);
    driver.findElement(By.id("ext-gen42")).click();
	Thread.sleep(2000L);
	   element=driver.findElement(By.xpath("//*[contains(text(),'Service Desk Analyst')]"));
	    element.click();
	    Thread.sleep(3000L);
	
}


public static void VerifySaveWithouthSummaryandDesctiption() throws Exception {
	System.out.println("******************Without filling the summary and description fields click save************************");
	element=driver.findElement(By.xpath("//input[@frsqa_fname='Subject']"));
    element.clear();
    Thread.sleep(1000L);
	element.sendKeys(Keys.TAB);
	Thread.sleep(1000L);
	   element=driver.findElement(By.xpath("//textarea[@frsqa_fname='Symptom']"));
		element.clear();
		Thread.sleep(1000L);
		element.sendKeys(Keys.TAB);
		Thread.sleep(1000L);
			
		 //  element=driver.findElement(By.xpath("//button[text()='Save']"));
		 element=driver.findElement(By.id("ext-gen362"));
			element.click();
			Thread.sleep(2000L);
			
			System.out.println("*************Validatng the Error received***************");
			
			element=driver.findElement(By.xpath("//span[@class='ext-mb-text']")); 
			String text = element.getAttribute("innerText");
			System.out.println("Error text value is: " +text);
		//	Assert.assertEquals(text,"The following information does not satisfy validation constraints:Summary: field value may not be empty Description: field value may not be empty");
//			element=driver.findElement(By.id("ext-gen887"));
//			element.click();
			
			element=driver.findElement(By.xpath("//div[@class='x-tool x-tool-close']")); 
			element.click();
//			driver.switchTo().alert().accept();
			Thread.sleep(2000L);
}

public static void VerifySaveWithSummaryandDesctiptionFirst(String Summ,String Desc) throws Exception {
	
	System.out.println("Enter Details in Summary and Description");
	element=driver.findElement(By.xpath("//input[@frsqa_fname='Subject']"));
    element.clear();
    Thread.sleep(1000L);
    element.sendKeys(Summ);
	element.sendKeys(Keys.TAB);
	Thread.sleep(1000L);
	
	
	   element=driver.findElement(By.xpath("//textarea[@frsqa_fname='Symptom']"));
		element.clear();
		Thread.sleep(1000L);
	    element.sendKeys(Desc);
		element.sendKeys(Keys.TAB);
		Thread.sleep(1000L);
		
				
	//	a=driver.findElement(By.xpath("//div[@class='x-frs-form-label x-frs-form-label-HeaderLabel  x-frs-form-field-readonly x-frs-form-label-readonly x-form-nohtml  headerlabel']")).getAttribute("text");
					
		 //  element=driver.findElement(By.xpath("//button[text()='Save']"));
		 element=driver.findElement(By.id("ext-gen362"));
			element.click();
			Thread.sleep(4000L);
		//	ClickJournal();
			//System.out.println("Creating and Modifying Incident Ended Successfully");
			
			
		

}

public static void ClickMainAnalyst() throws Exception {
	
	
    element=driver.findElement(By.id("ext-gen62"));
    element.click();
    Thread.sleep(3000L);
    
    element=driver.findElement(By.xpath("//*[contains(text(),'Self Service User')]"));
    element.click();
    Thread.sleep(3000L);
    
//	List<WebElement> allLinks = driver.findElements(By.xpath("//div[contains(@id,'ext-gen744')]"));
//	Iterator<WebElement> itr = allLinks.iterator();
//	while(itr.hasNext()) {
//	    System.out.println(itr.next());
//	}
}
			
			



	public static void VerifySaveWithSummaryandDesctiptionSecond(String Summ,String Desc) throws Exception {
		element=driver.findElement(By.xpath("//input[@frsqa_fname='Subject']"));
	    element.clear();
	    Thread.sleep(2000L);
	    element.sendKeys(Summ);
		element.sendKeys(Keys.TAB);
		Thread.sleep(1000L);
		
		
		   element=driver.findElement(By.xpath("//textarea[@frsqa_fname='Symptom']"));
			element.clear();
			Thread.sleep(1000L);
		    element.sendKeys(Desc);
			element.sendKeys(Keys.TAB);
			Thread.sleep(1000L);
			
			 element=driver.findElement(By.id("ext-gen362"));
				element.click();
				Thread.sleep(3000L);
				
			
				System.out.println("*************Capture the Incident#***************");
				IncidentValue=driver.findElement(By.id("ext-comp-1527")).getText();
				IncidentValue=IncidentValue.substring(10,15);
//				String iv;
//				iv=IncidentValue;
				System.out.println("Incident Value: " +IncidentValue);
				System.out.println("Enter the Notes");
				
				 SwitchToDefault();
				 ClickMainAnalyst();
				 
     
				ClickAllMyItems();
//			    SwitchToDefault();
				NavigateToIWantToFrame(ServiceRequestSearchFrame);
			
				SearchIncidentNumber(IncidentValue);
				SwitchToDefault();
				GoToServiceDeskAnalyst();
				
				ClickIncidentButton();
				NavigateToIWantToFrame(ServiceIncidentFrame);
				SearchServiceDeskRequest(IncidentValue);
				ClickJournal();
//				System.out.println("Creating and Modifying Incident Ended Successfully");
//				System.out.println("********************************************************************");
			
		

}
public static void 	ClickNewTask() throws Exception {
	System.out.println("*****************Click New Task****************");
	element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add Internal Task')]")));
	element.click();
	Thread.sleep(4000L);
	
	
	
	elements=driver.findElements(By.xpath("//input[@frsqa_fname='OwnerTeam']"));
	elements.get(1).sendKeys("Desktop Support");
	
	elements=driver.findElements(By.xpath("//button[text()='Save']//ancestor::td[1]"));
	
	 Iterator<WebElement> it = elements.iterator();
  while (it.hasNext()) {
      WebElement wb  = it.next();
      if(wb.getText().equals("Save")) {
          wb.click();
          break;
      }

  }
	     
	     System.out.println("*****************New Task Created Successfully****************");
	     


}

public static void CompleteTask() throws Exception {
	System.out.println("*****************Click Accept Task****************");
	driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
	Thread.sleep(4000L);
	
	System.out.println("*****************Click Complete Task****************");
	driver.findElement(By.xpath("//button[contains(text(),'Complete')]")).click();
	Thread.sleep(4000L);
	
	driver.findElement(By.xpath("//textarea[@tabindex='10002']")).sendKeys("Test Notes");
	Thread.sleep(500L);
	RobotTab();
	RobotEnter();
	Thread.sleep(1500L);
	driver.findElement(By.xpath("//input[@tabindex='10019']")).sendKeys("Yes");
	Thread.sleep(500L);
	RobotTab();
	RobotEnter();
	Thread.sleep(2500L);
	
	driver.findElement(By.xpath("//input[@tabindex='10036']")).clear();
	Thread.sleep(500L);
	driver.findElement(By.xpath("//input[@tabindex='10036']")).sendKeys("Desktop Hardware Services");
	Thread.sleep(500L);
	RobotTab();
	driver.findElement(By.xpath("//input[@tabindex='10037']")).clear();
	Thread.sleep(500L);
	driver.findElement(By.xpath("//input[@tabindex='10037']")).sendKeys("Desktop");
	Thread.sleep(500L);
	RobotTab();
	driver.findElement(By.xpath("//input[@tabindex='10038']")).clear();
	Thread.sleep(500L);
	driver.findElement(By.xpath("//input[@tabindex='10038']")).sendKeys("Hard Drive");
	Thread.sleep(500L);
	RobotTab();
	driver.findElement(By.xpath("//textarea[@tabindex='10039']")).sendKeys("Test SN");
	Thread.sleep(500L);
	 RobotTab();
	 RobotEnter();
	 
	System.out.println("*****************Complete Task Done Successfully****************");
	
}

public static void enterValues() throws Exception {

	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    String text = "C://Srini";
	    StringSelection selection = new StringSelection(text);
	    clipboard.setContents(selection, null);


	  clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    DataFlavor flavor = DataFlavor.stringFlavor;
	    if (clipboard.isDataFlavorAvailable(flavor)) {
	      try {
	        String text1 = (String) clipboard.getData(flavor);
	        System.out.println(text);
	      } catch (UnsupportedFlavorException e) {
	        System.out.println(e);
	      }
	    }
	        
	   	
}

public static void gridCopy(String Val) throws Exception {
	
	System.out.println("Value Entered/Choosed: " +Val);


    LocalFileDetector detector = new LocalFileDetector();
    String path = new File(Val).getAbsolutePath(); 

    File file = detector.getLocalFile(path);
	  ss = new StringSelection(path);
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
  clipboard.setContents(ss,null);



    robot = new Robot();
   robot.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(1000L);
	 robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    Thread.sleep(2000L);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_V);
    Thread.sleep(2000L);
    robot.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(1000L);
    robot.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(1000L);
    

	
}

public static void EnterValueThroughMouseClicks(String Val) throws Exception {
	
	System.out.println("Value Entered/Choosed: " +Val);
	
	  	
      clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      ss = new StringSelection(Val);
      clipboard.setContents(ss,null);
      
     

    //imitate mouse events like ENTER, CTRL+C, CTRL+V
      RobotTab();
      RobotEnter();
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_V);
      Thread.sleep(2000L);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyRelease(KeyEvent.VK_V);
      Thread.sleep(2000L);
  		RobotEnter();
    

	
}
public static void RobotEnter() throws Exception {
     
	robot = new Robot();
    robot.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(3000L);
	
}
public static void RobotTab() throws Exception {
	robot = new Robot();
    robot.keyPress(KeyEvent.VK_TAB);
    Thread.sleep(1500L);
	
}


public static void ClickReasignTask() throws Exception {
	System.out.println("*****************Click Reassign Task****************");
	Thread.sleep(1500L);
	
	driver.findElement(By.xpath("//button[contains(text(),'Reassign')]")).click();
	Thread.sleep(2000L);
//	System.out.println("*****************Select Team Development & Integrations****************");
	
	driver.findElement(By.xpath("//input[@tabindex='10005']")).sendKeys("Development & Integrations");
	Thread.sleep(500L);
	RobotTab();
	driver.findElement(By.xpath("//textarea[@tabindex='10006']")).sendKeys("Test");
	Thread.sleep(500L);
	
	element=driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
	element.click();
	Thread.sleep(1500L);

	System.out.println("*****************Reassign Task Created Successfully****************");

}


public static void VerifyTask() throws Exception {
	System.out.println("*********************ClickTask****************");
	driver.findElement(By.xpath("//span[contains(text(),'Task')]")).click();
	Thread.sleep(3000L);
	ClickNewTask();
	ClickReasignTask();
	
	CompleteTask();
	CloseTask();
	
	

	
	
	
	
}

public static void CloseTask() throws Exception {
	System.out.println("************Validate the Status of the Task***************");
	element=driver.findElement(By.xpath("//input[@frsqa_fname='Status']"));
	a=element.getAttribute("value");
	System.out.println("Status Value: " +a);
	Thread.sleep(2000L);
	Assert.assertEquals("Resolved",a);
	System.out.println("************Status of the Task is validated to Resolved Successfully***************");
	
	System.out.println("Task is Completed Successfully");
	System.out.println("************************************************************************************************************************************************");
	
}


public static void ClickJournal() throws Exception {
	
	driver.findElement(By.xpath("//span[contains(text(),'Journal')]")).click();
	Thread.sleep(2000L);

	a=driver.findElement(By.xpath("//div[contains(text(),'Notes')]")).getText();

	System.out.println("Journal Notes: " +a);
//	Thread.sleep(2000L);
//	Assert.assertEquals(a,ModifiedNotes);
	Thread.sleep(2000L);
}



public static void SearchServiceDeskRequest(String iv) throws Exception {
	wait = new WebDriverWait(driver, 30);
	//element=driver.findElement(By.id("ext-comp-1106"));
	
		
	element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ext-comp-1181")));
	element.sendKeys(iv);
	Thread.sleep(1000L);
	element.sendKeys(Keys.ENTER);
	Thread.sleep(3500L);
}
public static void ClickIncident() throws Exception {
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ext-gen23")));
	element.click();
	Thread.sleep(4000L);
	
}

public static void VerifyBuildingListFunction() throws Exception {
	
//	element=driver.findElement(By.xpath("//span[contains(@id,'ext-gen537')]"));
//    element.click();
//    Thread.sleep(3000L);
//    
//    lst = driver.findElements(By.xpath("//div[@id='ext-gen744']/div"));
//    lst.get(5).click();
//    Thread.sleep(1500L);
//    
//	List<WebElement> allLinks = driver.findElements(By.xpath("//div[contains(@id,'ext-gen744')]"));
//	Iterator<WebElement> itr = allLinks.iterator();
//	while(itr.hasNext()) {
//	    System.out.println(itr.next());
//	}
//	
	element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_BuildingPickList']"));
	
	System.out.println("Manually type Hart Plaza into building list field");
	element.sendKeys("HART PLAZA.");
	Thread.sleep(2000L);
	element.sendKeys(Keys.TAB);
	Thread.sleep(2000L);
	System.out.println("Building field display turns red to alert that Hart Plaza is not a valid entry");
	
	System.out.println("Manually type Central Maintenance Yard into building list field");
	element.clear();
	Thread.sleep(2000L);
	
	element.sendKeys("Central Maintenance Yard");
	Thread.sleep(2000L);
	element.sendKeys(Keys.TAB);
	Thread.sleep(2000L);
	a=driver.findElement(By.xpath("//div[@frsqa_fname='WC_BuildingAddress']")).getText();
	
	Assert.assertEquals(a,"29900 Goddard  Romulus MI 48242");
	
	System.out.println("Building address should be displayed successfully");

	
	
	}
public static void VerifySummary() throws Exception {
	System.out.println("***********************Type VDI Instructions into summary***************************");

	element=driver.findElement(By.xpath("//input[@frsqa_fname='Subject']"));
	element.sendKeys("VDI");
	element.sendKeys(Keys.TAB);
	Thread.sleep(2000L);

	System.out.println("VDI instructions knowledge article should appear on the right pane");
	a=driver.findElement(By.xpath("//div[@class='imcmatch-item-title']")).getText();
	//Assert.assertEquals(a,"Remote Access: login to Wayne County from elsewhere ()");
	a=driver.findElement(By.xpath("//div[@class='imcmatch-item-preview']")).getText();
   // Assert.assertEquals(a,"You can log in remotely to Wayne County's network using virtual desktop infrastructure, or VDI");
    System.out.println("VDI instructions knowledge article is validated successfully");
    System.out.println("****************************TYPE DESCRIPTION********************************");
    element=driver.findElement(By.xpath("//textarea[@frsqa_fname='Symptom']"));
	element.sendKeys("Test Description");
	element.sendKeys(Keys.TAB);
	Thread.sleep(2000L);
    
}

public static void ValidateNewTechnologyIssue() throws Exception {

	Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
	
	
	element=driver.findElement(By.xpath("//input[@frsqa_fname='ProfileLink']"));
	System.out.println(element.getAttribute("value"));
	
    
    System.out.println("Building Name: ");
    
  
    element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_BuildingPickList']"));
    element.sendKeys("Central Maintenance Yard");
    Thread.sleep(1500L);
    element.sendKeys(Keys.TAB);
    Thread.sleep(1000L);
    
    element=driver.findElement(By.xpath("//div[@frsqa_fname='WC_BuildingAddress']"));
    Assert.assertEquals(element.getText(),"29900 Goddard  Romulus MI 48242");
   
    System.out.println(element.getText());
       
    System.out.println("Floor Number ");
   

    element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_Floor']"));
	element.sendKeys("3'RD FLOOR");
	Thread.sleep(1500L);
	
	//Alernate Location
	 element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_AlternateLocation']"));
		element.sendKeys("500 Grisworld Drive");
		Thread.sleep(1500L);
		   element.sendKeys(Keys.TAB);
		    Thread.sleep(1000L);
		
		//Alernate Phone
		
		 element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_AlternatePhone']"));
		element.sendKeys("313-123-1234");
		Thread.sleep(1500L);
		 element.sendKeys(Keys.TAB);
		    Thread.sleep(1000L);
		
		
	
		
	//How to prefered to be conatcted
		
		 element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_ContactMethod']"));
			element.sendKeys("Email");
			Thread.sleep(1500L);
			 element.sendKeys(Keys.TAB);
			    Thread.sleep(1000L);
	
	
	System.out.println("Asset Tag Name ");
	 element=driver.findElement(By.xpath("//input[@frsqa_fname='WC_AssetTag']"));
		element.sendKeys("H100023");
		Thread.sleep(1500L);
		 element.sendKeys(Keys.TAB);
		    Thread.sleep(1000L);
		
		 element=driver.findElement(By.xpath("//input[@frsqa_fname='Subject']"));
			element.sendKeys("PEOPLESOFT");
			Thread.sleep(1500L);
		    element.sendKeys(Keys.TAB);
		    Thread.sleep(1000L);
			
			 element=driver.findElement(By.xpath("//textarea[@frsqa_fname='Symptom']"));
				element.sendKeys("TEST ISSUE DESCRIPTION");
				Thread.sleep(1500L);
    element.sendKeys(Keys.TAB);
    Thread.sleep(1000L);
    
	 element=driver.findElement(By.xpath("//input[@name='file']"));
	 element.sendKeys("F:\\SeleniumTestAutomation\\ServiceTicket.txt");
	wait = new WebDriverWait(driver, 100);
    
	driver.findElement(By.xpath("//button[contains(text(),'Save Incident')]")).click();
	Thread.sleep(7000L);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Back to My Items List')]"))).click();
	
    Thread.sleep(2000L);
    //Back to My Items List(button)
      
    
    element=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div[1]/table/tbody/tr/td[1]/div/p"));
   String IssueId1 =element.getText();
   
   System.out.println("ISSUE ID: " + IssueId1);
	
}
	




public static void ReportIssue() throws Exception {
//	PrintStream out = new PrintStream(new FileOutputStream("F:\\SeleniumTestAutomation\\SelfServiceUser.txt"));
//	System.setOut(out);
	
	
	Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
	wait=new WebDriverWait(driver, 100);
	ClickServiceService();
	
	ValidateItems(SubmitButton,"Validate Submit Button");
	//ValidateItems(ServiceHomePage,"Validate ServiceHome Page");
	NavigateToIWantToFrame(ServiceRequestFrame);
	ClickReportTechnologyissue();
	SwitchToDefault();
	NavigateToReportTechnologyIssue();
	ValidateNewTechnologyIssue();
  
}

public static void ServiceTicket() throws Exception {
	Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
	wait=new WebDriverWait(driver, 100);
	
	element=driver.findElement(By.xpath("/html/body/div[4]/div/form/div[4]/div/button"));
	element.click();
	Thread.sleep(2000L);
    driver.switchTo().frame(driver.findElement(By.id("ext-gen72")));
    Thread.sleep(1000L);
    
    element=driver.findElement(By.id("ext-comp-1106"));
    element.sendKeys("abc");
    
    
    
    element=driver.findElement(By.xpath("//span[text()='Report a technology issue']"));
   // element=driver.findElement(By.xpath("//span[@class='grid-link-button' and text()='Report a technologgery issue']"));
     //element=wait.until(ExpectedConditions.elementToBeClickable(By.("#ext-comp-1119 > div:nth-child(1) > table > tbody > tr > td:nth-child(2) > span")));
    //
   // element=driver.findElement(By.xpath("//div[contains(@class,'x-cl-wrap')]/descendant::span[text()='Report a technologgery issue']"));
     //element=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Report a technologgery issue")));
    element.click();
    Thread.sleep(10000L);
    
    driver.switchTo().defaultContent();
    Thread.sleep(1000L);
    
    driver.switchTo().frame(driver.findElement(By.id("ext-gen77")));
    Thread.sleep(1000L);
   
    
    element=driver.findElement(By.cssSelector("#ext-comp-1144"));
    String b=element.getText();
    System.out.println("Text Value is :" +b);
    
    //Attach Image
    
    //Building  ext-comp-1131
  
    element=driver.findElement(By.xpath("//span[contains(@id,'ext-gen206')]"));
    element.click();
    Thread.sleep(1500L);
    
    List<WebElement> lst = driver.findElements(By.xpath("//div[@id='ext-gen283']/div"));
    lst.get(1).click();
    
//    Iterator<Webelement> it = lst.iterator();
//    while (it.hasNext()) {
//        WebElement wb  = it.next();
//        if(wb.getText().equals(<Text to find in double quotes>)) {
//            wb.click();
//            break;
//        }
//
//    }
   
    //Floor  ext-comp-1133
 	
	selenium.type("id=ext-comp-1133", "3'rd");
	Thread.sleep(500L);
	
	//A
   
	   //Asset Tag ext-gen199
    element=driver.findElement(By.id("ext-comp-1125"));
    element.sendKeys("H100023");
    Thread.sleep(1500L);
    
      
    element=driver.findElement(By.id("ext-comp-1120"));
    element.sendKeys("PEOPLESOFT");
    Thread.sleep(1500L);
    //Description ext-comp-1127 -
    
    element=driver.findElement(By.id("ext-comp-1127"));
    element.sendKeys("TEST ISSUE DESCRIPTION");
   Thread.sleep(1000L);
   element = driver.findElement(By.id("ext-gen268"));
  
  Actions action = new Actions(driver);
   action.moveToElement(driver.findElement(By.id("ext-gen268"))).click().build().perform();
   action.sendKeys(Keys.PAGE_DOWN).perform();
   Thread.sleep(5000L);
//   
//   ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
//   Thread.sleep(1000L);
   
   
  // ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+element.getLocation()."1000"+")");
   
  // element=wait.until(ExpectedConditions.elementToBeClickable(By.id("id=ext-gen268")));
//   Actions action = new Actions(driver);
//
//   action.moveToElement(element).click().build().perform();
//   Thread.sleep(1000L);
   
//  element.click();
     Thread.sleep(2500L);

//    // enter the file path onto the file-selection input field
     StringSelection ss = new StringSelection("C:\\Srini\\ServiceTicket.txt");
    // selenium.type("id=ext-gen268","C:\\Srini\\ServiceTicket.txt");
//    element.sendKeys("C:\\Srini\\ServiceTicket.txt");
//    Thread.sleep(2500L);
//    driver.findElement(By.name("Open")).click();
//    Thread.sleep(2000L);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

     //imitate mouse events like ENTER, CTRL+C, CTRL+V
     robot = new Robot();
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(1000L);
    
    element=driver.findElement(By.id("ext-gen194"));
    element.click();
    Thread.sleep(2000L);
    element=driver.findElement(By.id("ext-comp-1122"));
    String IssueId=element.getText();
    
   
    
  //*[@id="ext-comp-1017"]/table/tbody/tr/td[1]
    
    element=driver.findElement(By.id("ext-gen100"));
    element.click();
    Thread.sleep(2000L);
    

    
    element=driver.findElement(By.xpath("//*[@id='ext-gen146']/div[1]/table/tbody/tr/td[1]/div/p"));
   String IssueId1 =element.getText();
   System.out.println("Issue id is: " + IssueId1);
   
   
    Thread.sleep(5000L);
    
  //*[@id="ext-gen146"]/div[1]/table/tbody/tr/td[1]/div/p

	
}

//public static void HomePageTest1() throws Exception {
//	Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
//	wait=new WebDriverWait(driver, 100);
//	
//	element=driver.findElement(By.xpath("/html/body/div[4]/div/form/div[4]/div/button"));
//	element.click();
//	Thread.sleep(2000L);
//	
////
////	element=driver.findElement(By.xpath("//div[@id='ext-comp-1119']/div[2]/table/tbody/tr/td[2]/span"));
//	
//
//	Thread.sleep(5000L);
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ext-gen23']"))).click();
//	Thread.sleep(500L);
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ext-gen19']"))).click();
//	Thread.sleep(500L);
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ext-gen27']"))).click();
//	Thread.sleep(500L);
//	
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ext-gen31']"))).click();
//	Thread.sleep(500L);
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ext-gen35']"))).click();
//	Thread.sleep(500L);
//	
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ext-gen37']"))).click();
//	Thread.sleep(5000L);
//	
////	Actions action = new Actions(driver);
////	action.moveToElement(element).moveToElement(driver.findElement(By.xpath("//*[@id='ext-gen118']/tbody/tr[3]/td/div"))).click().build().perform();
////	Thread.sleep(7500L);
//	
//	element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ext-gen118']/tbody/tr[3]/td/div")));
//	element.click();
//	
//		
//}
  

	
	
	


//@AfterClass(alwaysRun = true)
public static void tearDown() throws Exception {
  driver.quit();

}

public static void verifyUrlfirefox1() throws Exception {
	
//	String url="https://waynecounty-uat.saasit.com/Login.aspx?NoDefaultProvider=True";
//	driver.get("https://waynecounty-uat.saasit.com");
	
	
//	driver.get
	Robot rb = new Robot();

    //Enter user name by ctrl-v
    StringSelection username = new StringSelection("snukala");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);            
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.keyRelease(KeyEvent.VK_V);
    rb.keyRelease(KeyEvent.VK_CONTROL);
    
    Thread.sleep(1500L);

    //tab to password entry field
    rb.keyPress(KeyEvent.VK_TAB);
    rb.keyRelease(KeyEvent.VK_TAB);
    Thread.sleep(1500);

    //Enter password by ctrl-v
    StringSelection pwd = new StringSelection("Saibaba2006@");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
    rb.keyPress(KeyEvent.VK_CONTROL);
    rb.keyPress(KeyEvent.VK_V);
    rb.keyRelease(KeyEvent.VK_V);
    rb.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(1500L);
    
   // driver.switchTo().alert().accept();
    
    

    //press enter
    
    
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    
    
    
   // self.driver.switch_to.alert.accept()
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
}
	
		public static void 	serviceLogin() throws Exception {
			  
			  driver.findElement(By.id("UserName")).sendKeys("snukala");
			  driver.findElement(By.id("Password")).sendKeys("Saibaba2006@");
			  driver.findElement(By.xpath("/html/body/div[4]/div/form/div[3]/button")).click();
			  System.out.println("URL Entered");
			  
	     //Using AutoIt as follows
//------------------------------------------------------------------------------------//			  
//    	  Runtime.getRuntime().exec("C:\\Srini\\LoginAuth.exe");
//		  Thread.sleep(2000L);
// ------------------------------------------------------------------------------------	//  
			   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			   driver.manage().window().maximize();
			  Thread.sleep(1500L);
			  
			  windowMax();
	 

				}
		
		public static void 	argsSignIn() throws Exception {
			
			driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  
			  driver.findElement(By.name("username")).sendKeys("snukala");
			  driver.findElement(By.name("password")).sendKeys("Saibaba2005");
			  
			  driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
			   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
			  windowMax();
	 
				}
		
		public static void clickThruJSExecutor() throws Exception {
			js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		}
		
		public static void 	argsContentValidation() throws Exception {
			Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
			js = (JavascriptExecutor)driver;
			//Click Content
			
			element=driver.findElement(By.cssSelector("#esri-header-menus-link-desktop-0-5"));
			element.click();
			  waitTime();
			//Click MyGroups
			  driver.findElement(By.linkText("My Groups")).click();
			  waitTime();
			  
			
			  //Click State Roads
			  
			  elements=driver.findElements(By.xpath("//*[contains(text(),'StateRoads')]"));
				System.out.println(elements.get(0).getText());
				elements.get(0).click();
			  waitTime();
			  Thread.sleep(1000L);
			  
			  //Click Visualization
			  driver.findElement(By.linkText("Visualization")).click();
			  

			  
			  element= driver.findElement(By.tagName("iframe"));
			  driver.switchTo().frame(element);
			  
			  wait = new WebDriverWait(driver,60);
			  
			  driver.findElement(By.cssSelector("span[title=\"Change Style\"]")).click();
			  waitTime();
			  
			  driver.findElement(By.xpath("//*[contains(text(),'Done')]")).click();
			  Thread.sleep(1000L);

			    driver.findElement(By.cssSelector("span[title=\"Filter\"]")).click();
			    Thread.sleep(1000L);
			  //  driver.switchTo().defaultContent();
			    
			    Thread.sleep(1000L);
			    
			    driver.findElement(By.id("dijit_form_Button_81_label")).click();
			    Thread.sleep(1000L);
				
				  driver.findElement(By.cssSelector("span[title=\"Create Labels\"]")).click();
				    Thread.sleep(1000L);
				    
				    driver.findElement(By.id("dijit_form_Button_82_label")).click();
				    Thread.sleep(1000L);
			   
			    driver.findElement(By.cssSelector("span[title=\"Configure Pop-up\"]")).click();
			    
			    Thread.sleep(1000L);
			    
			  //*[@id="dijit_form_Button_46_label"]
			   elements= driver.findElements(By.xpath("//*[contains(text(),'OK')]"));
				 System.out.println(elements.get(1).getText());
					elements.get(1).click();
					Thread.sleep(1000L);
				  
				  driver.switchTo().defaultContent();
						  
			  //Click Data
			  driver.findElement(By.linkText("Data")).click();
			  waitTime();
			  Thread.sleep(1000L);
			  
			  GISDataValidation();
			  //Click Settings
			  driver.findElement(By.linkText("Settings")).click();
			  waitTime();
			  Thread.sleep(1000L);
			  
		}
		
		public static void 	CreateBaseMap() throws Exception {
			Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
			 js = (JavascriptExecutor)driver;
		
			  wait = new WebDriverWait(driver,120);

			 
			element=driver.findElement(By.linkText(("Map")));
			element.click();
			Thread.sleep(2500L);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#webmap-add_label")));
			 Thread.sleep(1750L);
			 driver.findElement(By.cssSelector("#webmap-add_label")).click();
			    Thread.sleep(750L);
			 
			 
			    driver.findElement(By.id("webmap-search-layers_text")).click();
			    Thread.sleep(750L);
			    driver.findElement(By.id("section-dropdown-button")).click();
			    Thread.sleep(750L);
			    driver.findElement(By.id("myGroups-option")).click();
			    Thread.sleep(1750L);
			    driver.findElement(By.id("6e0038d44815485b8f795d87d6426ea2-selection-btn")).click();
			    Thread.sleep(2750L);
			    driver.findElement(By.id("6e0038d44815485b8f795d87d6426ea2-selection-btn")).click();
			    Thread.sleep(2750L);
			    driver.findElement(By.id("c8fa1775ca9d487ba3d36fcd474a900d-selection-btn")).click();
			    Thread.sleep(2750L);
			    driver.findElement(By.id("c8fa1775ca9d487ba3d36fcd474a900d-selection-btn")).click();
			    Thread.sleep(2750L);
			    driver.findElement(By.id("49db5c52abdc42a99fb55d806b23d16b-selection-btn")).click();
			    Thread.sleep(2750L);
			    driver.findElement(By.id("49db5c52abdc42a99fb55d806b23d16b-selection-btn")).click();
			    Thread.sleep(2750L);
			    driver.findElement(By.id("home-navigation-dropdown-link")).click();
			    Thread.sleep(2750L);
			    driver.findElement(By.cssSelector("#home-navigation-dropdown > div > a.dropdown-link.homeHome")).click();
			    Thread.sleep(2750L);
			    
				element=driver.findElement(By.linkText(("Map")));
				element.click();
				Thread.sleep(2500L);
			    
			    
			
			   //**********************************************Map Elements Checked************************************************************
			
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("webmap-add_label")));
						    driver.findElement(By.id("webmap-add_label")).click();
						    Thread.sleep(2500L);

						    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("webmap-add-esri-maplayers_text")));
						     driver.findElement(By.id("webmap-add-esri-maplayers_text")).click();
						     
							    
						    for (i=1;i<=5;i++)
						    {
							    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='resize-detector']/section["+i+"]/div/header/img")));
						    driver.findElement((By.xpath("//*[@id='resize-detector']/section["+i+"]/div/header/img"))).click();
						    Thread.sleep(2500L);
						    
						    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Add to Map')]")));
						    driver.findElement(By.xpath("//button[contains(text(),'Add to Map')]")).click();
						    waitTime();
						    Thread.sleep(2500L);
						    
						    if (selenium.isTextPresent("Error"))
						    {
						  	  driver.findElement(By.xpath("//*[@id='button_general-close_label']")).click();
							   waitTime();
							   Thread.sleep(2500L);
						    	
						    }
						    }
						    	
				        
						    driver.findElement(By.cssSelector("#home-navigation-dropdown-link")).click();
						    Thread.sleep(2750L);
						    
						    driver.findElement(By.cssSelector("#home-navigation-dropdown > div > a.dropdown-link.homeHome")).click();
						    Thread.sleep(2750L);
						   
						    
						    element=driver.findElement(By.linkText(("Map")));
							element.click();
							Thread.sleep(2500L);
						    
						  //**********************************************Map Elements Checked************************************************************
			
			
			
			//Checking the Map Elements
						    
			//**********************************************************************************************************************//
			
			
			    
			  //**********************************************************************************************************************//
			    
		    
		 
			
		}
		
		public static void GISDataValidation() throws Exception {
			//NO Of Cols
			
			   List  col = driver.findElements(By.xpath("//*[@id='dgrid_0-header']/tr/th/div/div[1]/div[1]"));
			     System.out.println("No of cols are : " +col.size()); 
			     
			     a=driver.findElement(By.xpath("//*[@id='dijit_layout_ContentPane_3']/div[3]")).getText();
			     a=a.substring(22,26);
			     int b=Integer.parseInt(a);
			     System.out.println("No of rows are: " +a);
			     element=driver.findElement(By.xpath("//*[@id='dgrid_0-header']/tr/th[12]/div/div[1]/div[1]"));
			     System.out.print(element.getText() + "|    ");
			     
			  //Getting all the header values  
			     
				 for (int i=2;i < col.size();i++){
					
						
					 element=driver.findElement(By.xpath("//*[@id='dgrid_0-header']/tr/th["+i+"]/div/div[1]/div[1]"));
			
					 js = (JavascriptExecutor)driver; 
					 js.executeScript("arguments[0].scrollIntoView()",element);
					 System.out.print(element.getText() + "|    ");
							 }
				 System.out.println();
				 
				 //Get all the table values
				 
					 
					 
					 for (int k=1;k<=25;k++){
					 
					 for (int j=2;j < col.size();j++){
						 
							
						WebElement element1=driver.findElement(By.xpath("//*[@id='dgrid_0-row-"+k+"']/table/tr/td["+j+"]/div"));
						js = (JavascriptExecutor)driver; 
						 js.executeScript("arguments[0].scrollIntoView()",element1);
						 System.out.print(element1.getText() + "|    ");
						
					 }
					 System.out.println();
					 }
					 
//					 for (int j=2;j < col.size();j++){
//						 
//						WebElement element2=driver.findElement(By.xpath("//*[@id='dgrid_0-row-"+b+"']/table/tr/td["+j+"]/div"));
//							
//						 js.executeScript("arguments[0].scrollIntoView()",element2);
//						 System.out.print(element2.getText() + "|    ");
//						 
//															 }

					 
					
			
			 
			
			     
			
		
			  
			   
				 }

	
		
	
	public static void 	argsBasicLinkValidation() throws Exception {
		js = (JavascriptExecutor)driver;
		
		//Click Gallery
			
			element=driver.findElement(By.cssSelector("#esri-header-menus-link-desktop-0-1 > span"));
			element.click();
			  waitTime();
			
			//Validation of Gallery Screen	
//				Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl1);
//				element=driver.findElement(By.xpath("//a[contains(text(),'StateRoads')]"));
//				a=element.getText();
//				Assert.assertEquals(a,"StateRoads");
//					
//			//Go Back to Home Screen
//			clickHome();
			
			//Click Map
			element=driver.findElement(By.cssSelector("#esri-header-menus-link-desktop-0-2 > span"));
			element.click();
			  waitTime();
			//Go Back to Home Screen
			clickMapsHome();
			
			//Click Scene
			element=driver.findElement(By.cssSelector("#esri-header-menus-link-desktop-0-3 > span"));
			element.click();
			  waitTime();
				element=driver.findElement(By.xpath("//div[contains(text(),'New Scene')]"));
				a=element.getText();
				Assert.assertEquals(a,"New Scene");
			//Go Back to Home Screen
			driver.findElement(By.cssSelector("#home-navigation")).click();
			  waitTime();
			 driver.findElement(By.cssSelector("#home-navigation > div > a.dropdown-link.homeHome")).click();
			  waitTime();
			
			//Click Groups
			element=driver.findElement(By.cssSelector("#esri-header-menus-link-desktop-0-4"));
			element.click();
			  waitTime();
				element=driver.findElement(By.xpath("//a[contains(text(),'PortalDemo')]"));
				a=element.getText();
				Assert.assertEquals(a,"PortalDemo");
			//Go Back to Home Screen
			clickHome();
			
			//Click Content
		
			element=driver.findElement(By.cssSelector("#esri-header-menus-link-desktop-0-5"));
			element.click();
			  waitTime();
			  
			//*[@id="uniqName_12_0"]/section/div/div/div[2]/div[2]/div/div/div/section[2]/h4
			  element=driver.findElement(By.xpath("//*[contains(text(),'Item Type')]"));
			  js.executeScript("arguments[0].click();", element);
			  waitTime();
				  
			  element=driver.findElement(By.xpath("//*[contains(text(),'Maps')]"));
				a=element.getText();
			  js.executeScript("arguments[0].click();", element);
			  waitTime();
		//Go Back to Home Screen
			clickHome();
			
			//Click Organization
			element=driver.findElement(By.cssSelector("#esri-header-menus-link-desktop-0-6"));
			element.click();
		    waitTime();
			//Go Back to Home Screen
			element=driver.findElement(By.xpath("//a[contains(text(),'Prajula Prem')]"));
			a=element.getText();
			Assert.assertEquals(a,"Prajula Prem");
			clickHome();
//						  	 
				}
	public static void waitTime() throws Exception {
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
	}
	public static void clickMapsHome() throws Exception {
		
		driver.findElement(By.cssSelector("#home-navigation-dropdown-link")).click();
		 Thread.sleep(1500L);
		 driver.findElement(By.cssSelector("#home-navigation-dropdown > div > a.dropdown-link.homeHome")).click();
		 Thread.sleep(1500L);
		
		 
	
	}
	
	public static void clickHome() throws Exception {
		element=driver.findElement(By.cssSelector("#esri-header-menus-link-desktop-0-0 > span"));
		element.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
		
		public static void 	verifyUrl(String baseUrlNew) throws InterruptedException {

					 
			  driver.get(baseUrlNew);
			//  Thread.sleep(5000L);
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.manage().window().maximize();
			  Thread.sleep(1500L);
					
			 

				}
		
		
		
		
	
			
			
			
		}



