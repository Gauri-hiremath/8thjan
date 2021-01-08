package com.MavenFirstProject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	 public static WebDriver driver=null;
	 
	 public DashboardPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//h1")
	 private WebElement PageHeader;
	 
	 @FindBy(xpath="//h3")
     private List<WebElement> coursesnames;
	 
	 
	 public void verifyCourses() {
		for(WebElement element: coursesnames) {
			 element.isDisplayed();
		 }
	 }
	 
}
