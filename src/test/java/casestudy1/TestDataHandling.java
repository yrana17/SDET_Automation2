package casestudy1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataHandling {

	@SuppressWarnings("resource")
	public ArrayList<HashMap<String, String>> readInputs(String FileName, String SheetName) {

		ArrayList<HashMap<String, String>> lst = new ArrayList<HashMap<String, String>>();
		try {
			FileInputStream fis = new FileInputStream(new File(FileName));
			Workbook wb = null;
			String ext = FileName.substring(FileName.indexOf("."));
			if (ext.equals(".xlsx"))
				wb = new XSSFWorkbook(fis);
			else
				wb = new HSSFWorkbook(fis);

			Sheet sh = wb.getSheet(SheetName);
			int rowcnt = sh.getPhysicalNumberOfRows();
			System.out.println("Row Count:" + rowcnt);
			int colCnt = sh.getRow(0).getLastCellNum();

			for (int i = 1; i < rowcnt; i++) {

				HashMap<String, String> hm = new HashMap<String, String>();
				for (int j = 0; j < colCnt; j++) {
					hm.put(sh.getRow(0).getCell(j).toString(), sh.getRow(i).getCell(j).toString());
				}
				lst.add(hm);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;

	}

	public void writeData(String FileName, String SheetName,ArrayList<HashMap<String, String>> lst) {

		try {
			File fl = new File(FileName);
			FileInputStream inputStream = new FileInputStream(fl);
			String fileEtensionName = FileName.substring(FileName.indexOf("."));
			Workbook workbook = null;
			if (fileEtensionName.equals(".xlsx"))
				workbook = new XSSFWorkbook(inputStream);
			else if (fileEtensionName.equals(".xls"))
				workbook = new HSSFWorkbook(inputStream);

			Sheet sh = workbook.getSheet(SheetName);

			for (int i = 0; i < lst.size(); i++) {
				Row rw = sh.createRow(i);
				HashMap<String, String> hm = lst.get(i);

				int col = 0;
				for (String k : hm.keySet()) {

					rw.createCell(col).setCellValue(hm.get(k));
					col = col + 1;
				}
			}

			inputStream.close();

			FileOutputStream fos = new FileOutputStream(fl);
			workbook.write(fos);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	public Properties getProperties(String filePath) throws IOException
	{
		Properties p = new Properties();
		InputStream inputStream = new FileInputStream(filePath);
		p.load(inputStream);
		return p;
	}
	
	
}
