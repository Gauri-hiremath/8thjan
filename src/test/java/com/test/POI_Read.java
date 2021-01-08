package com.test;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POI_Read {
	
@Test
public void test1() throws Exception {
	FileInputStream fis = new FileInputStream("Userdata.xls");
	 Workbook wb= WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Login");
	
	  int row= sh.getPhysicalNumberOfRows(); int
	  col=sh.getRow(row-1).getPhysicalNumberOfCells();
	  
	 for(int i=0;i<row;i++) { for(int j=0;j<col;j++) {
	 
	  Cell cell= sh.getRow(i).getCell(j); System.out.println(cell.toString()+"  ");
	  } System.out.println(); }
	 
}


}
