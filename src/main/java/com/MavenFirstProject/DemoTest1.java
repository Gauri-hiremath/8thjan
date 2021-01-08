package com.MavenFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

     public class DemoTest1 {
    	 WebDriver driver;
    	 public static LoginPage1 lp=null;
    		public static DashboardPage dp=null;
     @BeforeSuite
     public void login() {
		System.setProperty("webdriver.chrome.driver","Driver2/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("file:///C:/Users/GAURI/Desktop/Offline%20website/index.html");
		lp= new LoginPage1(driver);
    		}

			/*
			 * @Test public void logintest() { lp= new LoginPage1(driver);
			 * lp.enterUserName("kiran@gmail.com"); lp.enterPassword("123456");
			 * lp.clickLoginButton();
			 * 
			 * String actTitle = driver.getTitle(); String expTitle =
			 * "JavaByKiran | Dashboard"; Assert.assertEquals(actTitle, expTitle); }
			 */
		@Test 
		public void logotest() { 
			Assert.assertTrue(lp.verifylogo()); 
			}
		@Test
		public void logintest1() {
			dp=lp.validlogin();
			Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
		}
		@Test
		public void verifyCourses() {
			dp.verifyCourses();
		}
     }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

