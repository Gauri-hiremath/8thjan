package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	/*
	 * WebDriver driver;
	 * 
	 * @Test public void test1() {
	 *  System.setProperty("webdriver.chrome.driver","Driver2/chromedriver.exe"); 
	 * driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.get("file:///C:/Users/GAURI/Desktop/Offline%20website/index.html");
	 * String actualTitle=driver.getTitle(); String
	 * expectedTitle="JavaByKiran | Log in"; Assert.assertEquals(actualTitle,
	 * expectedTitle); }
	 * 
	 * @Test public void test2(){ System.setProperty("webdriver.chrome.driver",
	 * "Driver2/chromedriver.exe"); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.get("file:///C:/Users/GAURI/Desktop/Offline%20website/index.html");
	 * String actualTitle=driver.getTitle(); String
	 * expectedTitle="JavaByKiran | Log in"; Assert.assertEquals(actualTitle,
	 * expectedTitle); }
	 */
	public static WebDriver driver;
	LoginPage lp=null;
	//SDET----software developer eng. in Test
	@Test
	public void loginTest() {
		
		System.setProperty("webdriver.chrome.driver","Driver2/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("file:///C:/Users/GAURI/Desktop/Offline%20website/index.html");
		
		lp= new LoginPage(driver);
		
		lp.enterUserName("kiran@gmail.com");
		
		lp.enterPassword("123456");
		
		lp.clickLoginButton();
		
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Dashboard";
		Assert.assertEquals(actTitle, expTitle);
		
	}
}