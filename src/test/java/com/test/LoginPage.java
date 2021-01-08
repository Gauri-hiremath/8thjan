package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public static WebDriver driver=null;

public LoginPage(WebDriver driver){
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
     }
      
    @FindBy(id="email")
    private WebElement uname;
    
    @FindBy(id="password")
    private WebElement pass;
    
    @FindBy(xpath="//button")
    private WebElement loginButton;
    	
	private WebElement uname() {
		return driver.findElement(By.id("email"));
	}
	private WebElement pass() {
		return driver.findElement(By.id("password"));
	}
	private WebElement loginButton() {
		return driver.findElement(By.xpath("//button"));
	}
	
	public void enterUserName(String text) {
		
		uname().sendKeys(text);
	}
	
	public void enterPassword(String text) {
		
		pass().sendKeys(text);
	}

	public void clickLoginButton() {
		
		loginButton().click();
	}	
}
