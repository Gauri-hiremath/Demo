package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pages.DashboardPage;
import com.Pages.DownloadPage;
import com.Pages.Operators;
import com.Pages.UsefulLink;
import com.Pages.UserPage;

public class TestBase  {
public static WebDriver driver;	
public static DashboardPage dp=null;
public static DownloadPage dp1=null;
public static Operators ot=null;
public static UsefulLink ut=null;
public static UserPage up=null;

public static WebDriver initilization() throws Exception {
	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	FileInputStream fis=new FileInputStream("config.properties");
	Properties property=new Properties();
	property.load(fis);
	driver.get(property.getProperty("url"));
	return driver;
	}
}
















