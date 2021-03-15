package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pages.UsefulLink;
import com.Pages.UserPage;

public class UserTest  extends TestBase{
	WebDriver driver;
	UserPage up;
	
@BeforeMethod
public void setup() throws Exception {
	driver=initilization();
        up=new UserPage(driver);
		}
@Test
public void userlist1() {
	Assert.assertTrue(up.userlist());
}

@Test
public void usersnamelist1() {
Assert.assertTrue(up.usersnamelist());
}

@Test
public void operatormethod() {
	ot=up.navigatetooperatorpage();
	String actTitle=driver.getTitle();
	String expTitle="JavaByKiran | Operators";
	Assert.assertEquals(actTitle, expTitle);
}
}








