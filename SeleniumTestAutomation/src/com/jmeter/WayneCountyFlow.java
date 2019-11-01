package com.jmeter;


import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WayneCountyFlow  {


	static WebDriver driver;
	static JavascriptExecutor js;
	static String baseUrl="https://www.waynecounty.com";
	static WebElement element;
	static String a;
@Test
	public void testCase() throws Exception {
		System.setProperty("webdriver.gecko.driver",".\\geckodriver.exe");
	  	driver = new FirefoxDriver();
		
//		driver = new ChromeDriver();
//		 System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
//    	 
//    	 ChromeOptions options = new ChromeOptions();
//    	 options.addArguments("start-maximized");
//    	 options.addArguments("disable-infobars");
	    driver.get(baseUrl + "/");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  Thread.sleep(5000L);
		//  Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);
			// SoftAssert softAssertion= new SoftAssert();
			js = (JavascriptExecutor)driver;
		
				System.out.println("Navigated to Wayne County Page");
				Thread.sleep(500L);
					
				//Click Departments & Offices
				element=driver.findElement(By.xpath("//*[@id='mainPusher']/div/div[1]/div[1]/div/div[1]/div[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				

				//Click Elected Offices
				
				element=driver.findElement(By.xpath("//*[@id='mm-0']/ul/li[2]/a[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//Click Executive
				element=driver.findElement(By.xpath("//*[@id='mm-1']/ul/li[1]/a[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//Click Home
				
				element=driver.findElement(By.xpath("//*[@id='mm-2']/ul/li[1]/a"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//Click State of the County
				element=driver.findElement(By.xpath("//*[@id='primary_nav']/a[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				a=driver.findElement(By.xpath("//*[@id='mainPusher']/div/div[2]/div/div[1]/article/h2")).getText();
				//System.out.println("State of County Text: " +a);
				//softAssertion.assertEquals(a,"State of the County");
			
				
				//Click Biography
				element=driver.findElement(By.xpath("//*[@title='Biography']"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				a=driver.findElement(By.xpath("//*[@id='mainPusher']/div/div[2]/div/div[1]/article/h2")).getText();
			//	System.out.println("State of County Text: " +a);
				//softAssertion.assertEquals(a,"Biography");
			
				
				//Click Administration Accomplishments
				element=driver.findElement(By.xpath("//*[@title='Administration Accomplishments']"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				a=driver.findElement(By.xpath("//*[@id='mainPusher']/div/div[2]/div/div[1]/article/h2")).getText();
			//	System.out.println("State of County Text: " +a);
			//	softAssertion.assertEquals(a,"Administration Accomplishments");
				
				
				
				//Click 	Inside Wayne County
				element=driver.findElement(By.xpath("//*[@title='Inside Wayne County']"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				a=driver.findElement(By.xpath("//*[@id='mainPusher']/div/div[2]/div/div[1]/article/h2")).getText();
			//	System.out.println("State of County Text: " +a);
				//softAssertion.assertEquals(a,"Inside Wayne County");
			
				
				//Click News & Resources
				element=driver.findElement(By.xpath("//*[@title='News & Resources']"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				a=driver.findElement(By.xpath("//*[@id='mainPusher']/div/div[2]/div/div[1]/article/h2")).getText();
			//	System.out.println("State of County Text: " +a);
			//	softAssertion.assertEquals(a,"News & Resources");
			
				
				//Click Contact Us
				element=driver.findElement(By.xpath("//*[@title='Contact Us']"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				element=driver.findElement(By.xpath("//*[@id='primary_nav']/div/div/a[1]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				
				a=driver.findElement(By.xpath("//*[@id='mainPusher']/div/div[2]/div/div[1]/article/h2")).getText();
			//	System.out.println("State of County Text: " +a);
				//softAssertion.assertEquals(a,"Contact Us");
				
			//	softAssertion.assertAll();
				
				//close submenu
				
				element=driver.findElement(By.xpath("//*[@id='rd-nav-slide-menu']/div[1]/div[2]/a[1]/span"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//Click Departments & Offices
				
				element=driver.findElement(By.xpath("//*[@id='mainPusher']/div/div[1]/div/div/div[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
					
				
				//click comission
				element=driver.findElement(By.xpath("//*[@id='mm-1']/ul/li[2]/a[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//click commisioners
				
				
				element=driver.findElement(By.xpath("//*[@id='mm-4']/ul/li[2]/a[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//close submenu commisioners
				element=driver.findElement(By.xpath("//*[@id='rd-nav-slide-menu']/div[1]/div[2]/a[1]/span"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//click committes
				
				//*[@id="mm-4"]/ul/li[3]/a[2]
				element=driver.findElement(By.xpath("//*[@id='mm-4']/ul/li[3]/a[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//close submenu committes
				element=driver.findElement(By.xpath("//*[@id='rd-nav-slide-menu']/div[1]/div[2]/a[1]/span"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//click departments
				element=driver.findElement(By.xpath("//*[@id='mm-4']/ul/li[4]/a[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//close submenu departments
				element=driver.findElement(By.xpath("//*[@id='rd-nav-slide-menu']/div[1]/div[2]/a[1]/span"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
		        
				
				
				//click News & Resources
				element=driver.findElement(By.xpath("//*[@id='mm-4']/ul/li[5]/a[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//close submenu News & Resources
				element=driver.findElement(By.xpath("//*[@id='rd-nav-slide-menu']/div[1]/div[2]/a[1]/span"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				
				//Close Main Submenu
				element=driver.findElement(By.xpath("//*[@id='rd-nav-slide-menu']/div[1]/div[2]/a[1]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//Click Clerk---------------------------Details Inside----------------------------------------------
				element=driver.findElement(By.xpath("//*[@id='mm-1']/ul/li[3]/a[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				//Elections---Till----- News & resources----------------------------------------------
				
				for (int i=2;i<=3;i++)
					
				element=driver.findElement(By.xpath("//*[@id='mm-12']/ul/li["+i+"]/a[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				element=driver.findElement(By.xpath("//*[@id='rd-nav-slide-menu']/div[1]/div[2]/a[1]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				
				element=driver.findElement(By.xpath("//*[@id='mm-12']/ul/li[4]/a"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				//Click Departments & Offices
				
				element=driver.findElement(By.xpath("//*[@id='mainPusher']/div/div[1]/div/div/div[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
						
				for (int i=5;i<=6;i++)
					
					
				{
					
				element=driver.findElement(By.xpath("//*[@id='mm-12']/ul/li["+i+"]/a[2]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				
				element=driver.findElement(By.xpath("//*[@id='rd-nav-slide-menu']/div[1]/div[2]/a[1]"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
				}
				
				element=driver.findElement(By.xpath("//*[@id='mm-12']/ul/li[7]/a"));
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(1000L);
	            driver.quit();

		}

	}

