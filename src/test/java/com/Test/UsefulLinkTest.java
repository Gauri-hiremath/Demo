package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ObjectRepositary.UsefulLinkRepo;
import com.Pages.UsefulLink;


public class UsefulLinkTest extends TestBase{
	WebDriver driver;
	UsefulLink ut;
	
@BeforeMethod
public void setup() throws Exception {
	driver=initilization();
        ut=new UsefulLink(driver);
		}
@Test
public void usefulLinksList1() {
Assert.assertTrue(ut.usefullinkList());
}

@Test
public void schedule1() {
	Assert.assertTrue(ut.schedule());
}

@Test
public void  videoLacturesAllTopics1() {
	Assert.assertTrue(ut.videoLacturesAllTopics());
}

@Test
public void seleniumInterviewQuestions1() {
	Assert.assertTrue(ut.seleniumInterviewQuestions());
}

@Test
public void javaInterviewQuestions1() {
	Assert.assertTrue(ut.javaInterviewQuestions());
}

@Test
public void courses1() {
	Assert.assertTrue(ut.courses());
}

@Test
public void placement1() {
	Assert.assertTrue(ut.placement());
}
@Test
public void downloadmethod() {
	dp1=ut.navigatetodownloadsmethod();
	 String actTitle =driver.getTitle();
	 String expTitle="JavaByKiran | Downloads";
		Assert.assertEquals(actTitle, expTitle);
}
}













