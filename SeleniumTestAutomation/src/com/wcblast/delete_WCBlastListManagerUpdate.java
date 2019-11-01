package com.wcblast;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.servicedesk.com.MainServiceDesk;

import junit.framework.Assert;
import net.bytebuddy.utility.RandomString;

public class delete_WCBlastListManagerUpdate extends MainServiceDesk {
	
	protected static WebDriver driver;
@Test
	public static void BlastBasicFlow() throws Exception {

	 regularChrome(blasturl);
//	seleniumGrid(url);
	 BlastEmailUpdate();
	 tearDown();
}
}

