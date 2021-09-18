package excelread;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetExistance {

	public static void main(String[] args) throws IOException {


		String fileName = "src/main/resources/TestData.xlsx";
		String sheetName = "Info";

		File f = new File(fileName);
		FileInputStream fis = new FileInputStream(f);
		String extension = fileName.substring(fileName.indexOf("."));

		Workbook wb = null;

		if (extension.equals(".xlsx"))
			wb = new XSSFWorkbook(fis);
		else if (extension.equals(".xls"))
			wb = new HSSFWorkbook(fis);
		else
			System.out.println("Not a Excel Workbook");

		int n=wb.getNumberOfSheets();
		System.out.println("Total Sheets:"+n);
		
		for(int i=0;i<n;i++)
			System.out.println(wb.getSheetName(i));
		
		
		
		
	}

}
