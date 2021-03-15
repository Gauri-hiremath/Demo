package com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import com.ObjectRepositary.UsefulLinkRepo;
import com.Utility.CommonOperation;

public class UsefulLink extends UsefulLinkRepo{
	WebDriver driver;
 public UsefulLink(WebDriver driver){
  this.driver=driver;
  PageFactory.initElements(driver,this );
}
 
 public boolean  usefullinkList() {
		ArrayList<String>explinks=new ArrayList<>();
		explinks.add("Sr");
		explinks.add("Content");
		explinks.add("Click");
		
		ArrayList<String>actlinks=new ArrayList<>();
		for(WebElement links : UsefulLinkList)
		{
			actlinks.add(links.getText());
		}
		return true;
		}
 
 public boolean schedule() {
	 Schedule.click();
		return true;
}
 
 public boolean videoLacturesAllTopics() {
	 VideoLacturesAllTopics.click();
		return true;
}
 
 public boolean seleniumInterviewQuestions() {
	 SeleniumInterviewQuestions.click();
		return true;
}
 
 public boolean javaInterviewQuestions() {
	 JavaInterviewQuestions.click();
		return true;
}
 
 public boolean courses() {
	 Courses.click();
		return true;
}
 
 public boolean placement() {
	 Placement.click();
		return true;
	}
 public DownloadPage navigatetodownloadsmethod() {
	downloads11.click();
	 return new  DownloadPage(driver);
 }
}











