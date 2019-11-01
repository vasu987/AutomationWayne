package com.wcblast;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.servicedesk.com.MainServiceDesk;

public class WCBlastBasicFlow extends MainServiceDesk{
	protected static WebDriver driver;
@Test
	public static void BlastBasicFlow()  throws Exception {
	
	//seleniumGrid(url);
	//verifyUrlfirefox1();
	regularChrome(blasturl);
	 WcBlastFlow();
	 tearDown();
}
}
