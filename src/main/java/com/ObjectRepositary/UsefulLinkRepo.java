package com.ObjectRepositary;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsefulLinkRepo {
	/*
	 * WebDriver driver;
	 * 
	 * @FindBy(xpath="//input[@id='email']") public WebElement email;
	 * 
	 * @FindBy(xpath="//input[@id='password']") public WebElement pass;
	 * 
	 * @FindBy(xpath="//button") public WebElement loginbutton;
	 * 
	 * @FindBy(xpath="//span[text()='     Useful Links']") public WebElement
	 * UsefulLinks1;
	 */

@FindBy(tagName = "th")
public List <WebElement> UsefulLinkList;

@FindBy(xpath = "//tr[2]//td[3]/a")
public WebElement Schedule;

@FindBy(xpath = "//tr[3]//td[3]/a")
public WebElement VideoLacturesAllTopics;

@FindBy(xpath = "//tr[4]//td[3]/a")
public WebElement SeleniumInterviewQuestions;

@FindBy(xpath = "//tr[5]//td[3]/a")
public WebElement JavaInterviewQuestions;

@FindBy(xpath = "//tr[6]//td[3]/a")
public WebElement  Courses;

@FindBy(xpath = "//tr[7]//td[3]/a")
public WebElement  Placement;

@FindBy(xpath = "//span[text()='Downloads']")
public WebElement  downloads11;
}












