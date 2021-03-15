package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.DashboardPage;
import com.Pages.DownloadPage;

public class DashboardTest  extends TestBase{
	WebDriver driver;
	DashboardPage dp;
	
	@BeforeMethod
	public void setup() throws Exception {
		driver=initilization();
		dp=new DashboardPage(driver);
	}
	
@Test
public void dashboardheading1() {
	Assert.assertTrue(dp.dashboardheading());
}

@Test
public void courses1() {
	Assert.assertTrue(dp.courses());
}
@Test
public void verifycourses1() {
	Assert.assertTrue(dp.verifycourses());
}
@Test
public void dashboardcontent1() {
    Assert.assertTrue(dp.dashboardcontent());
}

@Test
public void automationtesting1() {
	Assert.assertTrue(dp.automationtesting());
}

@Test
public void softwaredevelopment1() {
	Assert.assertTrue(dp.softwaredevelopment());
}
@Test
public void datascience1() {
	Assert.assertTrue(dp.datascience());
}

@Test
public void wevdevelopment1() {
	Assert.assertTrue(dp.webdevlopment());
}
@Test
public void JavaByKiran1() {
	Assert.assertTrue(dp.JavaByKiran());
}

@Test
public void UserpageMethod() {
	up=dp.navigatetouserpage();
	String actTitle=driver.getTitle();
	String expTitle="JavaByKiran | User";
	Assert.assertEquals(actTitle, expTitle);
}

}
	













