package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.MavenFirstProject.DashboardPage;
public class DashboardTest {
	WebDriver driver;
	  @Test public void test1() {
	  System.setProperty("webdriver.chrome.driver","Driver2/chromedriver.exe"); 
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("file:///C:/Users/GAURI/Desktop/Offline%20website/index.html");
	  String actualTitle=driver.getTitle(); String
	  expectedTitle="JavaByKiran | Log in";
	  Assert.assertEquals(actualTitle,expectedTitle); 
}
}
