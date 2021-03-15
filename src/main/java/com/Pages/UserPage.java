package com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ObjectRepositary.UsersRepo;

public class UserPage extends UsersRepo{
	WebDriver driver;
 public UserPage(WebDriver driver){
  this.driver=driver;
  PageFactory.initElements(driver,this );
}
 
 public boolean userlist() {
		String acthead= header.getText();
		String exphead="User List";
		if (acthead.equals(exphead)) {
		System.out.println("Header matched");	
		}
		return true;
}
 public boolean usersnamelist() {
	 ArrayList<String>explist=new ArrayList<>();
		explist.add("#");
		explist.add("Username");
		explist.add("Email");
		explist.add("Mobile");
		explist.add("Course");
		explist.add("Gender");
		explist.add("State");
		explist.add("Action");
		
 ArrayList<String>actlist=new ArrayList<>();
 for(WebElement users: usernamelist2) {
 	actlist.add(users.getText());
 	System.out.println("list : "+usernamelist2);
 }
	return true;
	 
 }
 public Operators navigatetooperatorpage() {
	 operators11.click();
	 return new Operators(driver);
 }
 }











