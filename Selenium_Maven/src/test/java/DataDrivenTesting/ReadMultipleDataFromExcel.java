package DataDrivenTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fIs  = new FileInputStream("");
		
		Workbook  wb = WorkbookFactory.create(fIs);
		
		Sheet sh = wb.getSheet("");
		
		int rowCount = sh.getLastRowNum();
		
		for(int i = 1; i<=rowCount; i++) {
			Row r = sh.getRow(i);
			String colData1 = r.getCell(0).toString();
			String colData2 = r.getCell(1).toString();
			System.out.println(colData1+ "\t" +colData2);
		}
		
		wb.close();
	}

}
