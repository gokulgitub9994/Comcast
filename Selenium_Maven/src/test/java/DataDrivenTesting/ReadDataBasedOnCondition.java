package DataDrivenTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataBasedOnCondition {

	public static void main(String[] args) throws Throwable {
		
		String expectedId = "4";
		boolean flag = false;
		String data1=null,data2 = null,data3= null;
		
		
		FileInputStream fIs = new FileInputStream("C:\\Users\\T470\\OneDrive\\Desktop\\TestScriptData\\org.xlsx");
		
		Workbook wb = WorkbookFactory.create(fIs);
		
		Sheet    sh = wb.getSheet("Sheet1");
		
	   int rowCount = sh.getLastRowNum();
	   
	   for(int i = 1; i<= rowCount; i++) {
		   String data = " ";
		   try {
			    data = sh.getRow(i).getCell(0).toString();
			    //System.out.println(data);
			   if(data.equals(expectedId)) {
				   flag = true;
				    data1 = sh.getRow(i).getCell(1).toString();
				    data2 = sh.getRow(i).getCell(2).toString();
				    data3 = sh.getRow(i).getCell(3).toString();
			   }	
			}
			catch(Exception e) {
				System.out.println("handled");   
		   }
		  
	   }
		   
	   if(flag == true) {
		   
		   System.out.println(data1);
		   System.out.println(data2);
		   System.out.println(data3); 
	   }else {
		   System.out.println(expectedId+"is not available!!");
	   }
	   
	   wb.close();
		  
	   

	}

}
