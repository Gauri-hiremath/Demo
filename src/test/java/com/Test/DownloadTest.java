package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.DownloadPage;

public class DownloadTest  extends TestBase {
	WebDriver driver;
	DownloadPage dp1;
	@BeforeMethod
	public void setup() throws Exception {
		driver=initilization();
		dp1=new DownloadPage(driver);
	}
	
	@Test
	public void verifyTitle1() {
Assert.assertTrue(dp1.verifytitle());	
	}
@Test
public void tableVisibility1() {
	Assert.assertTrue(dp1.tableVisibility());
}

@Test
public void countHeaderAndRows1() {
	Assert.assertTrue(dp1.countHeaderAndRows());
}

@Test
public void verifyTableHeader1() {
	Assert.assertTrue(dp1.verifyTableHeader());
}

@Test
public void sortingOfVendorName1() {
	Assert.assertTrue(dp1.sortingOfVendorName());
}
@Test
public void vendorVersion1() {
	Assert.assertTrue(dp1.vendorVersion());
}

@Test
public void vendorNameWithSelenium1() {
	Assert.assertTrue(dp1.vendorNameWithSelenium());
}

@Test
public void VendorWithGoogle1() {
	Assert.assertTrue(dp1.VendorWithGoogle());
}

@Test
public void WindowHandler1() throws Exception {
	Assert.assertTrue(dp1.WindowHandler());
}
@Test
public void checkInsertion1() {
	Assert.assertTrue(dp1.checkInsertion());
}

@Test
public void JDK1() throws Exception {
	Assert.assertTrue(dp1.JDK());
}
@Test
public void SeleniumServerStandalonJar1() {
	Assert.assertTrue(dp1.SeleniumServerStandalonJar());
}

@Test
public void SeleniumServerSourceJar1() {
	Assert.assertTrue(dp1.SeleniumServerSourceJar());
}

@Test
public void GoogleChrome1() {
	Assert.assertTrue(dp1.GoogleChrome());
}

@Test
public void GoogleChromeDriver1() {
	Assert.assertTrue(dp1.GoogleChromeDriver());
}

@Test
public void MozillaFirefox1() {
	Assert.assertTrue(dp1.MozillaFirefox());
}

@Test
public void GeckoDriverforLatestfirefox1() {
	Assert.assertTrue(dp1.GeckoDriverforLatestfirefox());
}

@Test
public void Logout1(){
Assert.assertTrue(dp1.Logout());
}

@Test
public void dashboardpage () {
	dp=dp1.navigatetoDashboard();
	String actTitle=driver.getTitle();
	String expTitle="JavaByKiran | Dashboard";
	Assert.assertEquals(actTitle, expTitle);
	
}
}






