package com.test;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class POI_read1 {
		WebDriver driver;
		Workbook wb=null;
		Sheet sh=null;
		Cell cell=null;
		
		@Test(priority=-1)
		public void openSheet() throws Exception{
			FileInputStream fis = new FileInputStream("Userdata1.xls");
			 wb = WorkbookFactory.create(fis);
			 sh = wb.getSheet("login");//login
			 int row = sh.getPhysicalNumberOfRows();
			 int col= sh.getRow(row-1).getPhysicalNumberOfCells();
			 for(int i=1;i<row;i++) {
				 for(int j=0;j<col;j++) {
					 Cell cell=sh.getRow(i).getCell(j);
					 System.out.println(cell.toString()+ " ");
					 }
				 System.out.println();
			 }
		}
	}
		
/*		@Test
		public void loginTest() throws Exception{
			System.setProperty("webdriver.chrome.driver", "Driver2/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("file:///C:/Users/GAURI/Desktop/Offline%20website/pages/examples/register.html");
			int row = sh.getPhysicalNumberOfRows();//4
			for(int i=1;i<row-1;i++) {
				Thread.sleep(3000);
			driver.findElement(By.id("name")).sendKeys(sh.getRow(i).getCell(0).toString());
			String mobileno=sh.getRow(i).getCell(1).toString().substring(0,9);
			driver.findElement(By.id("mobile")).sendKeys(mobileno);
			driver.findElement(By.id("email")).sendKeys(sh.getRow(i).getCell(2).toString());
			String pass=sh.getRow(i).getCell(3).toString().substring(0,7);
            driver.findElement(By.id("password")).sendKeys(pass);
			driver.findElement(By.xpath("//button")).click();*/
			
		
			
			/*
			 * if(driver.getTitle().equals("JavaByKiran | Dashboard"))
			 * driver.findElement(By.linkText("LOGOUT")).click(); else {
			 * driver.findElement(By.id("password")).clear();
			 * driver.findElement(By.id("email")).clear(); }
			 */
	

