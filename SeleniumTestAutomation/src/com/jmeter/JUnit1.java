package com.jmeter;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JUnit1 {
	private WebDriver driver;
	private String baseUrl="https://www.waynecounty.com";

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



