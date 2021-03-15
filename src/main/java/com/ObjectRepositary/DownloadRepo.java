package com.ObjectRepositary;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadRepo {
	
@FindBy(tagName ="h1")
public WebElement title;

@FindBy(tagName ="table")
public WebElement Table;

@FindBy(tagName ="tr")
public List<WebElement> row;

@FindBy(tagName ="th")
public List<WebElement> header;

@FindBy(xpath="//th")
public List<WebElement> list;

@FindBy(xpath="//td[3]")
public List<WebElement> list1;

@FindBy(xpath="//td[4]")
public List<WebElement>  list2;

@FindBy(xpath = "//span[text()='Official Website']")
public List<WebElement> links;

@FindBy(xpath = "//tr[4]//td[3]//following::tr[1]//td[3]")
public WebElement ele;

@FindBy(xpath = "//tr[2]//td[8]/a")
public WebElement jdk;


@FindBy(xpath = "//tr[3]//td[8]/a")
public WebElement seleniumserverstandalonjar;

@FindBy(xpath = "//tr[4]//td[8]/a")
public WebElement seleniumserversourcejar;

@FindBy(xpath ="//tr[5]//td[8]/a")
public WebElement googlechrome;

@FindBy(xpath ="//tr[6]//td[8]/a")
public WebElement googlechromedriver;

@FindBy(xpath ="//tr[7]//td[8]/a")
public WebElement mozillafirefox;

@FindBy(xpath ="//tr[8]//td[8]/a")
public WebElement geckoDriverforLatestfirefox;

@FindBy(xpath = "//a[text()='LOGOUT']")
public WebElement logout;

@FindBy(xpath = "//span[text()='Dashboard']")
public WebElement dashboard11;
}
















