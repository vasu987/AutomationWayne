package com.jar;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JUnit1 {
	private WebDriver driver;
	public String mType;
	private String baseUrl="https://www.waynecounty.com";
	public JUnit1 () {
	    mType = "SHUTTLE";
	  }

	  public JUnit1 (String typeOfShip) {
	    mType = typeOfShip;
	  }

	    public String getType() {
	      return mType;
	    }

	    public void setType(String type) {
	      mType = type;
	    }

	@Test
	public void test() throws InterruptedException {
		fail("Not yet implemented");
		System.setProperty("webdriver.gecko.driver",".\\geckodriver.exe");
	  	driver = new FirefoxDriver();
		  driver.get(baseUrl + "/");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  Thread.sleep(5000L);
					
			System.out.println("Navigated to Wayne County Page");
			Thread.sleep(500L);
			driver.quit();
	

}
}



