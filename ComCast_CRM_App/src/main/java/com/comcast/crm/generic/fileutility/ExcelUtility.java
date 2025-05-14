package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getDataFromExcel(String sheetName,int rowNum, int colNum) throws Throwable {
		
		FileInputStream fIs1 = new FileInputStream("C:\\Users\\T470\\eclipse-workspace\\ComCast_CRM_App\\target\\org.xlsx");
				 Workbook wb =	WorkbookFactory.create(fIs1);
				 Sheet	  sh = wb.getSheet(sheetName);
				 Row 	  r  = sh.getRow(rowNum);
				 Cell     cl = r.getCell(colNum);
				 String data = cl.getStringCellValue();
				 wb.close();
				 return data;
	}	
	
	public int  getRowCount(String sheetName) throws Throwable {
		FileInputStream fIs1 = new FileInputStream("C:\\Users\\T470\\eclipse-workspace\\ComCast_CRM_App\\target\\org.xlsx");
		 Workbook wb =	WorkbookFactory.create(fIs1);
		 int rowNum  = wb.getSheet(sheetName).getLastRowNum();
		 wb.close();
		 return rowNum;
	}
	
	public void setDataIntoExcel(String sheetName,int rowNum, int colNum) throws Throwable {
		FileInputStream fIs1 = new FileInputStream("C:\\Users\\T470\\eclipse-workspace\\ComCast_CRM_App\\target\\org.xlsx");
		 Workbook wb =	WorkbookFactory.create(fIs1);
		 wb.getSheet(sheetName).getRow(rowNum).createCell(colNum);
		 
		 FileOutputStream fOs = new FileOutputStream("C:\\\\Users\\\\T470\\\\eclipse-workspace\\\\ComCast_CRM_App\\\\target\\\\org.xlsx");
		 wb.write(fOs);
		 wb.close();
		 
		
	}
}
