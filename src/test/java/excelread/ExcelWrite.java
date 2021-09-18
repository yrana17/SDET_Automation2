package excelread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

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

		Sheet sh = wb.getSheet(sheetName);

		int rowcnt = sh.getPhysicalNumberOfRows();

		sh.createRow(rowcnt).createCell(0).setCellValue("Test8");
		sh.getRow(rowcnt).createCell(1).setCellValue("E0008");

		sh.getRow(3).getCell(2).setCellValue("E0008");
		fis.close();

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();

	}

}
