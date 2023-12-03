package parametriztion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String excelpath = System.getProperty("user.dir")+"\\ExcelData\\New Microsoft Excel Worksheet.xlsx";
	FileInputStream fis= new FileInputStream(excelpath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s = wb.getSheet("Sheet1");
	Row r = s.getRow(8);
	Cell c = r.getCell(1);
	CellType type = c.getCellType();
	System.out.println(type);
	//c.getNumericCellValue();
	String value = c.getStringCellValue();
	System.out.println(value);
	//Cell c=wb.getSheet("Sheet1").getRow(8).getCell(1);

}
}
