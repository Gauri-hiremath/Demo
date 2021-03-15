package com.ObjectRepositary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorsRepo {

@FindBy(xpath = "//span[text()='Operators']")
public WebElement Header;

@FindBy(xpath = "//table[@class='table table-hover']//th")
public List<WebElement> OperatorsList;

@FindBy(xpath="//span[text()='     Useful Links']")
public WebElement usefulLinks11;
}
