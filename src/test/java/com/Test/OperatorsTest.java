package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.Operators;
import com.Pages.UserPage;

public class OperatorsTest extends TestBase {
WebDriver driver;
Operators ot;

@BeforeMethod
public void setup() throws Exception {
	driver=initilization();
        ot=new Operators(driver);
		}

@Test
public void operator1() {
  Assert.assertTrue(ot.operator());	
}
@Test
public void operatorlist1() {
	Assert.assertTrue(ot.operatorlist());
}

@Test
public void usefulLinkmethod() {
	ut=ot.navigatetousefullinksmethod();
	String actTitle=driver.getTitle();
	String expTitle="JavaByKiran | Useful Links";
	Assert.assertEquals(actTitle, expTitle);
}
}










