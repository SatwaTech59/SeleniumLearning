package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkingWithExcelFiles {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/sudhananda/59/59Selenium/DataFiles/TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet  sheet =   wb.getSheet("Data");
		XSSFRow  row = sheet.getRow(2);
		XSSFCell cell =  row.getCell(3);
		
		System.out.println(cell.toString());
		
		wb.close();
		
		
	}

}
