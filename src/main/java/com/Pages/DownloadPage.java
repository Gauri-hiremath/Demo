package com.Pages;
import com.ObjectRepositary.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DownloadPage extends DownloadRepo {
	WebDriver driver;
	
	public DownloadPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	
public boolean verifytitle() {
		String actTitle =title.getText();
		System.out.println("Actual Title is --------" + actTitle);
		String expTitle = "Downloads";
		if(actTitle.equals(expTitle)) {
			System.out.println("Title matched");
		return  true;
		}
	return false;
	}

public boolean tableVisibility() {
	 boolean table = Table.isDisplayed();
	 return true;
}

public boolean countHeaderAndRows() {
    boolean table = Table.isDisplayed();
	System.out.println("No. of Rows: " + row.size());// No. of rows=8
	System.out.println("No. of header: " + header.size());
	return true;
}

public boolean verifyTableHeader() {
	ArrayList<String> actHeader = new ArrayList<String>();
	for (WebElement ele : list) {
		actHeader.add(ele.getText());//
	}
	System.out.println(actHeader);
	ArrayList<String> expHeader = new ArrayList<>();
	expHeader.add("Sr");
	expHeader.add("Name");
	expHeader.add("vendor");
	expHeader.add("Version");
	expHeader.add("32bit");
	expHeader.add("64bit");
	expHeader.add("Common");
	expHeader.add("Official Source\n" + "*For prevoius and latest releases");
	System.out.println(expHeader);
	return true;
}

public boolean sortingOfVendorName() {
	ArrayList<String> vendorArr = new ArrayList<>();
	for (WebElement ele : list1) {
		vendorArr.add(ele.getText());
	}
	System.out.println("Before sorting: " + vendorArr);
	Collections.sort(vendorArr);
	System.out.println("After sorting in ascending Order: " + vendorArr);
	Collections.sort(vendorArr, Collections.reverseOrder());
	System.out.println("After sorting in descending Order: " + vendorArr);
	return true;
}

public boolean  vendorVersion() {
	for(int i=0; i<list1.size(); i++){
		//for vendorName having version 76.0
		String version=list2.get(i).getText();
		//for jdk version
		String vendor=list1.get(i).getText();
		if(version.contains("76.0") && vendor.contains("(JDK)")){
			System.out.println(list1.get(i).getText()+" =having version:76.0");
			System.out.println("Version of JDK is: "+list2.get(i).getText());
			}
		return true;
}	
	return false;
}

public boolean vendorNameWithSelenium() {
	for (WebElement ele : list1) {
		if (ele.getText().contains("Selenium")) {
			System.out.println("vendor name: " + ele.getText());
		}
	}
	return true;
}

public boolean VendorWithGoogle() {
ArrayList<String> vendorName = new ArrayList<>();
	for (int i = 0; i < list1.size(); i++) {
		if (list.get(i).getText().contains("Google")) {
			vendorName.add(list.get(i).getText());
		}
	System.out.println(vendorName);
	System.out.println("No. of vendors with google name: " + vendorName.size());
	return true;
}
	return false;
	}


public boolean WindowHandler() throws Exception{
	String mainWindowId=driver.getWindowHandle();
	  for(WebElement link:links){
	  link.click();
	 
	 }
	Set<String> childWindowId=driver.getWindowHandles();
	for(String id:childWindowId){
		if(!id.equals(mainWindowId)){
			System.out.println("id of child window :" +id);
			driver.switchTo().window(id);
			System.out.println(driver.getCurrentUrl());
		    Thread.sleep(3000);
		    //driver.close();
			}
		else 
	        System.out.println("i am on old window");
	}
	return true;
	}

public boolean checkInsertion() {
	String act = ele.getText();
	String exp = "Google Chrome";
	return true;
}

public boolean JDK() throws Exception {
	jdk.click();
	return true;
}

public boolean SeleniumServerStandalonJar()  {
	seleniumserverstandalonjar.click();
	return true;
}

public boolean SeleniumServerSourceJar() {
	seleniumserversourcejar.click();
	return true;
}
public boolean GoogleChrome() {
	googlechrome.click();
	return true;
}

public boolean GoogleChromeDriver() {
	googlechromedriver.click();
	return true;
}

public boolean MozillaFirefox() {
	mozillafirefox.click();
	return true;
}

public boolean GeckoDriverforLatestfirefox() {
	geckoDriverforLatestfirefox.click();
	return true;
}

public boolean Logout() {
	 logout.click();
	return true;
}

public DashboardPage navigatetoDashboard() {
	dashboard11.click();
	return new DashboardPage(driver);
	
}
}










