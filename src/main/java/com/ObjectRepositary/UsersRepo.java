package com.ObjectRepositary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersRepo {
	
@FindBy(xpath = "//div[@class='box-header']//following::h3")
public WebElement header;

@FindBy(xpath = "//div[@class='box-body table-responsive no-padding']//following::th")
public List<WebElement> usernamelist2;

@FindBy(xpath="//span[text()='Operators']")
public WebElement operators11;
}
