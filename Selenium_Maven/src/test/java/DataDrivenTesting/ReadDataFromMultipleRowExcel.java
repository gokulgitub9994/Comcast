package DataDrivenTesting;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromMultipleRowExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fIs  = new FileInputStream("C:\\Users\\T470\\OneDrive\\Desktop\\TestScriptData\\org.xlsx");
		
		Workbook wb = WorkbookFactory.create(fIs);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int rowCount = sh.getLastRowNum();
		
		for(int i = 1; i<= rowCount; i++) {
			Row r = sh.getRow(i);
			String  col1Data  = r.getCell(0).toString();
			String  col2Data  = r.getCell(1).toString();
			System.out.println(col1Data+"\t "+col2Data);
		
		}
		
		wb.close();
	}

}
