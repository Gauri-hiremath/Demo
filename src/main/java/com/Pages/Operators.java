package com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ObjectRepositary.OperatorsRepo;

public class Operators extends OperatorsRepo {
 WebDriver driver;
 public Operators(WebDriver driver) {
 this.driver=driver;
 PageFactory.initElements(driver, this);
}
 
 public boolean operator() {
		String exphead=Header.getText();
		String acthead="Operators";
		if (acthead.equals(exphead)) {
			System.out.println("Title matched");
		}
		return true;
}
 public boolean operatorlist() {
 ArrayList<String> explist=new ArrayList<>();
	explist.add("ID");
	explist.add("Person");
	explist.add("For");
	explist.add("Prefered Way to Connect");
	explist.add("Contact");
	explist.add("Timings");
	
	ArrayList<String>actlist=new ArrayList<String>();
	for(WebElement opelist : OperatorsList) {
	   actlist.add(opelist.getText());
		}
	return true;
}
 public UsefulLink navigatetousefullinksmethod() {
	 usefulLinks11.click();
	 return new  UsefulLink(driver);
 }
}









