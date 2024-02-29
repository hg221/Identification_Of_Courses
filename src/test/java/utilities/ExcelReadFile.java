package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadFile {
	
	public static String[] readExcelData(String sheetName) throws IOException
	{
       String Path = "C:\\Users\\2303913\\eclipse-workspace\\IdentificationOfCourses\\testData\\readexcel.xlsx";
       FileInputStream file = new FileInputStream(Path);
	   @SuppressWarnings("resource")
	   XSSFWorkbook workBook = new XSSFWorkbook(file);
       XSSFSheet workSheet = workBook.getSheet(sheetName);
       int cellNo = workSheet.getRow(0).getLastCellNum();
       String cellValue[] = new String[cellNo];
       XSSFRow cRow = workSheet.getRow(0);
	   for(int c=0; c<cellNo; c++)
	    {
	 	  cellValue[c] = String.valueOf(cRow.getCell(c));
	    }
		return cellValue;
	}

}
