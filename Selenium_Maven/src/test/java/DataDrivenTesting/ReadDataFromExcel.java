package DataDrivenTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		
		//step:1 get the Excel path & java object 
		FileInputStream fIs = new FileInputStream("C:\\Users\\T470\\OneDrive\\Desktop\\TestScriptData\\org.xlsx");
		
		//Open workbook in Read mode
	    Workbook wb = WorkbookFactory.create(fIs);
	    
	    
	    //get control of sheet
	    Sheet sh = wb.getSheet("Sheet1");
	    
	    //get control of row 
	    Row r  = sh.getRow(1);
	   
	    //get control of cell & get data in the column
	    Cell cl = r.getCell(1);
	    
	    String data = cl.getStringCellValue();
	    System.out.println(data);
	    
	    //close the workbook
	    wb.close();
	    
	    
	                 

	}

}
